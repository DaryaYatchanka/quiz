package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

//    @Query(value ="SELECT * FROM answer WHERE answerId=?", nativeQuery = true)
//    public Answer findById(Long Id);

    @Query(value= "SELECT * FROM answer WHERE answerText=?", nativeQuery = true)
    public Answer findByAnswerText(String answerText);

    @Query(value = "SELECT * FROM answer WHERE isCorrect= true", nativeQuery = true)
    public Answer findByCorrectAnswer(Boolean isCorrect);

}
