package com.quiz.quiz.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    private String answerText;
    private Boolean isCorrect;
    private String answerFeedback;

    @OneToOne
    private Integer score;

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

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }
}
