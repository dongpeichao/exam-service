package com.thoughtworks.exam.quiz.adapter.repository;

import com.thoughtworks.exam.quiz.adapter.repository.entity.BlankQuizEntity;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuiz;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuizRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BlankQuizRepositoryImpl implements BlankQuizRepository {

    private final BlankQuizJPARepository blankQuizJPARepository;

    public BlankQuizRepositoryImpl(BlankQuizJPARepository blankQuizJPARepository) {
        this.blankQuizJPARepository = blankQuizJPARepository;
    }

    @Override
    public void save(BlankQuiz blankQuiz) {
        blankQuizJPARepository.save(BlankQuizEntity.fromModel(blankQuiz));
    }
}
