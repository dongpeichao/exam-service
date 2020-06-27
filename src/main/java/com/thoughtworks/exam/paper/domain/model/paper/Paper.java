package com.thoughtworks.exam.paper.domain.model.paper;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@SuppressWarnings("checkstyle:magicnumber")
@AggregateRoot
@Data
//@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
@Builder
@EqualsAndHashCode(of = "id")
public class Paper {
    private PaperId id;
    private List<Quiz> quizzes;
    private String teacherId;

    public static Paper assemble(final List<Quiz> quizzes,
                                 final String teacherId) throws IllegalQuizzesCountException {
        validateQuizzes(quizzes);
        return Paper.builder()
                .id(PaperId.generate())
                .quizzes(quizzes)
                .teacherId(teacherId)
                .build();
    }
    private static void validateQuizzes(List<Quiz> quizzes) throws IllegalQuizzesCountException {
        if (quizzes.size() >10 || quizzes.size() < 5) {
            throw new IllegalQuizzesCountException(quizzes.size());
        }
    }

    @ValueObject
    @Data
    @Builder
    @AllArgsConstructor
    public static class Quiz {
        private String id;
        private Integer score;
    }
}
