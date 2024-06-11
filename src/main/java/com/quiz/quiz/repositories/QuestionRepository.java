package com.quiz.quiz.repositories;
import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface QuestionRepository extends JpaRepository<Question, Id> {

    @Query(value = "SELECT * FROM question WHERE questionId=?", nativeQuery = true)
    public Question findById(Long id);

    @Query(value="SELECT * FROM question WHERE questionCategory=?", nativeQuery = true)
    public Question findByCategory(Category category);

}
