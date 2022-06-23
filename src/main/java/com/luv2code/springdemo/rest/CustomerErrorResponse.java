package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {
	private int Status;
	private String message;
	private Long timeStamp;
	public CustomerErrorResponse(int status, String message, Long timeStamp) {
		super();
		Status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public CustomerErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
