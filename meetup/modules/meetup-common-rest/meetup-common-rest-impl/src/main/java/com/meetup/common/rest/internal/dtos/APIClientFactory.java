package com.meetup.common.rest.internal.dtos;


/**
 * A factory for creating APIClient objects.
 * 
 * @author aixtor
 */
public class APIClientFactory {
	
	private APIClientFactory() {}

	/** The api client. */
	private static APIClient apiClient = null;

	/**
	 * Gets the single instance of APIClientFactory.
	 *
	 * @return single instance of APIClientFactory
	 */
	public static APIClient getInstance() {
	
		if (apiClient == null) {
			apiClient = new HttpAPIClient();
		}
		return apiClient;

	}
}