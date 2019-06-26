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
@Table(name="el_course_result")

public class ElCourseResult {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	    @Column(name="el_result_id")
	    private int elResultId;
	    
	    @Column(name="el_emp_id")
	    private int elEmpId;
	    
	    @Column(name="el_survey_id")
	    private String elSurveyId;
	    
	    @Column(name="el_result_course_id")
	    private String elResultCourseId;
	    
	    @Column(name="el_survey_feedback_link")
	    private String elSurveyFeedbackLink;
	    
	    @Column(name="el_User_answers")
	    private String elUserAnswers;
	    
	    @Column(name="el_assesment_marks")
	    private String elAssesmentMarks;

		public int getElResultId() {
			return elResultId;
		}

		public void setElResultId(int elResultId) {
			this.elResultId = elResultId;
		}

		public int getElEmpId() {
			return elEmpId;
		}

		public void setElEmpId(int elEmpId) {
			this.elEmpId = elEmpId;
		}

		public String getElSurveyId() {
			return elSurveyId;
		}

		public void setElSurveyId(String elSurveyId) {
			this.elSurveyId = elSurveyId;
		}

		public String getElResultCourseId() {
			return elResultCourseId;
		}

		public void setElResultCourseId(String elResultCourseId) {
			this.elResultCourseId = elResultCourseId;
		}

		public String getElSurveyFeedbackLink() {
			return elSurveyFeedbackLink;
		}

		public void setElSurveyFeedbackLink(String elSurveyFeedbackLink) {
			this.elSurveyFeedbackLink = elSurveyFeedbackLink;
		}

		public String getElUserAnswers() {
			return elUserAnswers;
		}

		public void setElUserAnswers(String elUserAnswers) {
			this.elUserAnswers = elUserAnswers;
		}

		public String getElAssesmentMarks() {
			return elAssesmentMarks;
		}

		public void setElAssesmentMarks(String elAssesmentMarks) {
			this.elAssesmentMarks = elAssesmentMarks;
		}
	    
	    
	    
	    

}
