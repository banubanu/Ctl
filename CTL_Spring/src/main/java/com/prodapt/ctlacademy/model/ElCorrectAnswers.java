package com.prodapt.ctlacademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="el_course_content")
public class ElCorrectAnswers {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	   @Column(name="el_assesment_correct_answers")
	  	private String correctanswers;

	public String getCorrectanswers() {
		return correctanswers;
	}

	public void setCorrectanswers(String correctanswers) {
		this.correctanswers = correctanswers;
	}
	    
		

}
