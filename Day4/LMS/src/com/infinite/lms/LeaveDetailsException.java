package com.infinite.lms;

public class LeaveDetailsException extends Exception {

	public LeaveDetailsException() {}
	
	public LeaveDetailsException(String error) {
		super(error);
	}
}