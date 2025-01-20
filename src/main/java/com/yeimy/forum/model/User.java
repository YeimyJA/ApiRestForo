package com.yeimy.forum.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String passsword;
    @OneToOne
    private List<Profile> profiles;
    @OneToMany(mappedBy = "topics", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Topic> topics = new ArrayList<Topic>();
    @OneToMany
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

}
