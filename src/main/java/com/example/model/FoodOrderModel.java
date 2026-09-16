package com.example.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class FoodOrderModel {

	private int orderId;

	@NotBlank(message = "Customer name is required")
	private String customerName;

	@NotBlank(message = "Food item cannot be empty")
	private String foodItem;

	@Min(value = 1, message = "Quantity must be at least 1")
	private int quantity;

	@NotNull(message = "Price is mandatory")
	private Double price;

}
