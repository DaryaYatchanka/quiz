package com.quiz.quiz.services;

import com.quiz.quiz.entities.Category;
import com.quiz.quiz.entities.Question;
import com.quiz.quiz.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class QuestionService {

    //private final QuestionRepository questionRepository;
    @Autowired
    QuestionRepository questionRepository;

//    @Autowired
//    Category category;
//
//    public Question createQuestion(Question question){
//        return questionRepository.save(question);
//    }
//
//    public Optional<Question> getQuestionById(Long id){
//        return questionRepository.findById(id);
//    }
//
//
//    public List<Question> getAllQuestions(){
//        return questionRepository.findAll();
//
//    }
//
//    public Question updateQuestion(Long id, Question question) throws ChangeSetPersister.NotFoundException {
//        Optional<Question> specificQuestion = this.getQuestionById(id);
//        if(specificQuestion.isPresent()){
//            Question updatedQuestion = specificQuestion.get();
//            updatedQuestion.setQuestionText(question.getQuestionText());
//            updatedQuestion.setAnswerOptions(question.getAnswerOptions());
//            updatedQuestion.setQuestionType(question.getQuestionType());
//            updatedQuestion.setCategory(question.getCategory());
//            updatedQuestion.setCorrectAnswers(question.getCorrectAnswers());
//
//            return questionRepository.save(updatedQuestion);
//        }else {
//            throw new ChangeSetPersister.NotFoundException();
//        }
//
//    }
//
//    public void deleteQuestion(Long id){
//        questionRepository.deleteById(id);
//    }
//
//    ArrayList<Question> getQuestions(Integer numberOfQuestions, Category category){
//        return null;
////                questionRepository.save();
//    }
//
//    //    public List<Category> getAllCategories(){
////        return questionRepository.findDistinctCategory();
////    }
//
//    public List<Question> getQuestionsForUser(Integer numberOfQuestions, Category category){
//
//        Pageable pageable = PageRequest.of(0, numberOfQuestions);
//        return questionRepository.findBySubject(category, pageable).getContent();
//
//    }


    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }


    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

    public List<String> getAllSubjects() {
        return questionRepository.findDistinctSubject();
    }


    public Question updateQuestion(Long id, Question question) throws ChangeSetPersister.NotFoundException {
        Optional<Question> theQuestion = this.getQuestionById(id);
        if (theQuestion.isPresent()) {
            Question updatedQuestion = theQuestion.get();
//            updatedQuestion.setQuestion(question.getQuestion());
//            updatedQuestion.setChoices(question.getChoices());
//            updatedQuestion.setCorrectAnswers(question.getCorrectAnswers());
            return questionRepository.save(updatedQuestion);
        } else {
            throw new ChangeSetPersister.NotFoundException();
        }

    }

//    public void deleteQuestion(Long id) {
//        questionRepository.deleteById(id);
//    }
//
//    public List<Question> getQuestionsForUser(Integer numOfQuestions, String subject) {
//        Pageable pageable = PageRequest.of(0, numOfQuestions);
//        return questionRepository.findBySubject(subject, pageable).getContent();
//    }


}
