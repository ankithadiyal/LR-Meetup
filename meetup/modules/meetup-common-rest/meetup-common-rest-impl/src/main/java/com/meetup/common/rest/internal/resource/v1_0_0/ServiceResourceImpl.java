package com.meetup.common.rest.internal.resource.v1_0_0;

import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.json.JSONArray;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.PortalUtil;
import com.meetup.common.rest.internal.util.CommonRestUtil;
import com.meetup.common.rest.resource.v1_0_0.ServiceResource;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;


/**
 * @author Varun.Agrawal
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0_0/service.properties",
	scope = ServiceScope.PROTOTYPE, service = ServiceResource.class
)
public class ServiceResourceImpl extends BaseServiceResourceImpl {
	  private static final Log log = LogFactoryUtil.getLog(ServiceResourceImpl.class);
	  
	  @Context
		private HttpServletRequest httpServletRequest;
		
	  @Reference
      private ConfigurationProvider configurationProvider ;
	  
	  
	  
	  @Override
		public Response createServices(com.meetup.common.rest.dto.v1_0_0.Service service) throws Exception {
		  
		  
		  String jsonString =  service.toString();
		    JSONObject bundleJson = JSONFactoryUtil.createJSONObject(jsonString);
		    String portalUrl = PortalUtil.getPortalURL(httpServletRequest);
		    log.info("Portal URL: " + portalUrl);
		    CommonRestUtil.initialize(configurationProvider);
		    JSONObject resultJson = CommonRestUtil.createServiceBundleViaApi(portalUrl, bundleJson);
		    log.info("result json " + resultJson);
		    
		   return  Response.ok(
		    	    JSONUtil.put(
		    	        "message", "Records added successfully"
		    	    ).toString()
		    	).build();
		}
	  
 
	  
	  @Override
	  public Object getServiceDetailsByServiceId(@NotNull String serviceId)
	          throws Exception {

	      String portalUrl = PortalUtil.getPortalURL(contextHttpServletRequest);
	      log.info("Portal URL: " + portalUrl);

	      CommonRestUtil.initialize(configurationProvider);
	      String accessToken = CommonRestUtil.getToken(portalUrl);
	      if (accessToken == null) {
	          throw new RuntimeException("Unable to fetch OAuth2 access token");
	      }

	      String filter = "id eq '" + serviceId + "'";
	      String encodedFilter = URLEncoder.encode(filter, StandardCharsets.UTF_8);

	      String servicesUrl = portalUrl + "/o/c/services?filter=" + encodedFilter;

	      String servicesResponseBody =
	              CommonRestUtil.getWithAuth(servicesUrl, accessToken);

	      JSONObject servicesPageJson =
	              JSONFactoryUtil.createJSONObject(servicesResponseBody);

	      JSONArray itemsArray = servicesPageJson.getJSONArray("items");

	      if (itemsArray == null || itemsArray.length() == 0) {
	          JSONObject notFound = JSONFactoryUtil.createJSONObject();
	          notFound.put("message", "No service found for serviceId " + serviceId);
	          return notFound;
	      }

	      JSONObject serviceJson = itemsArray.getJSONObject(0);
	      long serviceInternalId = serviceJson.getLong("id");

	      String ticketFilter = "r_ticketServiceId_c_serviceId eq '" + serviceInternalId + "'";
	      String encodedTicketFilter = URLEncoder.encode(ticketFilter, StandardCharsets.UTF_8);

	      String ticketsUrl = portalUrl + "/o/c/tickets?filter=" + encodedTicketFilter;

	      String ticketsResponseBody =
	              CommonRestUtil.getWithAuth(ticketsUrl, accessToken);

	      JSONObject ticketsPageJson =
	              JSONFactoryUtil.createJSONObject(ticketsResponseBody);

	      JSONArray ticketsArray = ticketsPageJson.getJSONArray("items");
	      if (ticketsArray == null) {
	          ticketsArray = JSONFactoryUtil.createJSONArray();
	      }

	      String schedFilter = "r_serviceId_c_serviceId eq '" + serviceInternalId + "'";
	      String encodedSchedFilter =
	              URLEncoder.encode(schedFilter, StandardCharsets.UTF_8);

	      String schedUrl =
	              portalUrl + "/o/c/schedulemaintenances?filter=" + encodedSchedFilter;

	      String schedResponseBody =
	              CommonRestUtil.getWithAuth(schedUrl, accessToken);

	      JSONObject schedPageJson =
	              JSONFactoryUtil.createJSONObject(schedResponseBody);

	      JSONArray schedArray = schedPageJson.getJSONArray("items");
	      if (schedArray == null) {
	          schedArray = JSONFactoryUtil.createJSONArray();
	      }

	      serviceJson.put("tickets", ticketsArray);
	      serviceJson.put("scheduleMaintenances", schedArray);

	      JSONObject result = JSONFactoryUtil.createJSONObject();
	      result.put("service", serviceJson);

	      return result;
	  }

}