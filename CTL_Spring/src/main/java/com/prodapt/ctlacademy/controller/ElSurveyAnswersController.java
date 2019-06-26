package com.prodapt.ctlacademy.controller;

import java.sql.Array;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.ctlacademy.model.ElContent;
import com.prodapt.ctlacademy.model.ElCorrectAnswers;
import com.prodapt.ctlacademy.model.SurveyIdFetching;
import com.prodapt.ctlacademy.model.SurveyResult;
import com.prodapt.ctlacademy.repository.ElSurveyRepository;
import com.prodapt.ctlacademy.repository.SurveyIdRepository;

@RestController
@CrossOrigin("*")

@RequestMapping("/SurveyAnswers")
public class ElSurveyAnswersController {
	
	@Autowired
	ElSurveyRepository elSurveyRepository;
	
	@Autowired
	SurveyIdRepository surveyIdRepository;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@GetMapping("get")
	public List<SurveyResult> getAll() {
		 
		return this.elSurveyRepository.findAll(new Sort(Sort.Direction.DESC, "_id"));
		
		
//		To fetch based on index value
//		Pageable pageableRequest = PageRequest.of(0, 1);
//	    Page<SurveyResult> pages = elSurveyRepository.findAll(pageableRequest);
//	    List<SurveyResult> users = pages.getContent();
//	    return users;

	}
	
	@GetMapping("getByUserID")
	
	public List <SurveyResult> findByUserID(@RequestParam String UserID) {
		return  this.elSurveyRepository.findByUserID(UserID,new Sort(Sort.Direction.DESC, "_id"));
	
	}
	
    @GetMapping("getByUserIDAndSurveyLink")
	
	public List <SurveyResult> findByUserIDAndSurveyLink(@RequestParam String UserID,@RequestParam String SurveyID) {
		return  this.elSurveyRepository.findByUserIDAndSurveyID(UserID,SurveyID);
	
	}
    
    @GetMapping("getByID")
	
   	public List <SurveyResult> findByUserIDAndID(@RequestParam ObjectId _id) {
   		return  this.elSurveyRepository.findBy_id(_id);
   		
   		
   	
   	}
    

    
//    To Fetch SurveyId
    
    @GetMapping("getByUserIDAndLink")
	
   	public List<SurveyIdFetching> findByUserIDAndSurvey(@RequestParam String UserID,@RequestParam String SurveyID) {
   		return  this.surveyIdRepository.findByUserIDAndSurveyID(UserID,SurveyID);
   	
   	}
    
    @GetMapping("getBy")
 	public List<SurveyIdFetching> findByUserIDAndSur(@RequestParam String UserID) {
    	  
    Pageable pageableRequest = PageRequest.of(1, 1);
    Page<SurveyIdFetching> pages = surveyIdRepository.findByUserID(UserID,pageableRequest);
    List<SurveyIdFetching> users = pages.getContent();
    return users;
    
   }
    

    @RequestMapping("Getanswers")
    public Object[] answers(@RequestParam int courseid) {
    	ElCorrectAnswers list = new  ElCorrectAnswers();
	     Query query = entityManager.createNativeQuery("select el_assesment_correct_answers from ctlacademy.el_course_content where el_course_id="+courseid,ElCorrectAnswers.class);
	       list = (ElCorrectAnswers) query.getSingleResult();
    	
	       String[] splitedContent = list.getCorrectanswers().split(";");
    	return splitedContent;
    	
    }
    
    public class Simple{
    	 
        public void main(String a[]){
            Object[] s1 = {"aa","bb","1","dd","ee"};
            Object[] s2 = {"aa","ss","1","dd","aa"};
            for(int i=0;i<s1.length;i++){
                
                    if(s1[i]==s2[i]){
                       System.out.println(s1[i]);
                 
                }
            }
        }
    }
}