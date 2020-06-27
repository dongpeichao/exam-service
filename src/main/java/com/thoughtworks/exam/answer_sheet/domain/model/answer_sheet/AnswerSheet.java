package com.thoughtworks.exam.answer_sheet.domain.model.answer_sheet;

import com.thoughtworks.exam.common.ddd.annotation.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@AggregateRoot
@Data
@AllArgsConstructor(staticName = "of")
@Builder
@EqualsAndHashCode(of = "id")
public class AnswerSheet {
    private AnswerSheetId id;
    private String teacherId;
    private String examinationId;
    private String studentId;
    private String answer;
    private LocalDateTime startedTime;
    private LocalDateTime submittedTime;
}
