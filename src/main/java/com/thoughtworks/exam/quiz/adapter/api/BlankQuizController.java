package com.thoughtworks.exam.quiz.adapter.api;

import com.thoughtworks.exam.quiz.application.BlankQuizApplicationService;
import com.thoughtworks.exam.quiz.application.CreateBlankQuizCommand;
import com.thoughtworks.exam.quiz.domain.model.blankquiz.IllegalScoreException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizzes")
public class BlankQuizController {
    private BlankQuizApplicationService blankQuizApplicationService;

    public BlankQuizController(BlankQuizApplicationService blankQuizApplicationService) {
        this.blankQuizApplicationService = blankQuizApplicationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlankQuizDTO create(@RequestBody CreateBlankQuizCommand command) throws IllegalScoreException {
        return BlankQuizDTO.from(blankQuizApplicationService.createQuiz(command).toString());
    }

}
