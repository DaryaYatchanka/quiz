package com.quiz.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    private Boolean isCorrect;
    private String answerFeedback;

    public Answer(){}

    public Answer(UUID id, Boolean isCorrect){
        this.id = id;
        this.isCorrect = isCorrect;
    }

    public Answer(UUID id, Boolean isCorrect, String answerFeedback){
        this.id = id;
        this.isCorrect = isCorrect;
        this.answerFeedback = answerFeedback;
    }


    public UUID getId() {
        return id;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public String getAnswerFeedback() {
        return answerFeedback;
    }

    public void setAnswerFeedback(String answerFeedback) {
        this.answerFeedback = answerFeedback;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
