package com.neo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.neo.dto.FeedbackDto;
import com.neo.model.Feedback;
import com.neo.repository.FeedbackRepository;
import com.neo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@AutoConfigureOrder
	private ModelMapper modelMapper;

	@Override
	public FeedbackDto postFeedback(FeedbackDto feedbackDto) {
		Feedback feedback = this.modelMapper.map(feedbackDto, Feedback.class);
		Feedback saveFeedback = this.feedbackRepository.save(feedback);
		return this.modelMapper.map(saveFeedback, FeedbackDto.class);
	}

}
