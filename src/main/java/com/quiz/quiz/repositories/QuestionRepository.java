package com.quiz.quiz.repositories;
import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
//    Page<Question> findbyCategory(Category category, Pageable pageable);

    @Query("SELECT DISTINCT q.subject FROM Question q")
    List<String> findDistinctSubject();
    Page<Question> findBySubject(String subject, Pageable pageable);

//    @Query("SELECT DISTINCT q.subject FROM Question q")
//    List<Category> findUniqueCategory;


//    @Query(value = "SELECT * FROM question WHERE questionId=?", nativeQuery = true)
//    public Question findById(Long id);

//    @Query(value="SELECT * FROM question WHERE questionCategory=?", nativeQuery = true)
//    public Question findByCategory(Category category);
//
//    List<Category> findDistinctCategory(Category category);
}
