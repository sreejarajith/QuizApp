package com.sreeja.quizapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sreeja.quizapp.dao.QuestionDao;
import com.sreeja.quizapp.model.Question;
import com.sreeja.quizapp.service.QuestionService;

@RestController
@RequestMapping("/question")

public class QuestionController {

	@Autowired
	QuestionService questionservice;
	@Autowired
	QuestionDao questiondao;

	@GetMapping("/allquestions")
	
	  public List<Question> getQuestions() {
		return  questionservice.getAllQuestions();
	  
	  }
	 
	/*
	 * public List<Question> getQuestions(){ List<Question> output =
	 * questiondao.findAll(); return output; }
	 */
	/*
	 * List<Question>x=new ArrayList<>(getQuestions());
	 * 
	 * public void print() { System.out.println(x); }
	 */

	/*
	 * @GetMapping("/category") public List<Question> findByCategory(){ return
	 * questiondao.findByCategory("java");
	 */



 @GetMapping("/allQuestion") public String getQuestion() { return "Hi";
 
 }
}
