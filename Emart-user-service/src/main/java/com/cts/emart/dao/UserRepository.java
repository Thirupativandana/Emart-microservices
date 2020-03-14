package com.cts.emart.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.model.Users;

public interface UserRepository extends CrudRepository<Users, String> {
	   

		Optional<Users> findById(int id);
}
