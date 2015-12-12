package com.github.binoybaranwal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.github.binoybaranwal.pojo.User;

@EnableWebMvc
@RestController
public class RestfulClientController {
	
	@RequestMapping(value = "/returnUser", method = RequestMethod.GET)
	public User invokeRestfulWebService(){
		RestTemplate restTemplate = new RestTemplate();
		User user = null;
		
		user = restTemplate.getForObject("http://localhost:8090/SpringRestfulWebServiceClient/getUser", User.class);
		System.out.println(user);
		return user;
	}

}
