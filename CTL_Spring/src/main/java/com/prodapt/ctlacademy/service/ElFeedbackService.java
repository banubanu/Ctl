package com.prodapt.ctlacademy.service;

import java.util.List;

import com.prodapt.ctlacademy.model.ElFeedback;



public interface ElFeedbackService {
	List<ElFeedback> getAll();
	ElFeedback save(ElFeedback  fbk);

}

