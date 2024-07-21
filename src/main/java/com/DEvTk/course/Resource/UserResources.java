package com.DEvTk.course.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DEvTk.course.Entities.User;
import com.DEvTk.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	@Autowired
	private UserService services;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = services.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User obj = services.findById(id);
		return ResponseEntity.ok().body(obj); 
		
		
	}
	
	
}
