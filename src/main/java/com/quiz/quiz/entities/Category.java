package com.quiz.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subject;
    private String subTopic;
    private Integer level;

    public Category(){}

    public Category(Long id, String subject){
        this.id= id;
        this.subject = subject;
    }

    public Category(Long id, String subject, String subTopic){
        this.id = id;
        this.subject = subject;
        this.subTopic = subTopic;
    }

    public Category(Long id, String subject, String subTopic, Integer level){
        this.id = id;
        this.subject = subject;
        this.subTopic = subTopic;
        this.level = level;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }
}

