package com.yasmeen.driverslicense.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yasmeen.driverslicense.models.License;
import com.yasmeen.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {

		private LicenseRepository licenseRepository;
		public LicenseService(LicenseRepository licenseRepository) {
			this.licenseRepository = licenseRepository;
		}
		// Initializing the license repository in our license service
		
		public ArrayList<License> getAll(){
			return (ArrayList<License>) licenseRepository.findAll();
		}
		// Grabbing all the licenses from the database and putting them in
		// an array list
		
		public License getOneById(Long id) {
			return licenseRepository.findOne(id);
		}
		// Grabbing one by its id
		
		public String generateNum() {
			ArrayList<License> licenses = this.getAll();
			String num = String.format("%06d", this.getAll().size()+1);
			Collections.sort(licenses, Comparator.comparing(License::getNumber));
			for(int i = 0; i < licenses.size(); i++) {
				License l = licenses.get(i);
				if(l.getNumber().equals(num)) {
					String add = "";
					int newnum = 1 + i;
					num = String.format("%06d", this.getAll().size()+newnum);
				}
			}
			return num;
		}
		// Generating a new number for the license
		// This method is called when we are creating a license
		
		public void createLicense(License license) {
			license.setNumber(this.generateNum());
			licenseRepository.save(license);
		}
		// Creating a license
		
		public void updateLicense(License license) {
			licenseRepository.save(license);
		}
		// Updating a license
		
		public void deleteLicense(Long id) {
			licenseRepository.delete(id);
		}
		// Deleting a license
		
		public License getLicenseByPersonId(Long id) {
			ArrayList<License> licenses = this.getAll();
			for(int i = 0; i < licenses.size(); i++) {
				License l = licenses.get(i);
				if(l.getPerson().getId() == id) {
					return l;
				}
			}
			return licenses.get(-1);
		}
		// This gets a license by the person's id
}
