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
@Table(name="el_comment")
public class ElComment {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name="el_comment_id")
	    private int elCommentId;
	    
	    @Column(name="el_comment_emp_name")
	    private String elCommentEmpName;
	    
	    @Column(name="el_comment_emp_id")
	    private int elCommentEmpId;
	    
	    @Column(name="el_comment_course_id")
	    private int elCommentCourseId;
	    
	    @Column(name="el_comment_course_name")
	    private String elCommentCourseName;
	    
	    @Column(name="el_comment")
	    private String elComment;

		public int getElCommentId() {
			return elCommentId;
		}

		public void setElCommentId(int elCommentId) {
			this.elCommentId = elCommentId;
		}

		public String getElCommentEmpName() {
			return elCommentEmpName;
		}

		public void setElCommentEmpName(String elCommentEmpName) {
			this.elCommentEmpName = elCommentEmpName;
		}

		public int getElCommentEmpId() {
			return elCommentEmpId;
		}

		public void setElCommentEmpId(int elCommentEmpId) {
			this.elCommentEmpId = elCommentEmpId;
		}

		public int getElCommentCourseId() {
			return elCommentCourseId;
		}

		public void setElCommentCourseId(int elCommentCourseId) {
			this.elCommentCourseId = elCommentCourseId;
		}

		public String getElCommentCourseName() {
			return elCommentCourseName;
		}

		public void setElCommentCourseName(String elCommentCourseName) {
			this.elCommentCourseName = elCommentCourseName;
		}

		public String getElComment() {
			return elComment;
		}

		public void setElComment(String elComment) {
			this.elComment = elComment;
		}
	    
	    
	    

}
