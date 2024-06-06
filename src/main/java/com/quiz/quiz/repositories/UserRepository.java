package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository {

    @Query(value = "SELECT * FROM user WHERE userName=?",nativeQuery = true)
    public User findByUsername(String username);

    @Query(value = "SElECT * FROM user WHERE Id=?", nativeQuery = true)
    public User findById(UUID Id);

    @Query(value = "SELECT * FROM user WHERE id=? AND Score=?", nativeQuery = true)
    public User findByIdAndScore(UUID Id, Integer score);

}
