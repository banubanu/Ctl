package com.prodapt.ctlacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.prodapt.ctlacademy.model.ElCourseResult;
import com.prodapt.ctlacademy.model.ElUser;
import com.prodapt.ctlacademy.repository.ElCourseResultRepository;

@RestController
@CrossOrigin("*")

@RequestMapping("courseResult")
public class ElCourseResultController {

	@Autowired
	ElCourseResultRepository elCourseResultRepository;
	
	
	@PostMapping("save")
	public ElCourseResult save(@RequestBody ElCourseResult elCourseResult) {
		 
		return this.elCourseResultRepository.save(elCourseResult);

	}
//	To check whether the Survey Results are stored or not
	@PostMapping("validation")
	public Boolean validateUser(@RequestBody ElCourseResult r) {
		ElCourseResult user=elCourseResultRepository.findByelSurveyIdAndElEmpId(r.getElSurveyId(),r.getElEmpId());
		boolean statusmsg = false;
		if(user!=null) {
			statusmsg=true;
			return statusmsg;
		}else {
			return statusmsg;
		}
	}
	
	  @GetMapping("AssessementMarks")
      public ElCourseResult getcount(@RequestParam String id,@RequestParam int code){
         return elCourseResultRepository.findByelSurveyId(id,code);
   
   
      }
	
	
}
