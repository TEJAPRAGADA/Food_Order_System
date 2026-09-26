package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrderResponseDTO {

	private int orderId;

	private String customerName;

	private String foodItem;

	private int quantity;

	private Double price;

	private String status;

}
