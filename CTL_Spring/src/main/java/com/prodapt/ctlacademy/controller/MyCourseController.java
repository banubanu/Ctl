package com.prodapt.ctlacademy.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.ctlacademy.model.ElContentForStatus;
import com.prodapt.ctlacademy.model.ElCourseContent;
import com.prodapt.ctlacademy.model.ElNominationForStatus;


@RestController

@RequestMapping("MyCourse")
public class MyCourseController {

	@PersistenceContext
	EntityManager entityManager;
	
	
	
	@RequestMapping(value="/Courses")
	public List<ElCourseContent> getDetails(@RequestParam Integer code)
	{  
        Query query = entityManager.createNativeQuery(
	   "select DISTINCT `el_course_content`.el_course_id,el_content_type,el_domain_name,el_course_name,el_course_desc,el_trainer,el_submitted_date,el_content,el_course_img,el_no_of_questions,el_assesment_correct_answers,el_survey_feedback_link,el_duration from `ctlacademy`.`el_course_content`,`ctlacademy`.`el_nomi` where el_course_content.el_course_id = el_nomi.el_nom_course_id and el_nomi.el_emp_id='"+code+"'",ElCourseContent.class);
	         
	         List<ElCourseContent> course = query.getResultList(); 
	         return  course; 
	}
	
	@RequestMapping(value="/CoursesWithStatus")
	public List<ElNominationForStatus> getDetail(@RequestParam Integer code)
	{  
        Query query = entityManager.createNativeQuery(
	   "select DISTINCT `el_course_content`.el_course_id,el_content_type,el_domain_name,el_course_name,el_course_desc,el_trainer,el_submitted_date,el_content,el_duration,el_course_img,el_no_of_questions,el_assesment_correct_answers,el_survey_feedback_link,el_nom_status,el_nom_id,el_nom_course,el_nom_course_id from `ctlacademy`.`el_course_content`,`ctlacademy`.`el_nomi` where el_course_content.el_course_id = el_nomi.el_nom_course_id and el_nomi.el_emp_id='"+code+"'",ElNominationForStatus.class);
	         
	         List<ElNominationForStatus> course = query.getResultList(); 
	         return  course; 
	}
	
//	@RequestMapping(value="/Course")
//	public List get(@RequestParam Integer code)
//	{  
//        Query query = entityManager.createNativeQuery(
//	   "select DISTINCT `el_course_content`.el_course_id,el_content_type,el_domain_name,el_course_name,el_course_desc,el_trainer,el_submitted_date,el_content,el_duration,el_course_img,el_no_of_questions,el_assesment_correct_answers,el_survey_feedback_link,el_nom_status,el_nom_id,el_nom_course,el_nom_course_id from `ctlacademy`.`el_course_content`,`ctlacademy`.`el_nomi` where el_course_content.el_course_id = el_nomi.el_nom_course_id and el_nomi.el_emp_id='"+code+"'");
//	         
//	         List course = query.getResultList(); 
//	         return  course; 
//	}
	
}
