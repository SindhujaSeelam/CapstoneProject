package com.example.medicareproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicareproject.entity.cart;
import com.example.medicareproject.entity.medicines;
import com.example.medicareproject.entity.users;
import com.example.medicareproject.repository.CartRepository;
import com.example.medicareproject.repository.MedicinesRepository;
import com.example.medicareproject.repository.UsersRepository;

@RestController
@CrossOrigin
@RequestMapping("")
public class HomeController {
	
//	@Autowired
//	ProductRepository pr;
//
//	@GetMapping("/hello")
//	public Iterable<product> hello() {
//		Iterable<product>products=pr.findAll();
//		return products;
//	}
//	
//	@PostMapping("/hi")
//	public String post(@RequestBody product p) {
//		pr.save(p);
//		return "Data saved";
//	}
	
	@Autowired
	MedicinesRepository mr;
	
	@Autowired
	UsersRepository ur;
	
	@Autowired
	CartRepository cr;
	
	@GetMapping("/medicines")
	public Iterable<medicines> h(){
		Iterable<medicines> m=mr.findAll();
		return m;
	}
	
	@GetMapping("/users")
	public Iterable<users> user() {
		Iterable<users> us = ur.findAll();
		
		return us;
	}
	
	@PostMapping("/registeruser")
	public void userpost(@RequestBody users u) {
		ur.save(u);
		
	}
	
	@GetMapping("/cart")
	public Iterable<cart> cartinfo() {
		Iterable<cart> cart = cr.findAll();
		return cart;
	}
	
}
