package com.meetup.common.rest.internal.graphql.servlet.v1_0_0;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import com.meetup.common.rest.internal.graphql.mutation.v1_0_0.Mutation;
import com.meetup.common.rest.internal.graphql.query.v1_0_0.Query;
import com.meetup.common.rest.internal.resource.v1_0_0.ServiceResourceImpl;
import com.meetup.common.rest.resource.v1_0_0.ServiceResource;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setServiceResourceComponentServiceObjects(
			_serviceResourceComponentServiceObjects);

		Query.setServiceResourceComponentServiceObjects(
			_serviceResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "MeetupCommonRest";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/meetup-common-rest-graphql/v1_0_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#createServices",
						new ObjectValuePair<>(
							ServiceResourceImpl.class, "createServices"));

					put(
						"query#serviceDetailsByServiceId",
						new ObjectValuePair<>(
							ServiceResourceImpl.class,
							"getServiceDetailsByServiceId"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<ServiceResource>
		_serviceResourceComponentServiceObjects;

}