package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.ElCourseContent;

@Repository
public interface ElCourseContentRepository extends JpaRepository<ElCourseContent,Integer>{

	  @Query(value="SELECT count(el_course_id) from  el_course_content",nativeQuery=true)
	     List<Object[]> findCount();

}
