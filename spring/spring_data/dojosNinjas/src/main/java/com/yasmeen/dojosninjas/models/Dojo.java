package com.yasmeen.dojosninjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="dojos")
public class Dojo {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date created_at;
    private Date updated_at;
    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
    // Attributes for dojo along with the connection of
    // one to many relationship
    
    public Dojo() {}
    public Dojo(String name) {
        this.name = name;
        this.created_at = new Date();
        this.updated_at = new Date();        
    }
    // Constructors for dojo

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Ninja> getNinjas() {
		return ninjas;
	}
	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
	// Getters and setters
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
    // This creates the created at and the updated at
}