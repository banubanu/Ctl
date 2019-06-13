package com.prodapt.ctlacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.ElFeedback;



@Repository
public interface ElFeedbackRepository extends JpaRepository<ElFeedback,Integer> {

//	ElFeedback findByElFeedbackCourseId(int c);

	
}

