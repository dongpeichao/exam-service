package com.thoughtworks.exam.answer_sheet.adpater.repository.endity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "t_answer_sheet")
public class AnswerSheetEntity {
    @Id
    private String id;

    private String teacherId;
    private String examinationId;
    private String studentId;
    private String answer;

    private LocalDateTime startedTime;
    private LocalDateTime submittedTime;
}
