package com.meetup.common.rest.resource.v1_0_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.TransformUtil;

import com.meetup.common.rest.client.dto.v1_0_0.Response;
import com.meetup.common.rest.client.dto.v1_0_0.Service;
import com.meetup.common.rest.client.http.HttpInvoker;
import com.meetup.common.rest.client.pagination.Page;
import com.meetup.common.rest.client.resource.v1_0_0.ServiceResource;
import com.meetup.common.rest.client.serdes.v1_0_0.ServiceSerDes;

import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public abstract class BaseServiceResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_serviceResource.setContextCompany(testCompany);

		ServiceResource.Builder builder = ServiceResource.builder();

		serviceResource = builder.authentication(
			"test@liferay.com", PropsValues.DEFAULT_ADMIN_PASSWORD
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		Service service1 = randomService();

		String json = objectMapper.writeValueAsString(service1);

		Service service2 = ServiceSerDes.toDTO(json);

		Assert.assertTrue(equals(service1, service2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		Service service = randomService();

		String json1 = objectMapper.writeValueAsString(service);
		String json2 = ServiceSerDes.toJSON(service);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	protected ObjectMapper getClientSerDesObjectMapper() {
		return new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		Service service = randomService();

		service.setBandwidth(regex);
		service.setBillingFrequency(regex);
		service.setContractPeriod(regex);
		service.setContractRenewal(regex);
		service.setDescription(regex);
		service.setDestinationLocation(regex);
		service.setInterfaceType(regex);
		service.setPaymentTerms(regex);
		service.setServiceCategory(regex);
		service.setServiceId(regex);
		service.setServiceStatus(regex);
		service.setServiceType(regex);
		service.setSourceLocation(regex);
		service.setVariantName(regex);

		String json = ServiceSerDes.toJSON(service);

		Assert.assertFalse(json.contains(regex));

		service = ServiceSerDes.toDTO(json);

		Assert.assertEquals(regex, service.getBandwidth());
		Assert.assertEquals(regex, service.getBillingFrequency());
		Assert.assertEquals(regex, service.getContractPeriod());
		Assert.assertEquals(regex, service.getContractRenewal());
		Assert.assertEquals(regex, service.getDescription());
		Assert.assertEquals(regex, service.getDestinationLocation());
		Assert.assertEquals(regex, service.getInterfaceType());
		Assert.assertEquals(regex, service.getPaymentTerms());
		Assert.assertEquals(regex, service.getServiceCategory());
		Assert.assertEquals(regex, service.getServiceId());
		Assert.assertEquals(regex, service.getServiceStatus());
		Assert.assertEquals(regex, service.getServiceType());
		Assert.assertEquals(regex, service.getSourceLocation());
		Assert.assertEquals(regex, service.getVariantName());
	}

	@Test
	public void testGetServiceDetailsByServiceId() throws Exception {
		Assert.assertTrue(false);
	}

	@Test
	public void testCreateServices() throws Exception {
		Assert.assertTrue(true);
	}

	protected Service testGraphQLService_addService() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(Service service, List<Service> services) {
		boolean contains = false;

		for (Service item : services) {
			if (equals(service, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(services + " does not contain " + service, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Service service1, Service service2) {
		Assert.assertTrue(
			service1 + " does not equal " + service2,
			equals(service1, service2));
	}

	protected void assertEquals(
		List<Service> services1, List<Service> services2) {

		Assert.assertEquals(services1.size(), services2.size());

		for (int i = 0; i < services1.size(); i++) {
			Service service1 = services1.get(i);
			Service service2 = services2.get(i);

			assertEquals(service1, service2);
		}
	}

	protected void assertEquals(Response response1, Response response2) {
		Assert.assertTrue(
			response1 + " does not equal " + response2,
			equals(response1, response2));
	}

	protected void assertEqualsIgnoringOrder(
		List<Service> services1, List<Service> services2) {

		Assert.assertEquals(services1.size(), services2.size());

		for (Service service1 : services1) {
			boolean contains = false;

			for (Service service2 : services2) {
				if (equals(service1, service2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				services2 + " does not contain " + service1, contains);
		}
	}

	protected void assertValid(Service service) throws Exception {
		boolean valid = true;

		if (service.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("activationDate", additionalAssertFieldName)) {
				if (service.getActivationDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("bandwidth", additionalAssertFieldName)) {
				if (service.getBandwidth() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("billingFrequency", additionalAssertFieldName)) {
				if (service.getBillingFrequency() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("contractPeriod", additionalAssertFieldName)) {
				if (service.getContractPeriod() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("contractRenewal", additionalAssertFieldName)) {
				if (service.getContractRenewal() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (service.getDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"destinationLocation", additionalAssertFieldName)) {

				if (service.getDestinationLocation() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("interfaceType", additionalAssertFieldName)) {
				if (service.getInterfaceType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("modificationDate", additionalAssertFieldName)) {
				if (service.getModificationDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("paymentTerms", additionalAssertFieldName)) {
				if (service.getPaymentTerms() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"scheduleMaintenances", additionalAssertFieldName)) {

				if (service.getScheduleMaintenances() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serviceCategory", additionalAssertFieldName)) {
				if (service.getServiceCategory() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serviceId", additionalAssertFieldName)) {
				if (service.getServiceId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serviceStatus", additionalAssertFieldName)) {
				if (service.getServiceStatus() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("serviceType", additionalAssertFieldName)) {
				if (service.getServiceType() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("sourceLocation", additionalAssertFieldName)) {
				if (service.getSourceLocation() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("tickets", additionalAssertFieldName)) {
				if (service.getTickets() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("variantName", additionalAssertFieldName)) {
				if (service.getVariantName() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<Service> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<Service> page, Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<Service> services = page.getItems();

		int size = services.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);

		assertValid(page.getActions(), expectedActions);
	}

	protected void assertValid(
		Map<String, Map<String, String>> actions1,
		Map<String, Map<String, String>> actions2) {

		for (String key : actions2.keySet()) {
			Map action = actions1.get(key);

			Assert.assertNotNull(key + " does not contain an action", action);

			Map<String, String> expectedAction = actions2.get(key);

			Assert.assertEquals(
				expectedAction.get("method"), action.get("method"));
			Assert.assertEquals(expectedAction.get("href"), action.get("href"));
		}
	}

	protected void assertValid(Response response) {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalResponseAssertFieldNames()) {

			if (Objects.equals("message", additionalAssertFieldName)) {
				if (response.getMessage() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (response.getStatus() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalResponseAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.meetup.common.rest.dto.v1_0_0.Service.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Service service1, Service service2) {
		if (service1 == service2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("activationDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getActivationDate(),
						service2.getActivationDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("bandwidth", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getBandwidth(), service2.getBandwidth())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("billingFrequency", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getBillingFrequency(),
						service2.getBillingFrequency())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("contractPeriod", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getContractPeriod(),
						service2.getContractPeriod())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("contractRenewal", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getContractRenewal(),
						service2.getContractRenewal())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getDescription(), service2.getDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"destinationLocation", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						service1.getDestinationLocation(),
						service2.getDestinationLocation())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(service1.getId(), service2.getId())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("interfaceType", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getInterfaceType(),
						service2.getInterfaceType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("modificationDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getModificationDate(),
						service2.getModificationDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("paymentTerms", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getPaymentTerms(),
						service2.getPaymentTerms())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"scheduleMaintenances", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						service1.getScheduleMaintenances(),
						service2.getScheduleMaintenances())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serviceCategory", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getServiceCategory(),
						service2.getServiceCategory())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serviceId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getServiceId(), service2.getServiceId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serviceStatus", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getServiceStatus(),
						service2.getServiceStatus())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("serviceType", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getServiceType(), service2.getServiceType())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("sourceLocation", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getSourceLocation(),
						service2.getSourceLocation())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("tickets", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getTickets(), service2.getTickets())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("variantName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						service1.getVariantName(), service2.getVariantName())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected boolean equals(Response response1, Response response2) {
		if (response1 == response2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalResponseAssertFieldNames()) {

			if (Objects.equals("message", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						response1.getMessage(), response2.getMessage())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						response1.getStatus(), response2.getStatus())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		if (clazz.getClassLoader() == null) {
			return new java.lang.reflect.Field[0];
		}

		return TransformUtil.transform(
			ReflectionUtil.getDeclaredFields(clazz),
			field -> {
				if (field.isSynthetic()) {
					return null;
				}

				return field;
			},
			java.lang.reflect.Field.class);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_serviceResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_serviceResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		if (entityModel == null) {
			return Collections.emptyList();
		}

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		return TransformUtil.transform(
			getEntityFields(),
			entityField -> {
				if (!Objects.equals(entityField.getType(), type) ||
					ArrayUtil.contains(
						getIgnoredEntityFieldNames(), entityField.getName())) {

					return null;
				}

				return entityField;
			});
	}

	protected String getFilterString(
		EntityField entityField, String operator, Service service) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("activationDate")) {
			if (operator.equals("between")) {
				Date date = service.getActivationDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(service.getActivationDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("bandwidth")) {
			Object object = service.getBandwidth();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("billingFrequency")) {
			Object object = service.getBillingFrequency();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("contractPeriod")) {
			Object object = service.getContractPeriod();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("contractRenewal")) {
			Object object = service.getContractRenewal();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("description")) {
			Object object = service.getDescription();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("destinationLocation")) {
			Object object = service.getDestinationLocation();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("interfaceType")) {
			Object object = service.getInterfaceType();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("modificationDate")) {
			if (operator.equals("between")) {
				Date date = service.getModificationDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(service.getModificationDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("paymentTerms")) {
			Object object = service.getPaymentTerms();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("scheduleMaintenances")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("serviceCategory")) {
			Object object = service.getServiceCategory();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("serviceId")) {
			Object object = service.getServiceId();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("serviceStatus")) {
			Object object = service.getServiceStatus();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("serviceType")) {
			Object object = service.getServiceType();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("sourceLocation")) {
			Object object = service.getSourceLocation();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("tickets")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("variantName")) {
			Object object = service.getVariantName();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword(
			"test@liferay.com:" + PropsValues.DEFAULT_ADMIN_PASSWORD);

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected Service randomService() throws Exception {
		return new Service() {
			{
				activationDate = RandomTestUtil.nextDate();
				bandwidth = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				billingFrequency = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				contractPeriod = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				contractRenewal = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				description = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				destinationLocation = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				interfaceType = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				modificationDate = RandomTestUtil.nextDate();
				paymentTerms = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				serviceCategory = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				serviceId = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				serviceStatus = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				serviceType = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				sourceLocation = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				variantName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected Service randomIrrelevantService() throws Exception {
		Service randomIrrelevantService = randomService();

		return randomIrrelevantService;
	}

	protected Service randomPatchService() throws Exception {
		return randomService();
	}

	protected Response randomResponse() throws Exception {
		return new Response() {
			{
				message = RandomTestUtil.randomString();
				status = RandomTestUtil.randomInteger();
			}
		};
	}

	protected ServiceResource serviceResource;
	protected com.liferay.portal.kernel.model.Group irrelevantGroup;
	protected com.liferay.portal.kernel.model.Company testCompany;
	protected com.liferay.portal.kernel.model.Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = source.getClass();

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					_getAllDeclaredFields(sourceClass)) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				try {
					Method setMethod = _getMethod(
						targetClass, field.getName(), "set",
						getMethod.getReturnType());

					setMethod.invoke(target, getMethod.invoke(source));
				}
				catch (Exception e) {
					continue;
				}
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static List<java.lang.reflect.Field> _getAllDeclaredFields(
			Class<?> clazz) {

			List<java.lang.reflect.Field> fields = new ArrayList<>();

			while ((clazz != null) && (clazz != Object.class)) {
				for (java.lang.reflect.Field field :
						clazz.getDeclaredFields()) {

					fields.add(field);
				}

				clazz = clazz.getSuperclass();
			}

			return fields;
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseServiceResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private com.meetup.common.rest.resource.v1_0_0.ServiceResource
		_serviceResource;

}