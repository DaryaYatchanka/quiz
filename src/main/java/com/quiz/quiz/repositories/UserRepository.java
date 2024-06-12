package com.quiz.quiz.repositories;
import com.quiz.quiz.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE userName=?",nativeQuery = true)
    public User findByUsername(String username);

//    @Query(value = "SElECT * FROM user WHERE Id=?", nativeQuery = true)
//    public User findById(Long Id);

    @Query(value = "SELECT * FROM user WHERE id=? AND Score=?", nativeQuery = true)
    public User findByIdAndScore(Long Id, Integer score);

}
