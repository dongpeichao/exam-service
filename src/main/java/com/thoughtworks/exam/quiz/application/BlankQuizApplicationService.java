package com.thoughtworks.exam.quiz.application;

import com.thoughtworks.exam.quiz.domain.model.quiz.Quiz;
import com.thoughtworks.exam.quiz.domain.model.quiz.QuizId;
import com.thoughtworks.exam.quiz.domain.model.quiz.QuizRepository;
import com.thoughtworks.exam.quiz.domain.model.quiz.IllegalScoreException;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizApplicationService {
    private final QuizRepository quizRepository;

    public BlankQuizApplicationService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public QuizId createQuiz(final CreateBlankQuizCommand command) throws IllegalScoreException {
        Quiz quiz = Quiz.create(command.getTeacherId(), command.getQuestion(),
                command.getScore(), command.getReferenceAnswer());
        quizRepository.save(quiz);
        return quiz.getId();
    }
}
