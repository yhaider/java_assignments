package com.yasmeen.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yasmeen.grouplanguages.models.Language;

@Service
public class LanguageServices {

	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "1.8"),
			new Language("JavaScript", "Brendan Eich", "1.9.5.23.247.2"),
			new Language("Python", "Guido von Rossum", "3.6")));
	// This is our array list of languages initially
	
	
	public List<Language> allLanguages(){
		return languages;
	}
	// This returns all the languages
	
	public void addLanguage(Language language) {
		languages.add(language);
	}
	// Adds a language
	
	public Language getLang(int id) {
		for(int i = 0; i < languages.size(); i++) {
			Language l = languages.get(i);
			if(l.getId().equals(id)) {
				return l;
			}
		}
		return languages.get(-1);
	}
	// This should grab the language based on the
	// id passed into the method
	
	public void updateLang(Language lang) {
		for(int i = 0; i < languages.size(); i++){
			Language l = languages.get(i);
			if(l.getId().equals(lang.getId())) {
				languages.set(i, lang);
			}
		}
	}
	// This should update the language in the list
	// by using the "set" method after finding the index
	// of the language we want to update based on its id
	
	public void deleteLang(int id) {
		for(int i = 0; i < languages.size(); i++){
			Language l = languages.get(i);
			if(l.getId().equals(id)) {
				languages.remove(l);
			}
		}
	}
	// This finds the language based on its id
	// and then deletes it
}
