package com.quiz.quiz.entities;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String answerText;
    private Boolean isCorrect;

    private String answerFeedback;

//    @OneToOne
//    private Integer score;


}
