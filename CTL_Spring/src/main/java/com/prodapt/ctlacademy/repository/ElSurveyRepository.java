package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.SurveyResult;

@Repository
public interface ElSurveyRepository  extends MongoRepository <SurveyResult, Long> {
	
//	List<SurveyResult> findByUserID(String UserID);

	List<SurveyResult> findByUserIDAndSurveyID(String userID, String surveyID);

	List<SurveyResult> findBy_id(ObjectId _id);

	List<SurveyResult> findByUserID(String userID, Sort sort);

	


	
	
	


	
	
	
	
	
	

}
