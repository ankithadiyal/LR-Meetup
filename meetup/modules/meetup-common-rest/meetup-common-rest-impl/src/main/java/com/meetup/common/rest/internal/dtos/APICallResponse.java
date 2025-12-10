package com.meetup.common.rest.internal.dtos;


import java.util.Map;


/**
 * The Class APICallResponse.
 * 
 * @author aixtor
 */
public class APICallResponse {

	
	/** The response code. */
	private int responseCode;
	
	/** The response content length. */
	private int responseContentLength;
	
	/** The response content type. */
	private String responseContentType;
	
	/** The response headers. */
	private Map<String, String> responseHeaders;
	
	/** The response redirect. */
	private String responseRedirect;
	
	/** The response data. */
	private String responseData;
	
	/** The error message. */
	private String errorMessage;
	
	/**
	 * Gets the response code.
	 *
	 * @return the response code
	 */
	public int getResponseCode() {
		return responseCode;
	}
	
	/**
	 * Sets the response code.
	 *
	 * @param responseCode the new response code
	 */
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	/**
	 * Gets the response content length.
	 *
	 * @return the response content length
	 */
	public int getResponseContentLength() {
		return responseContentLength;
	}
	
	/**
	 * Sets the response content length.
	 *
	 * @param responseContentLength the new response content length
	 */
	public void setResponseContentLength(int responseContentLength) {
		this.responseContentLength = responseContentLength;
	}
	
	/**
	 * Gets the response content type.
	 *
	 * @return the response content type
	 */
	public String getResponseContentType() {
		return responseContentType;
	}
	
	/**
	 * Sets the response content type.
	 *
	 * @param responseContentType the new response content type
	 */
	public void setResponseContentType(String responseContentType) {
		this.responseContentType = responseContentType;
	}
	
	/**
	 * Gets the response headers.
	 *
	 * @return the response headers
	 */
	public Map<String, String> getResponseHeaders() {
		return responseHeaders;
	}
	
	/**
	 * Sets the response headers.
	 *
	 * @param responseHeaders the response headers
	 */
	public void setResponseHeaders(Map<String, String> responseHeaders) {
		this.responseHeaders = responseHeaders;
	}
	
	/**
	 * Gets the response redirect.
	 *
	 * @return the response redirect
	 */
	public String getResponseRedirect() {
		return responseRedirect;
	}
	
	/**
	 * Sets the response redirect.
	 *
	 * @param responseRedirect the new response redirect
	 */
	public void setResponseRedirect(String responseRedirect) {
		this.responseRedirect = responseRedirect;
	}
	
	/**
	 * Gets the response data.
	 *
	 * @return the response data
	 */
	public String getResponseData() {
		return responseData;
	}
	
	/**
	 * Sets the response data.
	 *
	 * @param responseData the new response data
	 */
	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	
	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	/**
	 * Sets the error message.
	 *
	 * @param errorMessage the new error message
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}

