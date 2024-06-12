package com.quiz.quiz.services;

import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {

    @Autowired
    Category category;
    ArrayList<Question> getQuestions(Integer numberOfQuestions, Category category){
        return null;
    }
}
