package com.quiz.quiz.repositories;
import com.quiz.quiz.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

//    @Query(value= "SELECT * FROM Score where id=?", nativeQuery = true)
//    public Score findById(Long id);


}
