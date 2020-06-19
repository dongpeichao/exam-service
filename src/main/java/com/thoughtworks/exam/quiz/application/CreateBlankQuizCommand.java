package com.thoughtworks.exam.quiz.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBlankQuizCommand {
    private String teacherId;
    private String question;
    private Integer score;
    private String referenceAnswer;
}
