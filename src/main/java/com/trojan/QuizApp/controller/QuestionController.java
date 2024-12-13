package com.trojan.QuizApp.controller;


import com.trojan.QuizApp.model.Question;
import com.trojan.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("question")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return ResponseEntity.ok(service.getAllQuestions());
    }


    @PostMapping("question")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        service.addQuestion(question);
        return new ResponseEntity<>("Question Added Successfully", HttpStatus.CREATED);
    }


}
