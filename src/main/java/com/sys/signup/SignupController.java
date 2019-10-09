package com.sys.signup;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SignupController {

	@Autowired
	UserDao dao;

	static Logger logger = LoggerFactory.getLogger(SignupController.class);
	

	@PostMapping(path = "/api/signup", consumes = "application/json")
	public ResponseEntity<?> signup(@RequestBody User user) {

		logger.info("Sign Up called");
		
		User u = new User();		
		u.setCart(new ArrayList<>());
		u.setLikedItems(new ArrayList<>());
		u.setOrderedItems(new ArrayList<>());
		
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		u.setPhone(user.getPhone());
		u.setPassword(user.getPassword());
		
		dao.save(user);
		return new ResponseEntity<>("Sign Up : Success", HttpStatus.OK);
		

		

	}

}