package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Id> {

    @Query(value = "SELECT * FROM question WHERE questionId=?", nativeQuery = true)
    public Question findById(UUID id);

    @Query(value="SELECT * FROM question WHERE questionCategory=?", nativeQuery = true)
    public Question findByCategory(Category category);

}
