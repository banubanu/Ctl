package com.prodapt.ctlacademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="el_nomi")
public class ElNominationForOverallPercentage {
	

    @Id
    @Column(name="el_nom_id")
     private int id;
	
    @Column(name="el_nom_course_id")
	  	private int elNomCourseId;

    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getElNomCourseId() {
		return elNomCourseId;
	}

	public void setElNomCourseId(int elNomCourseId) {
		this.elNomCourseId = elNomCourseId;
	}
    

}
