package com.yasmeen.admindashboard.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yasmeen.admindashboard.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

	List<Role> findByName(String string);

}
