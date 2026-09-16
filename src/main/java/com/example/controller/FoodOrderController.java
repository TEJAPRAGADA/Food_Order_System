package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.FoodOrderModel;
import com.example.service.FoodOrderService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/orders")
public class FoodOrderController {

	@Autowired
	FoodOrderService fos;

	// POST -> Add order
	@PostMapping("/inserting") 
	public FoodOrderModel addOrder(@Valid @RequestBody FoodOrderModel order) {
		return fos.addOrder(order);
	}

	// GET -> Get all orders
	@GetMapping("/getalldetails")
	public List<FoodOrderModel> getAllOrders() {
		return fos.getAllOrders();
	}

	// GET by ID
	@GetMapping("/getbyid/{id}")
	public FoodOrderModel getOrderById(@PathVariable("id") int orderId) {
		return fos.getOrderById(orderId);
	}

	// PUT -> Update order (full update)
	@PutMapping("/update/{id}")
	public FoodOrderModel updateOrder(@PathVariable("id") int orderId, @Valid @RequestBody FoodOrderModel order) {
		return fos.updateOrder(orderId, order);
	}
 
	// PATCH -> Partial update
	@PatchMapping("/partialupdate/{id}")
	public FoodOrderModel partialUpadteOrder(@PathVariable("id") int orderId,
			@RequestBody FoodOrderModel partialOrder) {
		return fos.partialUpdateOrder(orderId, partialOrder);
	}

	// DELETE -> Delete order
	@DeleteMapping("/deletebyid/{id}")
	public FoodOrderModel deleteOrder(@PathVariable("id") int orderId) {
		return fos.deleteOrder(orderId);
	}
}
