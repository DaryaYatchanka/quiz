package com.quiz.quiz.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        private UUID id;
        private String questionText;
        @OneToOne
        private Category category;
        @OneToMany
        private ArrayList<Answer> answerOptions;

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<Answer> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<Answer> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}

