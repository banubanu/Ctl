package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prodapt.ctlacademy.model.ElNomination;
import com.prodapt.ctlacademy.model.ElNominationForOverallPercentage;

public interface MyCourseRepository extends JpaRepository<ElNomination,Integer> {

	  @Query(value="SELECT count(el_nom_course_id) FROM ctlacademy.el_nomi WHERE el_emp_id=?1",nativeQuery=true)
      List<Object[]> findCount(int empid);
      
    
	}


