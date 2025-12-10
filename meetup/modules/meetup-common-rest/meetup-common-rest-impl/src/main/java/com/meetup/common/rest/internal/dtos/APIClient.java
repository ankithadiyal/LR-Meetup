package com.meetup.common.rest.internal.dtos;




import com.liferay.portal.kernel.exception.SystemException;

import java.io.File;
import java.util.Map;


/**
 * The Interface APIClient.
 * 
 * @author aixtor
 */
public interface APIClient {

	/**
	 * Gets the access token.
	 *
	 * @param tokenURL the token URL
	 * @param clientId the client id
	 * @param clientSecret the client secret
	 * @return the access token
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse getAccessToken(String tokenURL, String clientId, String clientSecret) throws SystemException;
	
	public APICallResponse getPowerBIAccessToken(String tokenURL, String clientId, String clientSecret, String scope) throws SystemException;
	
	public APICallResponse getPowerBIReportInfo(String reportURL, String accessToken) throws SystemException;
	
	public APICallResponse getPowerBIReportEmbedToken(String reportEmbedTokenURL, String accessToken, String requestJson) throws SystemException;
	
	/**
	 * Execute get.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse executeGet(String url, String accessToken) throws SystemException;
	
	
	public APICallResponse executeMWGet(String url, String accessToken, Map<String, String> headersMap) throws SystemException;

	/**
	 * Execute post.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @param requestJson the request json
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse executePost(String url, String accessToken, String requestJson) throws SystemException;
	
	/**
	 * Execute put.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @param requestJson the request json
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse executePut(String url, String accessToken, String requestJson) throws SystemException;
	
	/**
	 * Execute delete.
	 *
	 * @param url the url
	 * @param accessToken the access token
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse executeDelete(String url, String accessToken) throws SystemException;
	
	public APICallResponse executePatch(String url, String accessToken, String requestJson) throws SystemException;
	
	/**
	 * Execute multi part post.
	 *
	 * @param url the url
	 * @param params the params
	 * @param fileParams the file params
	 * @return the API call response
	 * @throws SystemException the krypton system exception
	 */
	public APICallResponse executeMultiPartPost(String url, Map<String, String> params, Map<String, File> fileParams) throws SystemException;
	
}
