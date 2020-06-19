package com.thoughtworks.exam.paper.application;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class AssemblePaperCommand {
    private String teacherId;
    private List<Quiz> blankQuizzes;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Quiz {
        private String id;
        private int score;
    }
}