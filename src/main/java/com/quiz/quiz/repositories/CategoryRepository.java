package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value= "SELECT * FROM Category WHERE subject=?", nativeQuery = true)
    public Category findBySubject(String subject);

    @Query(value="SELECT * FROM Category WHERE subject=? AND subTopic=?", nativeQuery = true)
    public Category findbySubjectAndSubTopic(String subject, String subTopic);

}
