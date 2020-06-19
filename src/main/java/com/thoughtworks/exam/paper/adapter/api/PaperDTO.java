package com.thoughtworks.exam.paper.adapter.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaperDTO {
    private String paperId;

    public static PaperDTO from(final String paperId) {
        return new PaperDTO(paperId);
    }


}
