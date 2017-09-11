package com.yasmeen.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.yasmeen.grouplanguages.models.Language;
import com.yasmeen.grouplanguages.repositories.LanguageRepository;

// All commented out code is from CRUD without a database

@Service
public class LanguageServices {
	
	private LanguageRepository languageRepository;
	
	public LanguageServices(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "1.8"),
			new Language("JavaScript", "Brendan Eich", "1.9.5.23.247.2"),
			new Language("Python", "Guido von Rossum", "3.6")));
	// This is our array list of languages initially
	
	
	public List<Language> allLanguages(){
//		return languages;
		return (List<Language>) languageRepository.findAll();
	}
	// This returns all the languages
	
	public void addLanguage(Language language) {
//		languages.add(language);
		languageRepository.save(language);
	}
	// Adds a language
	
	public Language getLang(Long id) {
//		for(int i = 0; i < languages.size(); i++) {
//			Language l = languages.get(i);
//			if(l.getId().equals(id)) {
//				return l;
//			}
//		}
//		return languages.get(-1);
		return languageRepository.findOne(id);
	}
	// This should grab the language based on the
	// id passed into the method
	
	public void updateLang(Language lang) {
//		for(int i = 0; i < languages.size(); i++){
//			Language l = languages.get(i);
//			if(l.getId().equals(lang.getId())) {
//				languages.set(i, lang);
//			}
//		}
		languageRepository.save(lang);
	}
	// This should update the language in the list
	// by using the "set" method after finding the index
	// of the language we want to update based on its id
	
	public void deleteLang(Long id) {
//		for(int i = 0; i < languages.size(); i++){
//			Language l = languages.get(i);
//			if(l.getId().equals(id)) {
//				languages.remove(l);
//			}
//		}
		languageRepository.delete(id);
	}
	// This finds the language based on its id
	// and then deletes it
}
