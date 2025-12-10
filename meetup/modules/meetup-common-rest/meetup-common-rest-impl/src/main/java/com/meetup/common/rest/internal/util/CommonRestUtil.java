package com.meetup.common.rest.internal.util;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.meetup.common.rest.internal.dtos.APICallResponse;
import com.meetup.common.rest.internal.dtos.APIClientFactory;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

public class CommonRestUtil {
	
	@Context
	private HttpServletRequest httpServletRequest;
	private static final Log log = LogFactoryUtil.getLog(CommonRestUtil.class);
	
 

	private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();

	public static String getToken(String url) {
		try {
			String clientId = "id-1e5e56cd-2181-e97d-244f-75954d63a4d";
			String clientSecret = "secret-a4c34d85-7392-12ad-afc9-db4a4cb555b";

			String tokenUrl = url + "/o/oauth2/token";

			Map<String, String> params = Map.of("client_id", clientId, "client_secret", clientSecret, "grant_type",
					"client_credentials");

			String requestBody = params.entrySet().stream()
					.map(e -> URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8) + "="
							+ URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
					.collect(Collectors.joining("&"));

			HttpClient client = HttpClient.newHttpClient();

			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(tokenUrl))
					.header("Content-Type", "application/x-www-form-urlencoded")
					.POST(HttpRequest.BodyPublishers.ofString(requestBody)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			JSONObject responseJson = JSONFactoryUtil.createJSONObject(response.body());

			return responseJson.getString("access_token");
		} catch (Exception e) {
			log.error("Error fetching token: " + e.getMessage(), e);
			return null;
		}
	}
	 


	private static JSONObject postJson(String url, String accessToken, JSONObject payload) throws Exception {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + accessToken)
				.POST(HttpRequest.BodyPublishers.ofString(payload.toJSONString())).build();

		HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

		if (response.statusCode() < 200 || response.statusCode() >= 300) {
			log.error("POST " + url + " failed. Status: " + response.statusCode() + " Body: " + response.body());
			throw new RuntimeException("Request failed with status " + response.statusCode());
		}

