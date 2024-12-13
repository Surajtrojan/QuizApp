package com.trojan.QuizApp.service;

import com.trojan.QuizApp.model.Question;
import com.trojan.QuizApp.model.QuestionDTO;
import com.trojan.QuizApp.model.Quiz;
import com.trojan.QuizApp.model.Response;
import com.trojan.QuizApp.repository.QuestionRepo;
import com.trojan.QuizApp.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuestionRepo questionRepo;

    public ResponseEntity<String> createQuiz(Integer numOfQuestions, String title) {
        Quiz quiz = new Quiz();

        List<Question> questions = questionRepo.findRandomQuestionByNumber(numOfQuestions);

        quiz.setTitle(title);
        quiz.setQuestion(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("quiz created successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionDTO>> getQuiz(Long id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Question> questionsFromDB  = quiz.get().getQuestion();
        List<QuestionDTO> questionForUser = new ArrayList<>();
        for(Question q: questionsFromDB)
        {
            QuestionDTO questionDTO = new QuestionDTO(q.getId(), q.getTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionForUser.add(questionDTO);
        }
        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateScore(Long id, List<Response> response) {

        Integer score =0;
        int i=0;
        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Question> questions = quiz.get().getQuestion();

        for(Response r: response)
        {
            if(r.getResponse().equals(questions.get(i).getCorrectanswer()))
                score++;

            i++;
        }

        return new ResponseEntity<>(score, HttpStatus.OK);
    }
}
