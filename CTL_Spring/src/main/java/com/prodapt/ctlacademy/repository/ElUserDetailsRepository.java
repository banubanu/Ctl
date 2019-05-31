package com.prodapt.ctlacademy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prodapt.ctlacademy.model.ElUser;

@Repository
public interface ElUserDetailsRepository extends JpaRepository<ElUser,Integer>{

	ElUser findByElEmpIdAndElUcourseId(int elEmpId, int elUcourseId);

	

	  @Query(value="SELECT COUNT(*) FROM ctlacademy.el_user_details as COUNT WHERE el_ucourse_id=?1",nativeQuery=true)
      List<Object[]> findCount(int id);


}


