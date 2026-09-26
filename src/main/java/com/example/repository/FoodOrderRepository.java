package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.FoodOrder;


public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {

	boolean existsByCustomerNameAndFoodItemAndStatus(String customerName, String foodItem,
			com.example.enums.OrderStatus status);

}
