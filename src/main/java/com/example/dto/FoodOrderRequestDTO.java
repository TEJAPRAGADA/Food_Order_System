package com.example.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FoodOrderRequestDTO {

	@NotBlank(message = "Customer name is required")
	private String customerName;

	@NotBlank(message = "Food item cannot be empty")
	private String foodItem;

	@Min(value = 1, message = "Quantity must be at least 1")
	private int quantity;

	@NotNull(message = "Price is mandatory")
	private Double price;

}
