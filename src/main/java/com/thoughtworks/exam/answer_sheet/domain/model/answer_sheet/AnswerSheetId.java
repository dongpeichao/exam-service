
package com.thoughtworks.exam.answer_sheet.domain.model.answer_sheet;

import com.thoughtworks.exam.common.ddd.annotation.ValueObject;
import com.thoughtworks.exam.common.ddd.core.AbstractId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@ValueObject
@EqualsAndHashCode(callSuper = true)
class AnswerSheetId extends AbstractId {
    public AnswerSheetId(final String value) {
        super(value);
    }

    public static AnswerSheetId generate() {
        return new AnswerSheetId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return getValue();
    }
}