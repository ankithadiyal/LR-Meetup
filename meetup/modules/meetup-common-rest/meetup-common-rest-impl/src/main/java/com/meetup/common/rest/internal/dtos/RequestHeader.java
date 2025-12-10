package com.meetup.common.rest.internal.dtos;

import java.util.HashMap;
import java.util.Map;

import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.Validator;

public class RequestHeader {
	
	private RequestMethod requestMethod;
	private Map<String, String> headerProperties;
	
	public RequestHeader(RequestMethod requestMethod, String applicationType, AuthenticationToken authToken, boolean isBearer, String bearerToken, Map<String, String> customHeaderProperties) {
		if(Validator.isNotNull(customHeaderProperties) && !customHeaderProperties.isEmpty()) {
			headerProperties = customHeaderProperties;
		} else {
			headerProperties = new HashMap<>();
		}
		setRequestMethod(requestMethod);
		setRequestApplicationType(applicationType);
		setAuthorizationToken(authToken, isBearer, bearerToken);
	}
	
	public void setRequestMethod(RequestMethod requestMethod) {
		this.requestMethod = requestMethod;
	}
	
	public String getRequestMethod() {
		return requestMethod.toString();
	}
	
	public void setRequestApplicationType(String applicationType) {
		String applicationTypeKey = (requestMethod == RequestMethod.POST  || requestMethod == RequestMethod.PUT) ? HttpHeaders.CONTENT_TYPE : HttpHeaders.ACCEPT;
		addHeaderProperty(applicationTypeKey, applicationType);
	}
	
	public void setAuthorizationToken(AuthenticationToken authToken, boolean isBearer, String bearerToken) {
		addHeaderProperty(HttpHeaders.AUTHORIZATION, authToken.getAuthenticationString(isBearer, bearerToken));
	}
	
	public void addHeaderProperty(String name, String value) {
		headerProperties.put(name, value);
	}
	
	public final Map<String, String> getHeaderProperties() {
		return headerProperties;
	}

}
