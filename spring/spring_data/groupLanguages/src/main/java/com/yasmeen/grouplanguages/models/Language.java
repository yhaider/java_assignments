package com.yasmeen.grouplanguages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Language {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min=2, max=20)
	private String langname;
	
	@Column
	@Size(min=2, max=20)
	private String creator;
	
	@Column(nullable = false)
	@Min(1)
	private String version;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date created_at;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updated_at;
	// Attributes for a language
	
	public Language() {}
	public Language(String langname, String creator, String version) {
		this.setLangname(langname);
		this.setCreator(creator);
		this.setVersion(version);
		this.created_at = new Date();
		this.updated_at = new Date();
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	// Getters and setters for the attributes of a language
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
	// Before creating and before updating
}
