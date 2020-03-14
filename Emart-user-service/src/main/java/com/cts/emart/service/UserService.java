package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.dao.UserRepository;
import com.cts.emart.model.Users;



@Service
public class UserService {
	
	Users user;
	@Autowired
	UserRepository repo;

	public List<Users> getAllUsers() {
		

		return (List<Users>)repo.findAll();
		
	}

	public void addUser(Users user) {
		repo.save(user);
		
	}

	public Optional<Users> getUserDetailsByID(int id) {
		
		return repo.findById(id);
	}

	

}





