package com.mysite.sbb.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		return this.questionRepository.findAll();
	}


	public Question getQuestion(Integer id) {
		Optional<Question> q = this.questionRepository.findById(id);
		if(q.isPresent()) {
			return q.get();
		}else {
			throw new DataNotFoundException("question not found");
		}
	}


}
