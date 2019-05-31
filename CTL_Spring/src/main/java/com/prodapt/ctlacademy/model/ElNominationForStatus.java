package com.prodapt.ctlacademy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="el_nomi")
public class ElNominationForStatus {

    @Id
    @Column(name="el_nom_id")
     private int id;
     
  
    @Column(name="el_nom_status")
  	private String elNomStatus ;
    
   
  
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="el_nom_course_id",referencedColumnName="el_course_id")
    
    private ElContentForStatus elContentForStatus;
    
    
    public ElNominationForStatus() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public ElContentForStatus getElContentForStatus() {
		return elContentForStatus;
	}

	public void setElContentForStatus(ElContentForStatus elContentForStatus) {
		this.elContentForStatus = elContentForStatus;
	}

	public String getElNomStatus() {
		return elNomStatus;
	}

	public void setElNomStatus(String elNomStatus) {
		this.elNomStatus = elNomStatus;
	}
}

	
