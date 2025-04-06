package com.relationships.jpa_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Profile {

    @Id
    private Long id;
    private String bio;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
