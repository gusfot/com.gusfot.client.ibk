package com.wadiz.client.ibk;

import com.wadiz.client.Response;
import com.wadiz.client.ResponseData;

public class IbkResponse implements Response {

	/**
	 * KDS 응답내용 
	 */
	private ResponseData responseData;
	
	/**
	 * KDS 응답결과
	 */
	private boolean success;
	
	/**
	 * 결과 메세지(정상 응답일 경우 없을 수도 있음.)
	 */
	private String message;

	public ResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
