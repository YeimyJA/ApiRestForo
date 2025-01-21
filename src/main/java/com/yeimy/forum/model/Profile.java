package com.yeimy.forum.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProfileType profileType;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ProfileType getProfileType() {
        return profileType;
    }
    public void setProfileType(ProfileType profileType) {
        this.profileType = profileType;
    }

    @Override
    public String toString() {
        return "Profile [id=" + id + ", profileType=" + profileType + ", getProfileType()="
                + getProfileType() + "]";
    }
}
