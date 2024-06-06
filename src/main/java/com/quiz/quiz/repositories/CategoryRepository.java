package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Id> {
}
