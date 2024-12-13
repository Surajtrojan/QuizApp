package com.trojan.QuizApp.repository;

import com.trojan.QuizApp.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long>{

    @Query(value = "SELECT * FROM question q ORDER BY RANDOM() LIMIT :numOfQuestions", nativeQuery = true)
    List<Question> findRandomQuestionByNumber(int numOfQuestions);

}
