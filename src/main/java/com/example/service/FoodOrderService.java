package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.exception.OrderNotFoundException;
import com.example.model.FoodOrderModel;

@Service
public class FoodOrderService {

	List<FoodOrderModel> orderList = new ArrayList<>(
			List.of(
					new FoodOrderModel(1, "Teja", "Pizza", 2, 499.0),
					new FoodOrderModel(2, "Pavan", "Burger", 1, 149.0)));

	private int idCounter = 3;

	public FoodOrderModel addOrder(FoodOrderModel order) {

		order.setOrderId(idCounter++);
		orderList.add(order);

		System.out.println("Order added successfully: " + order);

		return order;
	}

	public List<FoodOrderModel> getAllOrders() {

		System.out.println("Fetching all orders");

		return orderList;
	}

	public FoodOrderModel getOrderById(int orderId) {

		for (FoodOrderModel o : orderList) { 
			if (o.getOrderId() == orderId) {
				System.out.println("Order found for id " + orderId + ": " + o);
				return o;
			}
		}

		System.out.println("Order not found for id " + orderId);

		throw new OrderNotFoundException(orderId);
	}

	public FoodOrderModel updateOrder(int orderId, FoodOrderModel updatedOrder) {

		FoodOrderModel order = getOrderById(orderId);
		order.setCustomerName(updatedOrder.getCustomerName());
		order.setFoodItem(updatedOrder.getFoodItem());
		order.setQuantity(updatedOrder.getQuantity());
		order.setPrice(updatedOrder.getPrice());

		System.out.println("Order updated successfully for id " + orderId);

		return order;
	}

	public FoodOrderModel partialUpdateOrder(int orderId, FoodOrderModel partialOrder) {

		FoodOrderModel order = getOrderById(orderId);

		if (partialOrder.getCustomerName() != null) {
			order.setCustomerName(partialOrder.getCustomerName());
		}
		if (partialOrder.getFoodItem() != null) {
			order.setFoodItem(partialOrder.getFoodItem());
		}
		if (partialOrder.getQuantity() != 0) {
			order.setQuantity(partialOrder.getQuantity());
		}
		if (partialOrder.getPrice() != null) {
			order.setPrice(partialOrder.getPrice());
		}

		System.out.println("Order partially updated for id " + orderId);

		return order;
	}

	public FoodOrderModel deleteOrder(int orderId) {

		FoodOrderModel order = getOrderById(orderId);
		orderList.remove(order);

		System.out.println("Order deleted successfully for id " + orderId);

		return order;
	}
}
