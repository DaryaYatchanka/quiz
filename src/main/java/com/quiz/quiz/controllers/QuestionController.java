package com.quiz.quiz.controllers;

import com.quiz.quiz.entities.Answer;
import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
//@Tag(name = "Questions API")
public class QuestionController {

    @PostMapping("/questions")
    public ResponseEntity<Void> createQuestion(@RequestBody Question question){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @GetMapping("/questions/{id}")
//    public ResponseEntity<Question> getQuestion(@PathVariable UUID id){
//        return ResponseEntity.ok(new Question(1, "Question 1 text", new Category(58ed763-928c-4155-bee9-fdbaaadc15f3,"topic", "subtopic", 1), new Answer(123L, "answer text", true, "correct answwer should be this___ because of this")))
//    }

}
