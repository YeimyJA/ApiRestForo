package com.yeimy.forum.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table (name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private Date creatDate;
    private char status;
    private List<User> author;
    @ManyToOne
    private Class clase;
    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Answer> answers;

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
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getCreatDate() {
        return creatDate;
    }
    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
    public List<User> getAuthor() {
        return author;
    }
    public void setAuthor(List<User> author) {
        this.author = author;
    }
    public Class getClase() {
        return clase;
    }
    public void setClase(Class clase) {
        this.clase = clase;
    }
    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
}
