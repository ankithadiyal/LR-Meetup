package com.meetup.common.rest.internal.dtos;


 
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.Validator;
import com.meetup.common.rest.internal.util.MeetUpConstants;
import com.meetup.common.rest.internal.util.MultiPartAPIUtil;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * The Class HttpAPIClient.
 * 
 * @author aixtor
 */
public class HttpAPIClient implements APIClient {
	
	/** The Constant _log. */
	private static final  Log _log  = LogFactoryUtil.getLog(HttpAPIClient.class);
	
	/**
	 * Gets the access token.
	 *
	 * @param tokenURL the token URL
	 * @param clientId the client id
	 * @param clientSecret the client secret
	 * @return the access token
	 */
	@Override
	public APICallResponse getAccessToken(String tokenURL, String clientId, String clientSecret) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			options.setPost(Boolean.TRUE);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_X_WWW_FORM_URLENCODED);
			
			String body = "grant_type=client_credentials" + "&client_id=" + clientId + "&client_secret=" + clientSecret;

			options.setBody(body, ContentTypes.APPLICATION_X_WWW_FORM_URLENCODED, MeetUpConstants.UTF_8);
			options.setLocation(tokenURL);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
		
	}
	
	@Override
	public APICallResponse getPowerBIAccessToken(String tokenURL, String clientId, String clientSecret, String scope) throws SystemException {
		
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			options.setPost(Boolean.TRUE);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_X_WWW_FORM_URLENCODED);
			
			String body = "grant_type=client_credentials" + "&client_id=" + clientId + "&client_secret=" + clientSecret + "&scope=" + scope;

			options.setBody(body, ContentTypes.APPLICATION_X_WWW_FORM_URLENCODED, MeetUpConstants.UTF_8);
			options.setLocation(tokenURL);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
		
	}
	
	@Override
	public APICallResponse getPowerBIReportInfo(String reportURL, String accessToken) throws SystemException {
		
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			
			options.setLocation(reportURL);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
		
	}
	
	@Override
	public APICallResponse getPowerBIReportEmbedToken(String reportEmbedTokenURL, String accessToken, String requestJson) throws SystemException {
		
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			
			options.setBody(requestJson, ContentTypes.APPLICATION_JSON, MeetUpConstants.UTF_8);
			options.setPost(Boolean.TRUE);
			options.setLocation(reportEmbedTokenURL);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
		
	}
	
	/**
	 * Execute get.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	@Override
	public APICallResponse executeGet(String url, String accessToken) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			_log.info("url: " + url);
			_log.info("accessToken: " + accessToken);

			options.setPost(false);
			options.addHeader(MeetUpConstants.ACCEPT, ContentTypes.APPLICATION_JSON);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + accessToken);
			options.setLocation(url);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		return returnResponse;
	}
	
	@Override
	public APICallResponse executeMWGet(String url, String accessToken, Map<String, String> headersMap) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			
			options.setPost(false);
			options.addHeader(MeetUpConstants.ACCEPT, ContentTypes.APPLICATION_JSON);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			
			for (Map.Entry<String, String> headerMapEntry : headersMap.entrySet()) {
				options.addHeader(headerMapEntry.getKey(), headerMapEntry.getValue());
			}
			
			options.setLocation(url);
			options.setTimeout(300000);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
	}

	/**
	 * Execute post.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @param requestJson the request json
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	@Override
	public APICallResponse executePost(String url, String accessToken, String requestJson) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			
			options.setPost(Boolean.TRUE);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			options.setBody(requestJson, ContentTypes.APPLICATION_JSON, MeetUpConstants.UTF_8);
			options.setLocation(url);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		}  
		
		return returnResponse;
	}
	
	/**
	 * Execute put.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @param requestJson the request json
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	@Override
	public APICallResponse executePut(String url, String accessToken, String requestJson) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			
			options.setPut(Boolean.TRUE);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			options.setBody(requestJson, ContentTypes.APPLICATION_JSON, MeetUpConstants.UTF_8);
			options.setLocation(url);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
	}
	
	/**
	 * Execute delete.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	@Override
	public APICallResponse executeDelete(String url, String accessToken) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			options.setMethod(Http.Method.DELETE);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			options.setLocation(url);
			
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		}
		
		return returnResponse;
	}
	
	@Override
	public APICallResponse executePatch(String url, String accessToken, String requestJson) throws SystemException {
		Http.Options options = new Http.Options();
		APICallResponse returnResponse = new APICallResponse();
		
		try {
			
			options.setPatch(Boolean.TRUE);
			options.addHeader(MeetUpConstants.AUTHORIZATION, MeetUpConstants.BEARER + StringPool.SPACE + accessToken);
			options.addHeader(MeetUpConstants.CONTENT_TYPE, ContentTypes.APPLICATION_JSON);
			options.setBody(requestJson, ContentTypes.APPLICATION_JSON, MeetUpConstants.UTF_8);
			options.setLocation(url);
			populateHttpResponse(options, returnResponse);
			
		}catch (IOException | SystemException e) {
			throw new SystemException(e);
		} 
		
		return returnResponse;
	}

	
	
	/**
	 * Execute multi part post.
	 *
	 * @param url the url
	 * @param params the params
	 * @param fileParams the file params
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	@Override
	public APICallResponse executeMultiPartPost(String url, Map<String, String> params, Map<String, File> fileParams) throws SystemException {
		APICallResponse returnResponse = new APICallResponse();
		try {
			
			MultiPartAPIUtil multiPartAPIUtil = new MultiPartAPIUtil(url);
            
			multiPartAPIUtil = addFormFields(multiPartAPIUtil, params);
			multiPartAPIUtil = addFileParts(multiPartAPIUtil, fileParams);
           
			String response = StringPool.BLANK;
            List<String> responseList = multiPartAPIUtil.finish();
            
            if(Validator.isNotNull(responseList) && !responseList.isEmpty()) {
            	response = responseList.get(0);
            }
           
			_log.info("API response : " + response);
			JSONObject responseObj = JSONFactoryUtil.createJSONObject(response);
			
			int responseCode = responseObj.getInt("responseCode");
			
			if(responseCode == MeetUpConstants.STATUS_OK) {
				String responseData =  Validator.isNotNull(responseObj.get("data")) ? responseObj.getString("data") 
						: StringPool.BLANK;
				returnResponse.setResponseCode(responseCode);
				returnResponse.setResponseData(responseData);
			}else {
				String error =  Validator.isNotNull(responseObj.get("error")) ? responseObj.getString("error") 
						: StringPool.BLANK;
				returnResponse.setResponseCode(responseCode);
				returnResponse.setErrorMessage(error);
			}
			
		} catch (IOException | SystemException | JSONException e) {
			throw new SystemException(e);
		}  
		
		return returnResponse;
	}
	
	/**
	 * Adds the form fields.
	 *
	 * @param multiPartAPIUtil the multi part API util
	 * @param params the params
	 * @return the multi part API util
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static MultiPartAPIUtil addFormFields(MultiPartAPIUtil multiPartAPIUtil, Map<String, String> params){
		if(Validator.isNotNull(params) && params.size() > 0) {
			for (Map.Entry<String, String> paramEntry : params.entrySet()) {
				multiPartAPIUtil.addFormField(paramEntry.getKey(), paramEntry.getValue());
			}
		}
		return multiPartAPIUtil;
	}
	
	/**
	 * Adds the file parts.
	 *
	 * @param multiPartAPIUtil the multi part API util
	 * @param fileParams the file params
	 * @return the multi part API util
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private static MultiPartAPIUtil addFileParts(MultiPartAPIUtil multiPartAPIUtil, Map<String, File> fileParams) throws IOException{
		if(Validator.isNotNull(fileParams) && fileParams.size() > 0) {
			for (Map.Entry<String, File> fileParamEntry : fileParams.entrySet()) {
				multiPartAPIUtil.addFilePart(fileParamEntry.getKey(), fileParamEntry.getValue());
			}
		}
		return multiPartAPIUtil;
	}
	
	private void populateHttpResponse(Http.Options options, APICallResponse returnResponse) throws IOException {

		String responseData = HttpUtil.URLtoString(options);
	    Http.Response httpResponse = options.getResponse();

	    returnResponse.setResponseCode(httpResponse.getResponseCode());
	    returnResponse.setResponseContentLength(httpResponse.getContentLength());
	    returnResponse.setResponseContentType(httpResponse.getContentType());
	    returnResponse.setResponseHeaders(httpResponse.getHeaders());
	    returnResponse.setResponseRedirect(httpResponse.getRedirect());
	    returnResponse.setResponseData(responseData);
	}

	
	/**private void populateHttpResponse(Http.Options options, APICallResponse returnResponse) throws IOException {
	    String responseData = HttpUtil.URLtoString(options);
	    Http.Response httpResponse = options.getResponse();

	    returnResponse.setResponseCode(httpResponse.getResponseCode());
	    returnResponse.setResponseContentLength(httpResponse.getContentLength());
	    returnResponse.setResponseContentType(httpResponse.getContentType());
	    returnResponse.setResponseHeaders(httpResponse.getHeaders());
	    returnResponse.setResponseRedirect(httpResponse.getRedirect());
	    returnResponse.setResponseData(responseData);
	}**/

}
