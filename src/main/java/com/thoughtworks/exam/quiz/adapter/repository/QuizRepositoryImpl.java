package com.thoughtworks.exam.quiz.adapter.repository;

import com.thoughtworks.exam.quiz.adapter.repository.entity.BlankQuizEntity;
import com.thoughtworks.exam.quiz.domain.model.quiz.Quiz;
import com.thoughtworks.exam.quiz.domain.model.quiz.QuizRepository;
import org.springframework.stereotype.Repository;

@Repository
public class QuizRepositoryImpl implements QuizRepository {

    private final BlankQuizJPARepository blankQuizJPARepository;

    public QuizRepositoryImpl(BlankQuizJPARepository blankQuizJPARepository) {
        this.blankQuizJPARepository = blankQuizJPARepository;
    }

    @Override
    public void save(Quiz quiz) {
        blankQuizJPARepository.save(BlankQuizEntity.fromModel(quiz));
    }
}
