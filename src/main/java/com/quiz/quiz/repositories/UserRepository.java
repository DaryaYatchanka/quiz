package com.quiz.quiz.repositories;

import com.quiz.quiz.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    @Query(value = "SELECT * FROM user WHERE userName=?",nativeQuery = true)
    public User findByUsername(String username);
}
