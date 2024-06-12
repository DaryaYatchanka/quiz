package com.quiz.quiz.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;


import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String questionText;
    //        @NotBlank
//        private String subject;
    @NotBlank
    private String questionType;

    @ManyToOne
    private Category category;

    @NotBlank
    @OneToMany
    private ArrayList<Answer> answerOptions;

//    @OneToOne
//    private ArrayList<Answer> correctAnswers;

    @NotBlank
    @ElementCollection
    private ArrayList<String> correctAnswers;


}