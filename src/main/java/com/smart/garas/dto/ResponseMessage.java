package com.smart.garas.dto;

/**
 * At: 06/28/2017
 * @author sok.kimchhoin
 * Respone message
 */
public class ResponseMessage {
	
	private boolean result;
	private String errorCode;
	private String errorMessage;
	private Object body;
	private Object pagination;
	
	public ResponseMessage(boolean result) {
		this.result = result;
	}
	
	public ResponseMessage(boolean result, String errorCode, String errorMessage) {
		this.result = result;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public ResponseMessage(boolean result, Object body) {
		this.result = result;
		this.body = body;
	}
	
	public ResponseMessage(boolean result, Object body, Object pagination) {
		this.result = result;
		this.body = body;
		this.pagination = pagination;
	}
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	
	public Object getPagination() {
		return pagination;
	}

	public void setPagination(Object pagination) {
		this.pagination = pagination;
	}

	@Override
	public String toString() {
		return "ResponseMessage [result=" + result + ", errorCode=" + errorCode + ", errorMessage=" + errorMessage
				+ ", body=" + body + ", pagination=" + pagination + "]";
	}
}
