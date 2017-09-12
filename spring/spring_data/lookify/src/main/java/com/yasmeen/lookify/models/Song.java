package com.yasmeen.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min=2, message="Title should be at least 2 characters.")
	private String title;
	
	@Column
	@Size(min=2, message="Artist name should be at least 2 characters.")
	private String artist;
	
	@Column
	@NotNull(message="Rating must be filled and between 1 and 10.")
	private Integer rating;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date created_at;

    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updated_at;
    // Attributes with validations
    
    public Song() {}
    public Song(String title, String artist, Integer rating) {
    		this.setTitle(title);
    		this.setArtist(artist);
    		this.setRating(rating);
    		this.created_at = new Date();
    		this.updated_at = new Date();
    }
    // Constructors, you know the deal by now
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
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
	// The getters and setters for the attributes
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
    // These occur before creating and before updating
    // They change and update/create the dates for our
    // created_at and updated_at
}
