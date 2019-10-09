package com.sys.signup;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserDao extends MongoRepository<User, String>{
	
	public User findByEmail(String email);
	public User findByPhone(String phone);

}