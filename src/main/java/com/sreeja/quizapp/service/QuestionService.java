package com.sreeja.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreeja.quizapp.dao.QuestionDao;
import com.sreeja.quizapp.model.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questiondao;

	public List<Question> getAllQuestions() {
		List<Question> output = questiondao.findAll();
		return output;
		
	}
	
	public void print() {
		
		System.out.println(getAllQuestions());
	}
	
}
