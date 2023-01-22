package com.arun.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptchaResponse {
	private boolean success;
	private String challenge_ts;
	private String hostname;
	
	@JsonProperty("error-codes")
	private String[] errorCode;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getChallenge_ts() {
		return challenge_ts;
	}

	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String[] getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String[] errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
}
