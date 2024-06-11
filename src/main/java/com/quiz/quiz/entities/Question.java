package com.quiz.quiz.entities;

import jakarta.persistence.*;


import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String questionText;

        private String subject;

       private String questionType;

    //        @OneToOne
//        private Category category;

//        @OneToMany
//        private ArrayList<Answer> answerOptions;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }


//    public ArrayList<Answer> getAnswerOptions() {
//        return answerOptions;
//    }
//
//    public void setAnswerOptions(ArrayList<Answer> answerOptions) {
//        this.answerOptions = answerOptions;
//    }


//    public ArrayList<Answer> getAnswerOptions() {
//        return answerOptions;
//    }
//
//    public void setAnswerOptions(ArrayList<Answer> answerOptions) {
//        this.answerOptions = answerOptions;
//    }


    public String getQuestionText() {
        return questionText;
    }


//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
    public String getSubject(){return subject; }

    public void setSubject(String subject) {
        this.subject = subject;
    }

//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionType() {
        return questionType;
    }
}