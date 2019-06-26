package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.SurveyIdFetching;


@Repository
public interface SurveyIdRepository extends MongoRepository<SurveyIdFetching, String> {

	List<SurveyIdFetching> findByUserIDAndSurveyID(String userID, String surveyID);

	Page<SurveyIdFetching> findByUserID(String userID, Pageable pageableRequest);
	
	
	

	
	

	
	
	
}
