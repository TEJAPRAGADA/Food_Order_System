package com.example.exception;

public class ExceptionConstant {

	public static final String ORDER_NOT_FOUND = "Order not found with id: ";
	public static final String ORDER_ALREADY_EXISTS = "An identical pending order already exists for this customer and item";

	private ExceptionConstant() {
		// prevents instantiation - this class only holds constants
	}

}
