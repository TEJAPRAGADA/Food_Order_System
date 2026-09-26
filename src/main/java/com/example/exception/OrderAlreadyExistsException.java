package com.example.exception;

public class OrderAlreadyExistsException extends RuntimeException {

	public OrderAlreadyExistsException() {
		super(ExceptionConstant.ORDER_ALREADY_EXISTS);
	}
}
