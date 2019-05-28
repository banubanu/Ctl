package com.prodapt.ctlacademy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.ElComment;



@Repository
public interface ElCommentRepository extends JpaRepository<ElComment,Integer> {

	ElComment findByElCommentCourseId(int c);

	
}
