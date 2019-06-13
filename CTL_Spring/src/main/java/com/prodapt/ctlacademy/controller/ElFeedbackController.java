package com.prodapt.ctlacademy.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.prodapt.ctlacademy.model.ElFeedback;

import com.prodapt.ctlacademy.repository.ElFeedbackRepository;
//import com.prodapt.propad.model.PropadInitiateEmployee;
import com.prodapt.ctlacademy.service.ElFeedbackService;

@RestController
@CrossOrigin("*")

@RequestMapping("feedback")
public class ElFeedbackController {

	@Autowired
	ElFeedbackService elFeedbackService;

	public ElFeedbackController(ElFeedbackService elFeedbackService) {
		// TODO Auto-generated constructor stub
		this.elFeedbackService = elFeedbackService;
	}
	@Autowired
	ElFeedbackRepository elFeedbackRepository;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@PostMapping("save")
	public ElFeedback save(@RequestBody ElFeedback feedback) {
		 
		return this.elFeedbackRepository.save(feedback);

	}
	
//	@GetMapping("get")
//	
//		public ElComment findAllByElCommentCourseId(@RequestParam int courseID) {
//			return this.elCommentRepository.findByElCommentCourseId(courseID);		
//		}
	@RequestMapping(value = "/get-feedback", method = RequestMethod.GET)
	public List<ElFeedback> getUsers() {
		return this.elFeedbackService.getAll();
	}
}
