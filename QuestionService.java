package com.assignment.service;

import java.util.Optional;

import com.assignment.entity.Question;

public interface QuestionService {

	public Iterable<Question> findAll();
	public Question save(Question question);
	public Optional<Question> getQuestion(Long qId);
	public String deleteQuestionById(long qId);
	public Question updateQuestion(Question question);
	
}
