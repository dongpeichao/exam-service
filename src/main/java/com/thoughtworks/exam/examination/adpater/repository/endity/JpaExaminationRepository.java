package com.thoughtworks.exam.examination.adpater.repository.endity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaExaminationRepository extends JpaRepository<ExaminationEntity, String> {
}
