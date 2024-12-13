package com.trojan.QuizApp.controller;

import com.trojan.QuizApp.model.Question;
import com.trojan.QuizApp.model.QuestionDTO;
import com.trojan.QuizApp.model.Quiz;
import com.trojan.QuizApp.model.Response;
import com.trojan.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam Integer numOfQuestions,
                                             @RequestParam String title){
        return service.createQuiz(numOfQuestions, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionDTO>> getQuiz(@PathVariable Long id)
    {
        return service.getQuiz(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Long id, @RequestBody List<Response> response){
        return service.calculateScore(id, response);
    }


}