		return JSONFactoryUtil.createJSONObject(response.body());
	}

	public static JSONObject createServiceBundleViaApi(String portalUrl, JSONObject bundleJson) throws Exception {

		String accessToken = getToken(portalUrl);

		if (accessToken == null) {
			throw new RuntimeException("Unable to fetch access token");
		}

		JSONObject servicePayload = JSONFactoryUtil.createJSONObject();

		servicePayload.put("serviceID", bundleJson.getString("serviceId"));
		servicePayload.put("serviceStatus", bundleJson.getString("serviceStatus"));
		servicePayload.put("sourceLocation", bundleJson.getString("sourceLocation"));
		servicePayload.put("destinationLocation", bundleJson.getString("destinationLocation"));
		servicePayload.put("variantName", bundleJson.getString("variantName"));
		servicePayload.put("serviceCategory", bundleJson.getString("serviceCategory"));
		servicePayload.put("interface", bundleJson.getString("interfaceType"));
		servicePayload.put("bandwidth", bundleJson.getString("bandwidth"));
		servicePayload.put("paymentTerms", bundleJson.getString("paymentTerms"));
		servicePayload.put("billingFrequency", bundleJson.getString("billingFrequency"));
		servicePayload.put("description", bundleJson.getString("description"));
		servicePayload.put("contractPeriod", bundleJson.getString("contractPeriod"));
		servicePayload.put("contractRenewal", bundleJson.getString("contractRenewal"));
		servicePayload.put("serviceType", bundleJson.getString("serviceType"));
		servicePayload.put("activationDate", bundleJson.getString("activationDate"));
		servicePayload.put("modificationDate", bundleJson.getString("modificationDate"));

		JSONObject serviceResponse = postJson(portalUrl + "/o/c/services", accessToken, servicePayload);

		long serviceObjectEntryId = serviceResponse.getLong("id");

		log.info("Created Service via API, id = " + serviceObjectEntryId);

		JSONArray ticketInputs = bundleJson.getJSONArray("tickets");

		JSONArray createdTickets = JSONFactoryUtil.createJSONArray();

		if (ticketInputs != null) {
			for (int i = 0; i < ticketInputs.length(); i++) {
				JSONObject ticketInput = ticketInputs.getJSONObject(i);

				JSONObject ticketPayload = JSONFactoryUtil.createJSONObject();
				ticketPayload.put("ticketID", ticketInput.getString("ticketID"));
				ticketPayload.put("subject", ticketInput.getString("subject"));
				ticketPayload.put("ticketStatus", ticketInput.getString("ticketStatus"));
				ticketPayload.put("date", ticketInput.getString("date"));
				ticketPayload.put("description", ticketInput.getString("description"));

				// relationship field from Ticket -> Service
				ticketPayload.put("r_ticketServiceId_c_serviceId", serviceObjectEntryId);

				JSONObject ticketResponse = postJson(portalUrl + "/o/c/tickets", accessToken, ticketPayload);

				createdTickets.put(ticketResponse);
			}
		}

		JSONArray schedInputs = bundleJson.getJSONArray("scheduleMaintenances");

		JSONArray createdSchedules = JSONFactoryUtil.createJSONArray();

		if (schedInputs != null) {
			for (int i = 0; i < schedInputs.length(); i++) {
				JSONObject schedInput = schedInputs.getJSONObject(i);

				JSONObject schedPayload = JSONFactoryUtil.createJSONObject();
				schedPayload.put("maintenanceID", schedInput.getString("maintenanceID"));
				schedPayload.put("impactType", schedInput.getString("impactType"));
				schedPayload.put("description", schedInput.getString("description"));
				schedPayload.put("plannedMaintenanceStartTime", schedInput.getString("plannedMaintenanceStartTime"));
				schedPayload.put("plannedMaintenanceEndTime", schedInput.getString("plannedMaintenanceEndTime"));
				schedPayload.put("actualStartTime", schedInput.getString("actualStartTime"));
				schedPayload.put("actualEndTime", schedInput.getString("actualEndTime"));
				schedPayload.put("maintenanceStatus", schedInput.getString("maintenanceStatus"));
				schedPayload.put("urgency", schedInput.getString("urgency"));

				// relationship field from ScheduleMaintenance -> Service
				schedPayload.put("r_serviceId_c_serviceId", serviceObjectEntryId);

				JSONObject schedResponse = postJson(portalUrl + "/o/c/schedulemaintenances", accessToken, schedPayload);

				createdSchedules.put(schedResponse);
			}
		}

		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("service", serviceResponse);
		result.put("tickets", createdTickets);
		result.put("scheduleMaintenances", createdSchedules);

		return result;
	}
	public static String getWithAuth(String fullUrl, String accessToken) throws Exception {
		
	    HttpClient client = HttpClient.newHttpClient();

	    HttpRequest request = HttpRequest.newBuilder()
	        .uri(URI.create(fullUrl))
	        .header("Authorization", "Bearer " + accessToken)
	        .header("Accept", "application/json")
	        .GET()
	        .build();

	    HttpResponse<String> response =
	        client.send(request, HttpResponse.BodyHandlers.ofString());

	    if (response.statusCode() < 200 || response.statusCode() >= 300) {
	        log.error(
	            "GET " + fullUrl + " failed. Status: " + response.statusCode() +
	            " Body: " + response.body());

	        throw new RuntimeException(
	            "GET request failed with status: " + response.statusCode());
	    }

	    return response.body();
	}

	

	public static JSONObject createServiceBundleViaApi(String portalUrl, String bundleJsonString) throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(bundleJsonString);
		return createServiceBundleViaApi(portalUrl, jsonObject);
	}

	public  static JSONObject getEntityList(String propsData, Integer userId, Integer siteId,
			HttpServletRequest httpServletRequest) throws PortalException {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();
		try {
			JSONObject propsDataObj = JSONFactoryUtil.createJSONObject(propsData);

			String entityListApiResponse;
			boolean isAuditLog;
			boolean isImpersonation;
			if (Validator.isNotNull(propsDataObj) && propsDataObj.length() != BigDecimal.ZERO.intValue()) {
				entityListApiResponse = getEntityResponse(propsDataObj);
				isAuditLog = propsDataObj.getBoolean(MeetUpConstants.IS_AUDIT_LOG, Boolean.FALSE);
				isImpersonation = propsDataObj.getBoolean(MeetUpConstants.IS_IMPERSONATION, Boolean.FALSE);
			} else {
				entityListApiResponse = getEntityResponse(propsDataObj);
				isAuditLog = propsDataObj.getBoolean(MeetUpConstants.IS_AUDIT_LOG, Boolean.FALSE);
				isImpersonation = propsDataObj.getBoolean(MeetUpConstants.IS_IMPERSONATION, Boolean.FALSE);
			}

			if (Validator.isNotNull(entityListApiResponse)) {
				return handleEntityListResponse(entityListApiResponse, propsDataObj, isAuditLog, isImpersonation,
						userId, siteId, httpServletRequest);
			} else {
				responseJson.put(MeetUpConstants.ERR_MESSAGE, MeetUpConstants.NO_ENTITIES);
			}
		} catch (JSONException e) {
			log.error(MeetUpConstants.UNABLE_TO_CREATE_JSON_OBJECT_FROM_API_RESPONSE);
			log.error(e);
		}
		return responseJson;
	}

	private static JSONObject handleEntityListResponse(String entityListApiResponse, JSONObject updatedPropsDataObj,
			boolean isAuditLog, boolean isImpersonation, Integer userId, Integer siteId,
			HttpServletRequest httpServletRequest) throws JSONException {
		JSONObject responseJson = JSONFactoryUtil.createJSONObject();

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(entityListApiResponse);
		JSONArray itemsArray = jsonObject.getJSONArray(MeetUpConstants.ITEMS);
		JSONArray facetsArray = JSONFactoryUtil.createJSONArray();
		boolean isResponseTypeObject = updatedPropsDataObj.getBoolean("isResponseTypeObject", false);

		if (isResponseTypeObject) {
			return jsonObject;
		}
		if (jsonObject.has(MeetUpConstants.FECETS)) {
			facetsArray = jsonObject.getJSONArray(MeetUpConstants.FECETS);
		}

		if (itemsArray.length() > 0) {
			Map<Long, JSONObject> userDetailsCache = new HashMap<>();

			for (int i = 0; i < itemsArray.length(); i++) {
				JSONObject itemObj = itemsArray.getJSONObject(i);
				long primaryUserId = itemObj.getLong(MeetUpConstants.PRIMARY_USER_ID);
				long portalOrgSiteId = itemObj.getLong(MeetUpConstants.PORTAL_ORG_SITE_ID);

				if (isAuditLog) {
					long performedByUserId = itemObj.getLong("performedByUserId", userId);
					if (userDetailsCache.containsKey(performedByUserId)) {

						JSONObject cachedData = userDetailsCache.get(performedByUserId);

						for (String key : cachedData.keySet()) {
							itemObj.put(key, cachedData.get(key));
						}
					} else {
						JSONObject userJson = JSONFactoryUtil.createJSONObject();

					}
				}

			}
		} else {
			return responseJson.put(MeetUpConstants.ERR_MESSAGE, MeetUpConstants.NO_ENTITIES);

		}
		if (Validator.isNotNull(facetsArray) && facetsArray.length() > 0) {
			responseJson.put("facets", facetsArray);
		}

		responseJson.put(MeetUpConstants.ITEMS, itemsArray);
		responseJson.put(MeetUpConstants.PAGE, jsonObject.getLong(MeetUpConstants.PAGE));
		responseJson.put(MeetUpConstants.PAGE_SIZE, jsonObject.getLong(MeetUpConstants.PAGE_SIZE));
		responseJson.put(MeetUpConstants.LAST_PAGE, jsonObject.getLong(MeetUpConstants.LAST_PAGE));
		responseJson.put(MeetUpConstants.TOTAL_COUNT, jsonObject.getLong(MeetUpConstants.TOTAL_COUNT));

		return responseJson;
	}

	public static String getEntityResponse(JSONObject propsDataObj) throws PortalException {

		String portalURL = "http://localhost:8080";
		String entityDataURL = propsDataObj.getString("url");
		String apiBaseURL = portalURL + entityDataURL;

		String apiURL = apiBaseURL + getEntityQureryParams(propsDataObj);

		log.debug("============================ START ==========================================");

		log.debug("EntityResponse -> apiCallResponse -> URL : " + apiURL);

		String accessToken = getToken(portalURL);
		APICallResponse apiCallResponse;
		String entityListApiResponse = StringPool.BLANK;

		try {
			apiCallResponse = callGetApi(apiURL, accessToken);
			if (Validator.isNotNull(apiCallResponse)) {
				if (Validator.isNotNull(apiCallResponse.getResponseCode())) {
					log.debug("EntityResponse -> apiCallResponse -> Code : " + apiCallResponse.getResponseCode());
				}
				if (Validator.isNotNull(apiCallResponse.getErrorMessage())) {
					log.debug("EntityResponse -> apiCallResponse -> Error : " + apiCallResponse.getErrorMessage());
				}
				if (Validator.isNotNull(apiCallResponse.getResponseData())) {
					JSONObject responseDataObj = JSONFactoryUtil.createJSONObject(apiCallResponse.getResponseData());
					log.debug("EntityResponse -> apiCallResponse -> Data : " + responseDataObj);
				}

			}
			if (apiCallResponse.getResponseCode() == Response.Status.OK.getStatusCode()) {
				entityListApiResponse = apiCallResponse.getResponseData();
			}
		} catch (Exception e) {
			log.error(MeetUpConstants.ERROR_FETCHING_ENTITY_RESPONSE, e);
		} finally {
			log.debug("============================ END ============================================");
		}

		return entityListApiResponse;
	}

	public static String getEntityQureryParams(JSONObject propsDataObj) throws PortalException {

		Map<String, Object> entityParamsMap = getEntityParamsMap(propsDataObj);
		StringBuilder queryParamsBuilder = new StringBuilder();
		int ind = 0;

		for (Map.Entry<String, Object> paramEntry : entityParamsMap.entrySet()) {
			String queryParam = paramEntry.getKey() + StringPool.EQUAL
					+ HttpComponentsUtil.encodePath(paramEntry.getValue().toString());

			if (ind == 0) {
				queryParamsBuilder.append(StringPool.QUESTION).append(queryParam);
			} else {
				queryParamsBuilder.append(StringPool.AMPERSAND).append(queryParam);
			}
			ind++;
		}

		return StringUtil.replace(queryParamsBuilder.toString(), StringPool.PLUS, "%2B");
	}

	public static Map<String, Object> getEntityParamsMap(JSONObject propsDataObj) throws PortalException {

		String fields = getOptionalString(propsDataObj, MeetUpConstants.FIELDS);
		String nestedFields = getOptionalString(propsDataObj, MeetUpConstants.NESTED_FIELDS_PARAM);
		String nestedFieldsDepth = getOptionalString(propsDataObj, MeetUpConstants.NESTED_FIELDS_DEPTH);
		String aggregationTerms = getOptionalString(propsDataObj, MeetUpConstants.AGGREGRATION_TERMS);
		String restrictedFields = getOptionalString(propsDataObj, MeetUpConstants.RESTRICTED_FIELDS);
		String flatten = getOptionalString(propsDataObj, MeetUpConstants.FLATTEN);

		JSONArray screenFilters = getOptionalJSONArray(propsDataObj, MeetUpConstants.SCREEN_FILTERS);
		JSONArray sortFields = getOptionalJSONArray(propsDataObj, MeetUpConstants.SORT);
		int page = getOptionalInt(propsDataObj, MeetUpConstants.PAGE);
		int pageSize = getOptionalInt(propsDataObj, MeetUpConstants.PAGE_SIZE);
		String search = getOptionalString(propsDataObj, MeetUpConstants.SEARCH);

		Map<String, Object> paramsMap = new LinkedHashMap<>();

		if (Validator.isNotNull(fields)) {
			paramsMap.put(MeetUpConstants.FIELDS, fields);
		}

		if (Validator.isNotNull(nestedFields)) {
			paramsMap.put(MeetUpConstants.NESTED_FIELDS_PARAM, nestedFields);
		}

		if (Validator.isNotNull(nestedFieldsDepth)) {
			paramsMap.put(MeetUpConstants.NESTED_FIELDS_DEPTH, Integer.parseInt(nestedFieldsDepth));
		}

		if (Validator.isNotNull(restrictedFields)) {
			paramsMap.put(MeetUpConstants.RESTRICT_FIELDS_PARAM, restrictedFields);
		}

		if (Validator.isNotNull(flatten)) {
			paramsMap.put(MeetUpConstants.FLATTEN, flatten);
		}

		if (Validator.isNotNull(aggregationTerms)) {
			paramsMap.put(MeetUpConstants.AGGREGRATION_TERMS, aggregationTerms);
		}

		String filter = buildFilter(propsDataObj, screenFilters);

		if (Validator.isNotNull(filter)) {
			paramsMap.put(MeetUpConstants.FILTER, filter);
		}

		if (Validator.isNotNull(sortFields)) {
			String sort = getSort(sortFields);
			paramsMap.put(MeetUpConstants.SORT, sort);
		}

		if (Validator.isNotNull(page) && page > 0) {
			paramsMap.put(MeetUpConstants.PAGE, page);
		}

		if (Validator.isNotNull(pageSize) && pageSize >= -1) {
			paramsMap.put(MeetUpConstants.PAGE_SIZE, pageSize);
		}

		if (Validator.isNotNull(search)) {
			paramsMap.put(MeetUpConstants.SEARCH, search);
		}

		return paramsMap;
	}

	private static String getOptionalString(JSONObject obj, String key) {
		return !obj.isNull(key) ? obj.getString(key, StringPool.BLANK) : StringPool.BLANK;
	}

	private static String buildFilter(JSONObject propsDataObj, JSONArray screenFilters) {
		Object filtersObj = propsDataObj.opt(MeetUpConstants.FILTERS);
		Object filtersLogicalOperatorObj = propsDataObj.opt(MeetUpConstants.FILTERS_LOGICAL_OPERATOR);
		Object screenFiltersLogicalOperatorObj = propsDataObj
				.opt(MeetUpConstants.SCREEN_FILTERS_LOGICAL_OPERATOR);
		if (filtersObj instanceof JSONObject jsonObject) {
			return getAllFilters(jsonObject, screenFilters, screenFiltersLogicalOperatorObj);
		} else if (filtersObj instanceof JSONArray jsonArray) {
			return getAllFilters(jsonArray, screenFilters, filtersLogicalOperatorObj, screenFiltersLogicalOperatorObj);
		}
		return StringPool.BLANK;
	}

	public static String getAllFilters(JSONObject filters, JSONArray screenFilters, Object screenFiltersLogicalOperatorObj) {

		String screenFiltersLogicalOperator = Validator.isNotNull(screenFiltersLogicalOperatorObj)
				&& (screenFiltersLogicalOperatorObj instanceof String screenFiltersLogicalOp) ? screenFiltersLogicalOp
						: MeetUpConstants.AND;

		String filterStr = Validator.isNotNull(filters) && filters.length() > 0
				? getFilter(filters.getJSONArray(MeetUpConstants.FIELDS),
						filters.getString(MeetUpConstants.LOGICAL_OPERATOR))
				: StringPool.BLANK;

		String screenFiltersStr = (Validator.isNotNull(screenFilters) && screenFilters.length() > 0)
				? buildScreenFilters(screenFilters, screenFiltersLogicalOperator)
				: StringPool.BLANK;

		// Combine filterStr and screenFiltersStr
		if (Validator.isNotNull(filterStr) && Validator.isNotNull(screenFiltersStr)) {
			return filterStr + StringPool.SPACE + MeetUpConstants.AND + StringPool.SPACE
					+ StringPool.OPEN_PARENTHESIS + screenFiltersStr + StringPool.CLOSE_PARENTHESIS;
		} else if (Validator.isNotNull(filterStr)) {
			return filterStr;
		} else if (Validator.isNotNull(screenFiltersStr)) {
			return screenFiltersStr;
		}

		return StringPool.BLANK;
	}

	private static String buildScreenFilters(JSONArray screenFilters, String screenFiltersLogicalOp) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < screenFilters.length(); i++) {
			JSONObject screenFilterObj = screenFilters.getJSONObject(i);
			String screenFilterOp = screenFilterObj.getString(MeetUpConstants.LOGICAL_OPERATOR);
			JSONArray screenFilterFields = screenFilterObj.getJSONArray(MeetUpConstants.FIELDS);

			if (Validator.isNotNull(screenFilterFields) && screenFilterFields.length() > 0) {
				String screenFilter = getFilter(screenFilterFields, screenFilterOp);
				log.info("screenFilter : " + screenFilter);

				if (builder.length() > 0) {
					builder.append(" " + screenFiltersLogicalOp + " ");
				}

				builder.append(screenFilter);
			}
		}

		return builder.toString();
	}

	public static String getFilter(JSONArray filterFields, String logicalOperator) {
		if (Validator.isNull(filterFields) || filterFields.length() == 0) {
			return wrapWithParentheses("");
		}

		StringBuilder queryFiltersBuilder = new StringBuilder();

		for (int i = 0; i < filterFields.length(); i++) {
			JSONObject filterFieldObj = filterFields.getJSONObject(i);

			String filterClause = buildFilterClause(filterFieldObj);
			if (Validator.isNotNull(filterClause)) {
				queryFiltersBuilder.append(filterClause);

				if (i < filterFields.length() - 1) {
					queryFiltersBuilder.append(StringPool.SPACE).append(logicalOperator).append(StringPool.SPACE);
				}
			}
		}

		return wrapWithParentheses(queryFiltersBuilder.toString());
	}

	private static String buildFilterClause(JSONObject filterFieldObj) {
		String key = filterFieldObj.getString(MeetUpConstants.KEY);
		String operator = filterFieldObj.getString(MeetUpConstants.OPERATOR);
		Object value = filterFieldObj.get(MeetUpConstants.VALUE);

		if (Validator.isNull(key) || Validator.isNull(operator)) {
			return null;
		}

		if (isFunctionOperator(operator)) {
			return wrapWithParentheses(operator + StringPool.OPEN_PARENTHESIS + key + StringPool.COMMA + value
					+ StringPool.CLOSE_PARENTHESIS);
		} else {
			return wrapWithParentheses(key + StringPool.SPACE + operator + StringPool.SPACE + value);
		}
	}

	private static String wrapWithParentheses(String input) {
		return StringPool.OPEN_PARENTHESIS + input + StringPool.CLOSE_PARENTHESIS;
	}

	private static boolean isFunctionOperator(String operator) {
		return "contains".equals(operator) || "startswith".equals(operator);
	}

	private static JSONArray getOptionalJSONArray(JSONObject obj, String key) {
		return !obj.isNull(key) ? obj.getJSONArray(key) : null;
	}

	private static int getOptionalInt(JSONObject obj, String key) {
		return !obj.isNull(key) ? obj.getInt(key, 0) : 0;
	}

	public static String getSort(JSONArray sortFields) {

		StringBuilder querySortBuilder = new StringBuilder();

		if (Validator.isNotNull(sortFields) && sortFields.length() > 0) {
			for (int i = 0; i < sortFields.length(); i++) {
				JSONObject sortFieldObj = sortFields.getJSONObject(i);
				String sortKey = sortFieldObj.getString(MeetUpConstants.KEY);
				String sortOrder = sortFieldObj.getString(MeetUpConstants.ORDER);

				if (Validator.isNotNull(sortKey)) {
					querySortBuilder.append(sortKey);
					if (Validator.isNotNull(sortOrder)) {
						querySortBuilder.append(StringPool.COLON).append(sortOrder);
					}
					querySortBuilder.append(StringPool.COMMA);
				}
			}
		}

		String querySort = querySortBuilder.toString();
		if (Validator.isNotNull(querySort) && querySort.endsWith(StringPool.COMMA)) {
			querySort = querySort.substring(0, querySort.lastIndexOf(StringPool.COMMA));
		}

		return querySort;
	}

	public static String getAllFilters(JSONArray filters, JSONArray screenFilters, Object filtersLogicalOperatorObj,
			Object screenFiltersLogicalOperatorObj) {

		String filter = StringPool.BLANK;

		String filtersLogicalOperator = Validator.isNotNull(filtersLogicalOperatorObj)
				&& (filtersLogicalOperatorObj instanceof String filterLogicalOp) ? filterLogicalOp
						: MeetUpConstants.AND;

		String screenFiltersLogicalOperator = Validator.isNotNull(filtersLogicalOperatorObj)
				&& (screenFiltersLogicalOperatorObj instanceof String screenFiltersLogicalOp) ? screenFiltersLogicalOp
						: MeetUpConstants.AND;

		String filterStr = Validator.isNotNull(filters) ? buildFilterString(filters, filtersLogicalOperator)
				: StringPool.BLANK;
		String screenFiltersStr = Validator.isNotNull(screenFilters)
				? buildScreenFilterString(screenFilters, screenFiltersLogicalOperator)
				: StringPool.BLANK;

		if (!filterStr.isEmpty() && !screenFiltersStr.isEmpty()) {
			filter = filterStr + " " + MeetUpConstants.AND + " (" + screenFiltersStr + ")";
		} else if (!filterStr.isEmpty()) {
			filter = filterStr;
		} else if (!screenFiltersStr.isEmpty()) {
			filter = screenFiltersStr;
		}

		return filter;

	}

	private static String buildFilterString(String key, Object value) {
		if (value instanceof Long) {
			return key + MeetUpConstants.FILTER_EQUALS + value;
		} else {
			return key + MeetUpConstants.FILTER_EQUALS_STRING + value + "'";
		}
	}
	private static String buildFilterString(JSONArray filters, String filterLogicalOp) {
	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < filters.length(); i++) {
	        JSONObject filterObj = filters.getJSONObject(i);
	        String filterOp = filterObj.getString(MeetUpConstants.LOGICAL_OPERATOR);
	        JSONArray filterFields = filterObj.getJSONArray(MeetUpConstants.FIELDS);
	        String tempFilter = getFilter(filterFields, filterOp);
	        log.info("tempFilter : " + tempFilter);

	        builder.append(tempFilter);
	        if (i < filters.length() - 1) {
	            builder.append(" ").append(filterLogicalOp).append(" ");
	        }
	    }
	    return builder.toString();
	}

	private static String buildScreenFilterString(JSONArray screenFilters, String screenFilterLogicalOp) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < screenFilters.length(); i++) {
			JSONObject filterObj = screenFilters.getJSONObject(i);
			String filterOp = filterObj.getString(MeetUpConstants.LOGICAL_OPERATOR);
			JSONArray filterFields = filterObj.getJSONArray(MeetUpConstants.FIELDS);
			String tempFilter = getFilter(filterFields, filterOp);
			log.info("tempFilter : " + tempFilter);

			builder.append(tempFilter);
			if (i < screenFilters.length() - 1) {
				builder.append(" ").append(screenFilterLogicalOp).append(" ");
			}
		}
		return builder.toString();
	}
	
	public static APICallResponse callGetApi(String url, String accessToken) throws  SystemException {
		return APIClientFactory.getInstance().executeGet(url, accessToken);
	}

}
