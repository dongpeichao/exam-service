
package com.thoughtworks.exam.examination.domain.model.examination;

import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
class ExaminationId extends AbstractId {
    public ExaminationId(final String value) {
        super(value);
    }

    public static ExaminationId generate() {
        return new ExaminationId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return getValue();
    }
}