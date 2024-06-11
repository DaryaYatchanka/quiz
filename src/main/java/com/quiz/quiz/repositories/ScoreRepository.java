package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.Score;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.UUID;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Id> {

    @Query(value= "SELECT * FROM Score where id=?", nativeQuery = true)
    public Score findById(UUID id);


}
