package com.yasmeen.admindashboard.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yasmeen.admindashboard.models.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String email);

}
