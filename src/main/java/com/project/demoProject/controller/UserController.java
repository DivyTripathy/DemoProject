package com.project.demoProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demoProject.model.User;
import com.project.demoProject.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
		private final UserService userService;
		
		 @Autowired
		    public UserController(UserService userService) {
		        this.userService = userService;
		    }
		 
		 @GetMapping
		    public List<User> getUser() {
		        return userService.getUser();
		    }

}
