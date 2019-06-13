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
@Table(name="el_feedback")
public class ElFeedback {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name="el_feedback_id")
	    private int elFeedbackId;
	    
	    @Column(name="el_feedback_emp_name")
	    private String elFeedbackEmpName;
	    
	    @Column(name="el_feedback_emp_id")
	    private int elFeedbackEmpId;
	    
	    @Column(name="el_feedback_content")
	    private String elFeedbackContent;

		public int getElFeedbackId() {
			return elFeedbackId;
		}

		public void setElFeedbackId(int elFeedbackId) {
			this.elFeedbackId = elFeedbackId;
		}

		public String getElFeedbackEmpName() {
			return elFeedbackEmpName;
		}

		public void setElFeedbackEmpName(String elFeedbackEmpName) {
			this.elFeedbackEmpName = elFeedbackEmpName;
		}

		public int getElFeedbackEmpId() {
			return elFeedbackEmpId;
		}

		public void setElFeedbackEmpId(int elFeedbackEmpId) {
			this.elFeedbackEmpId = elFeedbackEmpId;
		}

		public String getElFeedbackContent() {
			return elFeedbackContent;
		}

		public void setElFeedbackContent(String elFeedbackContent) {
			this.elFeedbackContent = elFeedbackContent;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((elFeedbackContent == null) ? 0 : elFeedbackContent.hashCode());
			result = prime * result + elFeedbackEmpId;
			result = prime * result + ((elFeedbackEmpName == null) ? 0 : elFeedbackEmpName.hashCode());
			result = prime * result + elFeedbackId;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ElFeedback other = (ElFeedback) obj;
			if (elFeedbackContent == null) {
				if (other.elFeedbackContent != null)
					return false;
			} else if (!elFeedbackContent.equals(other.elFeedbackContent))
				return false;
			if (elFeedbackEmpId != other.elFeedbackEmpId)
				return false;
			if (elFeedbackEmpName == null) {
				if (other.elFeedbackEmpName != null)
					return false;
			} else if (!elFeedbackEmpName.equals(other.elFeedbackEmpName))
				return false;
			if (elFeedbackId != other.elFeedbackId)
				return false;
			return true;
		}

		
	    
}
