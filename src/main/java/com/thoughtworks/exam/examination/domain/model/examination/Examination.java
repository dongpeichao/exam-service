package com.thoughtworks.exam.examination.domain.model.examination;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.paper.domain.model.paper.PaperId;
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
public class Examination {
    private PaperId id;
    private List<BlankQuiz> blankQuizzes;
    private String teacherId;

    public static Examination assemble(final List<BlankQuiz> blankQuizzes,
                                       final String teacherId) {
        return Examination.builder()
                .id(PaperId.generate())
                .blankQuizzes(blankQuizzes)
                .teacherId(teacherId)
                .build();
    }

    @ValueObject
    @Data
    @Builder
    @AllArgsConstructor
    public static class BlankQuiz {
        private String id;
        private Integer score;
    }
}
