package com.thoughtworks.exam.quiz.domain.model.blankquiz;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import lombok.*;

@SuppressWarnings("checkstyle:magicnumber")
@AggregateRoot
@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode(of = "id")
public class BlankQuiz {
    private BlankQuizId id;
    private String teacherId;
    private String content;
    private Integer score;
    private String referenceAnswer;

    public static BlankQuiz create(final String teacherId, final String content,
                                   final Integer score, final String referenceAnswer) throws IllegalScoreException {
        if (score > 100 || score <= 0) {
            throw new IllegalScoreException(score);
        }
        return BlankQuiz.builder()
                .id(BlankQuizId.generate())
                .teacherId(teacherId)
                .content(content)
                .score(score)
                .referenceAnswer(referenceAnswer)
                .build();
    }

    public BlankQuiz update(final BlankQuizId id, final String teacherId, final String content,
                            final Integer score, final String referenceAnswer) {
        return BlankQuiz.builder()
                .id(id)
                .teacherId(teacherId)
                .content(content)
                .score(score)
                .referenceAnswer(referenceAnswer)
                .build();
    }
}
