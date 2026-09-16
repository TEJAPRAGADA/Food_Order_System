package com.example.exception;

public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException(int orderId) {
		super("Order not found with id: " + orderId);
	}
}
