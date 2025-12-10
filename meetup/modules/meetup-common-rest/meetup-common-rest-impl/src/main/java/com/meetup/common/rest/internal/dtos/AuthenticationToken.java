package com.meetup.common.rest.internal.dtos;

import javax.xml.bind.DatatypeConverter;

public class AuthenticationToken {
	
	private String userName;
	private String password;
	private String authenticationString;
	
	public AuthenticationToken(String userName, String password) {
		setUserName(userName);
		setPassword(password);
	}
	
	public static AuthenticationToken create(String userName, String password) {
		return new AuthenticationToken(userName, password);
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	private void generateAuthenticationString() {
		authenticationString = userName + ":" + password;
	}
	
	public String getAuthenticationString(boolean isBearer, String bearerToken) {
		if(!isBearer) {
			generateAuthenticationString();
			return "Basic " + encodeAuthenticationString(authenticationString);
		} else {
			return "Bearer " + bearerToken;
		}
	}
	
	private String encodeAuthenticationString(String authenticationString) {
		return DatatypeConverter.printBase64Binary(authenticationString.getBytes());
	}

}
