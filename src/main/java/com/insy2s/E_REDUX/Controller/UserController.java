package com.insy2s.E_REDUX.Controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insy2s.E_REDUX.Entites.Category;
import com.insy2s.E_REDUX.Entites.Userr;
import com.insy2s.E_REDUX.Services.UserServiceImpl;
@RestController

@RequestMapping("/api/auth")

public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@PostMapping("/")
	   public ResponseEntity<Userr> createCategory( @RequestBody Userr user) {
	        
	        Userr result = userServiceImpl.registerNewUser(user);
	        return ResponseEntity.status(201)
	                .body(result);
	    }

}
