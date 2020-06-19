package com.thoughtworks.exam.quiz.adapter.repository;

import com.thoughtworks.exam.quiz.adapter.repository.entity.BlankQuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlankQuizJPARepository extends JpaRepository<BlankQuizEntity, String> {

}

