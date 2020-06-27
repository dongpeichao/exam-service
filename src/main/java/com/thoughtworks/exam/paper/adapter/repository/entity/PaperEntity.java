package com.thoughtworks.exam.paper.adapter.repository.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.exam.paper.domain.model.paper.Paper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Entity
@Table(name = "t_paper")
public class PaperEntity {
    @Id
    private String id;

    private String quizzes;

    private String teacherId;

    public static PaperEntity fromModel(Paper paper) {
        PaperEntity result = new PaperEntity();
        result.id = paper.getId().toString();
        try {
            result.quizzes = new ObjectMapper().writeValueAsString(paper.getQuizzes());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        result.teacherId = paper.getTeacherId();
        return result;
    }
}
