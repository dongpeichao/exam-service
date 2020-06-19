package com.thoughtworks.exam.quiz.domain.model.blankquiz;

public class IllegalScoreException extends Throwable {
    public IllegalScoreException(Integer score) {
        super(score.toString());
    }
}
