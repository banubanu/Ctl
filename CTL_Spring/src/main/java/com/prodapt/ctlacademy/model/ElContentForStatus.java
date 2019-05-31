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
public class ElContentForStatus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="el_course_id")
     private int id;
     
    @Column(name="el_content_type")
    private String elContentType ;
    
    @Column(name="el_domain_name")
  	private String elDomainName ;
    
    @Column(name="el_course_name")
  	private String elCourseName;
    
    @Column(name="el_course_desc")
  	private String elCourseDesc;
     
    @Column(name="el_trainer")
  	private String elTrainer ;
    
    @Column(name="el_submitted_date")
  	private String elSubmitedDate;
    
    @Column(name="el_course_img")
  	private String elCourseImage;
    
    @Column(name="el_content")
  	private String elCourseContent;

    @Column(name="el_survey_feedback_link")
  	private String elSurveyLink;
    
    @Column(name="el_duration")
  	private int elDuration;
    
    @Column(name="el_assesment_correct_answers")
  	private String elAnswers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElContentType() {
		return elContentType;
	}

	public void setElContentType(String elContentType) {
		this.elContentType = elContentType;
	}

	public String getElDomainName() {
		return elDomainName;
	}

	public void setElDomainName(String elDomainName) {
		this.elDomainName = elDomainName;
	}

	public String getElCourseName() {
		return elCourseName;
	}

	public void setElCourseName(String elCourseName) {
		this.elCourseName = elCourseName;
	}

	public String getElCourseDesc() {
		return elCourseDesc;
	}

	public void setElCourseDesc(String elCourseDesc) {
		this.elCourseDesc = elCourseDesc;
	}

	public String getElTrainer() {
		return elTrainer;
	}

	public void setElTrainer(String elTrainer) {
		this.elTrainer = elTrainer;
	}

	public String getElSubmitedDate() {
		return elSubmitedDate;
	}

	public void setElSubmitedDate(String elSubmitedDate) {
		this.elSubmitedDate = elSubmitedDate;
	}

	public String getElCourseImage() {
		return elCourseImage;
	}

	public void setElCourseImage(String elCourseImage) {
		this.elCourseImage = elCourseImage;
	}

	public String getElCourseContent() {
		return elCourseContent;
	}

	public void setElCourseContent(String elCourseContent) {
		this.elCourseContent = elCourseContent;
	}

	public String getElSurveyLink() {
		return elSurveyLink;
	}

	public void setElSurveyLink(String elSurveyLink) {
		this.elSurveyLink = elSurveyLink;
	}

	public int getElDuration() {
		return elDuration;
	}

	public void setElDuration(int elDuration) {
		this.elDuration = elDuration;
	}

	public String getElAnswers() {
		return elAnswers;
	}

	public void setElAnswers(String elAnswers) {
		this.elAnswers = elAnswers;
	}
}
