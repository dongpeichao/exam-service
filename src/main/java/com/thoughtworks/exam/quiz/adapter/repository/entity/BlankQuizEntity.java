package com.thoughtworks.exam.quiz.adapter.repository.entity;

import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuiz;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuizId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_quiz")
public class BlankQuizEntity {
    @Id
    private String id;

    private String question;
    private String referenceAnswer;
    private String teacherId;
    private int score;

    public BlankQuiz toModel() {
        return BlankQuiz.builder().id(new BlankQuizId(id))
                .question(question).teacherId(teacherId)
                .referenceAnswer(referenceAnswer)
                .score(score)
                .build();
    }


    public static BlankQuizEntity fromModel(BlankQuiz blankQuiz) {
        BlankQuizEntity result = new BlankQuizEntity();
        result.id = blankQuiz.getId().toString();
        result.question = blankQuiz.getQuestion();
        result.teacherId = blankQuiz.getTeacherId();
        result.referenceAnswer = blankQuiz.getReferenceAnswer();
        result.score = blankQuiz.getScore();
        return result;
    }
}
