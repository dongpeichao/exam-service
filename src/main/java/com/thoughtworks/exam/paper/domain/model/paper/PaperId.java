package com.thoughtworks.exam.paper.domain.model.paper;

import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
public
class PaperId extends AbstractId {
    public PaperId(final String value) {
        super(value);
    }

    public static PaperId generate() {
        return new PaperId("paper-" + UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return getValue();
    }
}
