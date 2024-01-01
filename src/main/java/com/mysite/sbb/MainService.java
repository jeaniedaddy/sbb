package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MainService {
	
	private final QuestionRepository questionRepository;
	
	public void inserSamples() {
		if(this.questionRepository.count()>0) {
			return; 
		}

		Question q1 = new Question();
		q1.setSubject("what is sbb");
		q1.setContent("want to know sbb");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);  

		Question q2 = new Question();
		q2.setSubject("what is spring model");
		q2.setContent("is id auto generated?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);  
	}


}