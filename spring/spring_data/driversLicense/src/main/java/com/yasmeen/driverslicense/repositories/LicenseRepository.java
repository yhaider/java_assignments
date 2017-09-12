package com.yasmeen.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yasmeen.driverslicense.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{

}
