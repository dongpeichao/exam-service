package com.thoughtworks.exam.quiz.domain.model.blankquiz;

import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
public class BlankQuizId extends AbstractId {
    public BlankQuizId(final String value) {
        super(value);
    }

    public static BlankQuizId generate() {
        return new BlankQuizId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return getValue();
    }
}
