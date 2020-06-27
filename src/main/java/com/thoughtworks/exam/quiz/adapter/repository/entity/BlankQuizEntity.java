package com.thoughtworks.exam.quiz.adapter.repository.entity;

import com.thoughtworks.exam.quiz.domain.model.quiz.Quiz;
import com.thoughtworks.exam.quiz.domain.model.quiz.QuizId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_quiz")
public class BlankQuizEntity {
    @Id
    private String id;

    private String question;
    private String referenceAnswer;
    private String teacherId;
    private int score;

    public Quiz toModel() {
        return Quiz.builder().id(new QuizId(id))
                .question(question).teacherId(teacherId)
                .referenceAnswer(referenceAnswer)
                .score(score)
                .build();
    }


    public static BlankQuizEntity fromModel(Quiz quiz) {
        BlankQuizEntity result = new BlankQuizEntity();
        result.id = quiz.getId().toString();
        result.question = quiz.getQuestion();
        result.teacherId = quiz.getTeacherId();
        result.referenceAnswer = quiz.getReferenceAnswer();
        result.score = quiz.getScore();
        return result;
    }
}
