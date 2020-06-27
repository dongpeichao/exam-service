package com.thoughtworks.exam.quiz.domain.model.quiz;

import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
public class QuizId extends AbstractId {
    public QuizId(final String value) {
        super(value);
    }

    public static QuizId generate() {
        return new QuizId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return getValue();
    }
}
