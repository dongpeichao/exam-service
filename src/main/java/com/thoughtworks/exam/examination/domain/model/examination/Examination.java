package com.thoughtworks.exam.examination.domain.model.examination;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.paper.domain.model.paper.Paper;
import com.thoughtworks.exam.quiz.domain.model.quiz.QuizId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;


@AggregateRoot
@Data
@AllArgsConstructor(staticName = "of")
@Builder
@EqualsAndHashCode(of = "id")

public class Examination {
    private ExaminationId id;

    private List<Quiz> quizzes;

    private String teacherId;

    private int duration;

    private LocalDateTime startedTime;

    private LocalDateTime submittedTime;


    @ValueObject
    @Data
    @Builder
    @AllArgsConstructor
    public static class Quiz {
        private Integer score;
        private String question;
        private String referenceAnswer;
    }
}
