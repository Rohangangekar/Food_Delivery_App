package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.services.OrderServices;
import com.example.demo.services.ProductServices;

@Controller
public class OrderController {
	
	@Autowired
	private OrderServices orderServices;

	//	AddOrder
	@PostMapping("/addingOrder")
	public String addOrder(@ModelAttribute Orders order)
	{

		this.orderServices.saveOrder(order);
		return "redirect:/admin/services";
	}

	//	UpdateOrder
	@GetMapping("/updatingOrder/{orderId}")
	public String updateOrder(@PathVariable("orderId") int id,@ModelAttribute Orders order)
	{

		this.orderServices.updateOrder(id, order);
		return "redirect:/admin/services";
	}
	//DeleteOrder
	@GetMapping("/deleteOrder/{orderId}")
	public String delete(@PathVariable("orderId") int id)
	{
		this.orderServices.deleteOrder(id);
		return "redirect:/admin/services";
	}
}
