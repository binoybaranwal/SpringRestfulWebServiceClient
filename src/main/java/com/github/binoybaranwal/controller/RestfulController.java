package com.github.binoybaranwal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.github.binoybaranwal.pojo.User;
import com.github.binoybaranwal.pojo.UserAddress;

@EnableWebMvc
@RestController
public class RestfulController {
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser(){
		UserAddress userAddress = new UserAddress(1, "229 Green Park", "Jessore Road", "Kolkata", "WestBengal", "India", "700055");
		
		User user = new User(1, "Ramesh", "Kumar", 25, "23-Jan-1990", 1, userAddress);
		return user;
	}

}
