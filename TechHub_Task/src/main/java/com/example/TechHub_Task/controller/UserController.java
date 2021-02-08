package com.example.TechHub_Task.controller;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TechHub_Task.model.User;
import com.example.TechHub_Task.payload.UserResponsePayload;
import com.example.TechHub_Task.service.DateValidator;
import com.example.TechHub_Task.service.LocalDateValidator;
import com.example.TechHub_Task.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	
	@Autowired
	UserService userService;

	
	
	@PostMapping
	public ResponseEntity<Map<String , Object>> validateUser(@Valid @RequestBody User user) {
		
		
		String age = userService.calculateAge(user.getBirthDate());
		
		
		UserResponsePayload response= new UserResponsePayload();
		response.setAge(age);
		response.setEmail(user.getEmail());
		response.setFirstName(user.getFirstName());
		response.setLastName(user.getLastName());
		response.setPassword(user.getPassword());
		
		
		
		Map<String, Object> map = new HashMap();
		map.put("User Details", response		);

		return new ResponseEntity(map, HttpStatus.OK);
		}
}
