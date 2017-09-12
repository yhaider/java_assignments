package com.yasmeen.driverslicense.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasmeen.driverslicense.models.License;
import com.yasmeen.driverslicense.models.Person;
import com.yasmeen.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private LicenseService licenseService;
	
	private PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	// Initializing person repository for use!
	
	public ArrayList<Person> getAll(){
		return (ArrayList<Person>) personRepository.findAll();
	}
	// Getting all persons from database and returning as array list
	
	public Person getOneById(Long id) {
		return personRepository.findOne(id);
	}
	// Grabbing a person by its id
	
	public void createPerson(Person person) {
		personRepository.save(person);
	}
	// Creating a person
	
	public void updatePerson(Person person) {
		personRepository.save(person);
	}
	// Updates a person
	
	public void deletePerson(Long id) {
		personRepository.delete(id);
	}
	// Deletes a person
	
	public ArrayList<Person> withoutLicense(){
		ArrayList<Person> allPeople = this.getAll();
		ArrayList<License> allLicenses = licenseService.getAll();
		for(int i = 0; i < allPeople.size(); i++) {
			for(int y = 0; y < allLicenses.size(); y++) {
				if(allPeople.get(i) == allLicenses.get(y).getPerson()) {
					allPeople.remove(i);
				}
			}
		}
		return allPeople;
	}
	// This method gets the full list of people and the full list of licenses
	// and then cycles through each person and each license to compare and see if the person
	// has a license
	// If they do, we remove them from the list
	// We need this method because when creating a new license, we only want to display
	// people who do not have a license since the relationship is one to one
	
	
}
