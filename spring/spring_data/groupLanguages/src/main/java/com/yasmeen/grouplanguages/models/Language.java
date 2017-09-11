package com.yasmeen.grouplanguages.models;

import javax.validation.constraints.Size;

public class Language {
	private int id;
	
	@Size(min=2, max=20)
	private String langname;
	
	@Size(min=2, max=20)
	private String creator;
	
	@Size(min=2, max=20)
	private String version;
	
	private static Integer newid = 0;
	// Attributes for a language
	
	public Language() {}
	public Language(String langname, String creator, String version) {
		this.setLangname(langname);
		this.setCreator(creator);
		this.setVersion(version);
		this.setId(newid);
		newid++;
	}
	// Constructors
	
	public String getLangname() {
		return langname;
	}
	public void setLangname(String langname) {
		this.langname = langname;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	// Getters and setters for the attributes of a language
	
}
