package com.trojan.QuizApp.service;


import com.trojan.QuizApp.model.Question;
import com.trojan.QuizApp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions() {
     return repo.findAll();
    }

    public void addQuestion(Question question) {
        repo.save(question);
    }

}
