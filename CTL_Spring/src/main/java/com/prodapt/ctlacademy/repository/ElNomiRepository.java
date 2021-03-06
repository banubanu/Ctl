package com.prodapt.ctlacademy.repository;




	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

	import com.prodapt.ctlacademy.model.ElNomination;
import com.prodapt.ctlacademy.model.ElUser;

	@Repository
	public interface ElNomiRepository  extends JpaRepository<ElNomination,Integer>{

	

		ElNomination findByElNomEmpIdAndElNomCourseId(int elNomEmpId, int elNomCourseId);

		  @Query(value="SELECT COUNT(*) FROM ctlacademy.el_nomi as COUNT WHERE el_nom_status ='Pending' ",nativeQuery=true)
          List<Object[]> findCount();


	

	}

