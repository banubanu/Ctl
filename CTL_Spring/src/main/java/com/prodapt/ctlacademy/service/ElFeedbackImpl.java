package com.prodapt.ctlacademy.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.prodapt.ctlacademy.model.ElFeedback;
import com.prodapt.ctlacademy.repository.ElFeedbackRepository;


@Service
public class ElFeedbackImpl implements ElFeedbackService {
	ElFeedbackRepository elFeedbackRepository;
	
	public ElFeedbackImpl(ElFeedbackRepository elFeedbackRepository) {
		// TODO Auto-generated constructor stub
		this.elFeedbackRepository = elFeedbackRepository;
	}
	
	@Override
	public List<ElFeedback> getAll() {
		// TODO Auto-generated method stub
		return elFeedbackRepository.findAll();
	}

	@Override
	public ElFeedback save(ElFeedback fbk) {
		// TODO Auto-generated method stub
		return elFeedbackRepository.save(fbk);
	}
	
	

}
