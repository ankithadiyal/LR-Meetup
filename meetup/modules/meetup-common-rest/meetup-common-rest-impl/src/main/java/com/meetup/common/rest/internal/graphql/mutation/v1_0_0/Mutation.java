package com.meetup.common.rest.internal.graphql.mutation.v1_0_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import com.meetup.common.rest.dto.v1_0_0.Service;
import com.meetup.common.rest.resource.v1_0_0.ServiceResource;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Varun.Agrawal
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setServiceResourceComponentServiceObjects(
		ComponentServiceObjects<ServiceResource>
			serviceResourceComponentServiceObjects) {

		_serviceResourceComponentServiceObjects =
			serviceResourceComponentServiceObjects;
	}

	@GraphQLField(
		description = "This endpoint handles the create/update createServices."
	)
	public Response createServices(@GraphQLName("service") Service service)
		throws Exception {

		return _applyComponentServiceObjects(
			_serviceResourceComponentServiceObjects,
			this::_populateResourceContext,
			serviceResource -> serviceResource.createServices(service));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(ServiceResource serviceResource)
		throws Exception {

		serviceResource.setContextAcceptLanguage(_acceptLanguage);
		serviceResource.setContextCompany(_company);
		serviceResource.setContextHttpServletRequest(_httpServletRequest);
		serviceResource.setContextHttpServletResponse(_httpServletResponse);
		serviceResource.setContextUriInfo(_uriInfo);
		serviceResource.setContextUser(_user);
		serviceResource.setGroupLocalService(_groupLocalService);
		serviceResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<ServiceResource>
		_serviceResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}