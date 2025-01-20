package com.yeimy.forum.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String passsword;
    @ManyToMany
    private List<Profile> profiles;
    @OneToMany(mappedBy = "topics", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Topic> topics = new ArrayList<Topic>();
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

}
