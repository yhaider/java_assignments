package com.yasmeen.grouplanguages.models;

public class Language {
	private String langname;
	private String creator;
	private double version;
	// Attributes for a language
	
	public Language() {}
	public Language(String langname, String creator, double version) {
		this.setLangname(langname);
		this.setCreator(creator);
		this.setVersion(version);
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
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	// Getters and setters for the attributes of a language
}
