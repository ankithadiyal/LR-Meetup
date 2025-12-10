package com.meetup.common.rest.internal.resource.v1_0_0;

import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.util.Base64;
import com.meetup.common.rest.internal.util.CommonRestUtil;
import com.meetup.common.rest.resource.v1_0_0.ServiceEntityResource;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Context;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Varun.Agrawal
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0_0/service-entity.properties",
	scope = ServiceScope.PROTOTYPE, service = ServiceEntityResource.class
)
public class ServiceEntityResourceImpl extends BaseServiceEntityResourceImpl {
	
	 @Context
	  private HttpServletRequest httpServletRequest;
	 
	 @Reference
     private ConfigurationProvider configurationProvider ;

	@Override
	public Object getEntityListNew(@NotNull String propsDataEnc, @NotNull Integer userId, @NotNull Integer siteId)
			throws Exception {
		 
		byte[] propsDataBytes = Base64.decode(propsDataEnc);
		String propsData = new String(propsDataBytes);
		 CommonRestUtil.initialize(configurationProvider);
		return CommonRestUtil.getEntityList(propsData, userId, siteId, httpServletRequest);
  
	}
}