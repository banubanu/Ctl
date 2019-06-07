package com.prodapt.ctlacademy.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.ctlacademy.model.ElContent;
import com.prodapt.ctlacademy.model.ElContentForStatus;
import com.prodapt.ctlacademy.model.ElCourseContent;
import com.prodapt.ctlacademy.model.ElNomination;
import com.prodapt.ctlacademy.model.ElNominationForOverallPercentage;
import com.prodapt.ctlacademy.model.ElNominationForStatus;
import com.prodapt.ctlacademy.repository.MyCourseRepository;


@RestController

@RequestMapping("MyCourse")
public class MyCourseController {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Autowired
	MyCourseRepository myCourseRepository;
	
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
	
	
	 @GetMapping("MyCourseCount")
     public List<Object[]> getcount(@RequestParam int empid){
        return myCourseRepository.findCount(empid);
  
  
     }
     
     @RequestMapping(value = { "/Countcontent", "" }, method = RequestMethod.GET)
     public int get(@RequestParam int id){
    		ElContent list = new  ElContent();
    		
    		 Query query = entityManager.createNativeQuery( "select el_content from ctlacademy.el_course_content where el_course_id="+id,ElContent.class);
  	       list = (ElContent) query.getSingleResult();
  	       
  	     String[] contentArray=list.getElCourseContent().split(";");
  	     
  	     System.out.println("Count is "+contentArray.length);
    	   int count=contentArray.length;
		return count;
    	 
		
     }
     
     @RequestMapping(value = { "/percentage", "" }, method = RequestMethod.GET)
     public int percent(@RequestParam int id,@RequestParam Integer code){
    		ElContent list = new  ElContent();
    		
    		 Query query = entityManager.createNativeQuery( "select el_content from ctlacademy.el_course_content where el_course_id="+id,ElContent.class);
  	       list = (ElContent) query.getSingleResult();
  	       
  	     String[] contentArray=list.getElCourseContent().split(";");
  	     
  	     System.out.println("Count is "+contentArray.length);
    	   int count=contentArray.length;
    	   
    	   
    	   Query query4 = entityManager.createNativeQuery("select el_page_index from ctlacademy.el_user_details where el_empid=" + code + " and el_ucourse_id=" + id);

  	     Integer index = Integer.parseInt(query4.getSingleResult().toString()); 
  	     if(index==0) {
  	       int percentage=(index*100/count);
  	       return percentage;
  	     }
  	     
  	  	 
  	     index++;
  	     int percentage=(index*100/count);
    	   
  	     System.out.println("Percentage is "+percentage);
		return percentage;
    	 
		
     }
     
     
// 	@RequestMapping(value="/check")
// 	public List get(@RequestParam Integer code)
// 	{  
//         Query query = entityManager.createNativeQuery(
// 	   "select el_nom_course_id from ctlacademy.el_nomi where el_emp_id="+code);
// 	         
// 	         List course = query.getResultList(); 
// 	         return  course; 
// 	}
     
     @RequestMapping(value = { "/allCoursePercentage", "" }, method = RequestMethod.GET)
     public List allcoursepercent(@RequestParam int id,@RequestParam Integer code){
    	 
    	 ElContent list1 = new  ElContent();
    	
    	 	
    	         Query query = entityManager.createNativeQuery(
    	 	   "select el_nom_course_id from ctlacademy.el_nomi where el_emp_id="+code);
    	 	         
    	 	         List course = query.getResultList(); 
    	 
    	 	        System.out.println("Courses "+course);
    	 	        String co1=course.toString();
    	 	       System.out.println("Courses "+co1);
    	 	      System.out.println("Courses "+co1.charAt(0));
//    	 	     for(int i=0;i<course.length;i++) {
//    	 	    	 
//    	 	     }
//    	 	        
  		 Query query1 = entityManager.createNativeQuery( "select el_content from ctlacademy.el_course_content where el_course_id="+id,ElContent.class);
	     list1 = (ElContent) query1.getSingleResult();
         String[] contentArray=list1.getElCourseContent().split(";");
  	     
  	     System.out.println("Count is "+contentArray.length);
    	   Integer count=contentArray.length;
    	   
    	   
       Query query4 = entityManager.createNativeQuery("select el_page_index from ctlacademy.el_user_details where el_empid=" + code + " and el_ucourse_id=" + id);
  	   Integer index = Integer.parseInt(query4.getSingleResult().toString());    
  	   Integer percentage=(index*100/count);
      
  	   System.out.println("For all courses Percentage is "+percentage);
  	     
		return course;
    	   
    	 
    	 
		
     }
	
}
