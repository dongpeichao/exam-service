package com.thoughtworks.exam.examination.adpater.repository.endity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "t_examination")
public class ExaminationEntity {
    @Id
    private String id;

    private String quizzes;

    private String teacherId;

    private int duration;

    private LocalDateTime startedTime;

    private LocalDateTime submittedTime;
}
