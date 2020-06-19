package com.thoughtworks.exam.quiz.application;

import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuiz;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuizId;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.BlankQuizRepository;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.IllegalScoreException;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizApplicationService {
    private final BlankQuizRepository blankQuizRepository;

    public BlankQuizApplicationService(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }

    public BlankQuizId createQuiz(final CreateQuizCommand command) throws IllegalScoreException {
        BlankQuiz blankQuiz = BlankQuiz.create(command.getTeacherId(), command.getQuestion(),
                command.getScore(), command.getReferenceAnswer());
        blankQuizRepository.save(blankQuiz);
        return blankQuiz.getId();
    }
}
