package com.trojan.QuizApp.model;

import lombok.Data;

@Data
public class QuestionDTO {
    public Long id;
    public String title;
    public String option1;
    public String option2;
    public String option3;
    public String option4;

    public QuestionDTO(Long id, String title, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.title = title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
