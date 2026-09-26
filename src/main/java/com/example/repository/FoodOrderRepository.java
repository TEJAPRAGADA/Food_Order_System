package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.FoodOrder;

// Extending JpaRepository gives us save(), findAll(), findById(), delete(), etc.
// for free - no implementation needed, Spring generates it at runtime.
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {

	// Derived query method - Spring Data JPA reads the method name and
	// automatically builds the SQL query from it. No @Query annotation needed.
	boolean existsByCustomerNameAndFoodItemAndStatus(String customerName, String foodItem,
			com.example.enums.OrderStatus status);

}
