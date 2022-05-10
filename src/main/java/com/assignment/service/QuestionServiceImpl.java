package com.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.Question;
import com.assignment.repository.QuestionRepository;

@Service("productService")
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Iterable<Question> findAll() {
		
		return questionRepository.findAll();
	}

	@Override
	public Question save(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> getQuestion(Long qId) {
		
		return questionRepository.findById(qId);
	}

	@Override
	public String deleteQuestionById(long qId) {
		 questionRepository.deleteById(qId);
		 return "Successfully deleted!!";
	}

	@Override
	public Question updateQuestion(Question question) {
		return questionRepository.save(question);
		
	}

}
