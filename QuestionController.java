package com.assignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entity.Question;
import com.assignment.service.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
    
	@GetMapping("/questions")
	public ResponseEntity<Iterable<Question>> findAll() {
	
	try {
		
		return new ResponseEntity<Iterable<Question>> (questionService.findAll(),HttpStatus.OK);
	}
	catch (Exception e) {
		
		return new ResponseEntity<Iterable<Question>>(HttpStatus.BAD_REQUEST);
	}
	
}
	@GetMapping("/question/{qId}")
	public Optional<Question>getQuestion(@PathVariable Long qId)  {
		
		return questionService.getQuestion(qId);
			
	}
	
	@PostMapping("/question")
	public ResponseEntity<Question> create(@RequestBody Question question) {
	
	try {
		
		return new ResponseEntity<Question> (questionService.save(question),HttpStatus.OK);
	}
	catch (Exception e) {
		
		return new ResponseEntity<Question>(HttpStatus.BAD_REQUEST);
	}
	
}
	
	@DeleteMapping("/question/{qId}")
    public String deleteQuestion(@PathVariable long qId) {
    	return questionService.deleteQuestionById(qId);
    }
	
	@PutMapping("/question")
	public Question updateQuestion(@RequestBody Question question) {
		
		return questionService.updateQuestion(question);
		
		
	}
	
}