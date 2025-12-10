package com.meetup.common.rest.internal.util;


import com.liferay.portal.kernel.json.JSONArray;

import javax.servlet.http.HttpServletRequest;

public class AuditLogRequest {
    
	private JSONArray updatedDetails;
    private String action;
    private String module;
    private String statusVal;
    private String type;
    private boolean isArchived;
    private boolean isDeleted;
    private HttpServletRequest httpServletRequest;
    private long entityId;
    private long portalCompanyId;
    private long portalSiteId;
    private long performedByUserId;
    
	public JSONArray getUpdatedDetails() {
		return updatedDetails;
	}
	public void setUpdatedDetails(JSONArray updatedDetails) {
		this.updatedDetails = updatedDetails;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getStatusVal() {
		return statusVal;
	}
	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isArchived() {
		return isArchived;
	}
	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}
	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}
	public long getEntityId() {
		return entityId;
	}
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	public long getPortalCompanyId() {
		return portalCompanyId;
	}
	public void setPortalCompanyId(long portalCompanyId) {
		this.portalCompanyId = portalCompanyId;
	}
	public long getPortalSiteId() {
		return portalSiteId;
	}
	public void setPortalSiteId(long portalSiteId) {
		this.portalSiteId = portalSiteId;
	}
	public long getPerformedByUserId() {
		return performedByUserId;
	}
	public void setPerformedByUserId(long performedByUserId) {
		this.performedByUserId = performedByUserId;
	}

   
}
