package com.sreeja.quizapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
//@Table(name="question")
public class Question {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
private Integer id;
private String question_title;
private String option1;
private String option2;
private String option3;
private String option4;
private String right_answer;
private String difficulty_level;
private String category;
}
