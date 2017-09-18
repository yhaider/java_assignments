package com.yasmeen.admindashboard.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.yasmeen.admindashboard.models.User;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    // Attributes for role
    
    public Role() {
    }
    // Constructor
    
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
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    // Getters and setters
}

