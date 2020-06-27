package com.thoughtworks.exam.quiz.domain.model.quiz;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import lombok.*;

@SuppressWarnings("checkstyle:magicnumber")
@AggregateRoot
@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode(of = "id")
public class Quiz {
    private QuizId id;
    private String teacherId;
    private String question;
    private Integer score;
    private String referenceAnswer;

    public static Quiz create(final String teacherId, final String question,
                              final Integer score, final String referenceAnswer) throws IllegalScoreException {
        if (score > 100 || score <= 0) {
            throw new IllegalScoreException(score);
        }
        return Quiz.builder()
                .id(QuizId.generate())
                .teacherId(teacherId)
                .question(question)
                .score(score)
                .referenceAnswer(referenceAnswer)
                .build();
    }

    public Quiz update(final QuizId id, final String teacherId, final String content,
                       final Integer score, final String referenceAnswer) {
        return Quiz.builder()
                .id(id)
                .teacherId(teacherId)
                .question(content)
                .score(score)
                .referenceAnswer(referenceAnswer)
                .build();
    }
}
