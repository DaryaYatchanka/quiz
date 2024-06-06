package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Answer;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Id> {
}
