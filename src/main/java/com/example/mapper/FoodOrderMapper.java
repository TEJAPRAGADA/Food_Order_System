package com.example.mapper;

import com.example.dto.FoodOrderRequestDTO;
import com.example.dto.FoodOrderResponseDTO;
import com.example.entity.FoodOrder;
import com.example.enums.OrderStatus;

public class FoodOrderMapper {

	// Client's request -> a new entity, ready to be saved.
	// New orders always start as PENDING - the client never gets to set this directly.
	public static FoodOrder toEntity(FoodOrderRequestDTO dto) {

		FoodOrder order = new FoodOrder();
		order.setCustomerName(dto.getCustomerName());
		order.setFoodItem(dto.getFoodItem());
		order.setQuantity(dto.getQuantity());
		order.setPrice(dto.getPrice());
		order.setStatus(OrderStatus.PENDING);

		return order;
	}

	// Saved entity -> what the client actually sees in the response
	public static FoodOrderResponseDTO toResponseDTO(FoodOrder order) {

		return new FoodOrderResponseDTO(
				order.getOrderId(),
				order.getCustomerName(),
				order.getFoodItem(),
				order.getQuantity(),
				order.getPrice(),
				order.getStatus().name());
	}

}
