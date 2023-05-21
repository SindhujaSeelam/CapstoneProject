package com.example.medicareproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicareproject.entity.medicines;
import com.example.medicareproject.entity.users;
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
	
	@GetMapping("/deletemedicine/{id}")
	public void deletemed(@PathVariable("id") int id) {
		mr.deleteById(id);
		
	}
	
	@PostMapping("/editmedicines")
	public void editmed(@RequestBody medicines m) {
		mr.save(m);
		
	}
	@PostMapping("/addmedicine")
	public void addmed(@RequestBody medicines m) {
		mr.save(m);
		
	}
	
	@GetMapping("/changemedstatus/{id}")
	public void changestatus(@PathVariable("id") int id) {
		medicines m=mr.findById(id).get();
		if(m.getStatus().equals("true"))
		{
			m.setStatus("false");
		}
		else {
			m.setStatus("true");
		}
		mr.save(m);
	}
}
