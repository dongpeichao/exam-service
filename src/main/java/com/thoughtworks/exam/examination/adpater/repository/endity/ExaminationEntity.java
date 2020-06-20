package com.thoughtworks.exam.examination.adpater.repository.endity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.exam.examination.domain.model.examination.Examination;
import com.thoughtworks.exam.examination.domain.model.examination.ExaminationRepository;
import com.thoughtworks.exam.paper.domain.model.paper.Paper;
import com.thoughtworks.exam.paper.domain.model.paper.PaperId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "t_examination")
public class ExaminationEntity {
    @Id
    private String id;

    private String blankQuizzes;

    private String teacherId;

    private String startedTime;

    public Paper toModel() {
        return Paper.builder()
                .teacherId(teacherId)
                .id(new PaperId(id))
                .blankQuizzes(new ObjectMapper().convertValue(blankQuizzes, List.class))
                .build();
    }


    public static ExaminationEntity fromModel(Examination examination) {
        ExaminationEntity result = new ExaminationEntity();
        result.id = examination.getId().toString();
        try {
            result.blankQuizzes = new ObjectMapper().writeValueAsString(examination.getBlankQuizzes());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        result.teacherId = examination.getTeacherId();
        return result;
    }
}
