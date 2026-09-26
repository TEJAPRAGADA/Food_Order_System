package com.example.entity;

import com.example.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	private String customerName;

	private String foodItem;

	private int quantity;

	private Double price;

	@Enumerated(EnumType.STRING)
	private OrderStatus status;

}
