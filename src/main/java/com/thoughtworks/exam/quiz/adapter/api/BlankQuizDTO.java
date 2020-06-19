package com.thoughtworks.exam.quiz.adapter.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BlankQuizDTO {
    private String blankQuizId;

    public static BlankQuizDTO from(String blankQuizId) {
        return new BlankQuizDTO(blankQuizId);
    }
}
