package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.ElCourseResult;
import com.prodapt.ctlacademy.model.SurveyResult;

@Repository
public interface ElCourseResultRepository extends JpaRepository<ElCourseResult, Long> {
	
	ElCourseResult findByelSurveyId(String elSurveyId);
	
   @Query(value="SELECT el_assesment_marks FROM ctlacademy.el_course_result WHERE el_survey_id=?1",nativeQuery=true)
   List<Object[]> findelAssesmentMarks(String id);
   
  ElCourseResult findByelSurveyIdAndElEmpId(String elSurveyId, int elEmpId);
  
  @Query(value="SELECT * FROM ctlacademy.el_course_result WHERE el_survey_id=?1 AND el_emp_id=?2",nativeQuery=true)
  ElCourseResult findByelSurveyId(String elSurveyId, int elEmpId);





	
}
