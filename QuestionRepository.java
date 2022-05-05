package com.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entity.Question;
@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question,Long> {

}
