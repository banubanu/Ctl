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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.prodapt.ctlacademy.model.ElComment;

import com.prodapt.ctlacademy.repository.ElCommentRepository;

@RestController
@CrossOrigin("*")

@RequestMapping("/comment")
public class ElCommentController {

	
	@Autowired
	ElCommentRepository elCommentRepository;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@PostMapping("save")
	public ElComment save(@RequestBody ElComment comment) {
		 
		return this.elCommentRepository.save(comment);

	}
	
//	@GetMapping("get")
//	
//		public ElComment findAllByElCommentCourseId(@RequestParam int courseID) {
//			return this.elCommentRepository.findByElCommentCourseId(courseID);		
//		}
	
	@RequestMapping(value="/getComments")
	public List<ElComment> getDetails(@RequestParam Integer id)
	{  
        Query query = entityManager.createNativeQuery(
	   "select * from el_comment where el_comment_course_id='"+id+"'",ElComment.class);
	         
	         List<ElComment> comment = query.getResultList(); 
	         return  comment; 
	}
	
}
