package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.hibernate.dialect.HANASqlAstTranslator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

import jakarta.transaction.Transactional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerRepository answerRepository; 
	
	@Test
	void testJpa() {
		for(int i = 0 ; i <300 ; i++) {
			String subject = String.format("this is test data:[%03d]", i);
			String content = "no content";
			
			this.questionService.create(subject, content);
		}
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		List<Answer> al = q.getAnswerList();
//		assertEquals(1,al.size());
	}
		
//	@Test
//	void testJpa() {
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		
//		Answer a = new Answer();
//		a.setContent("Good question");
//		a.setCreateDate(LocalDateTime.now());
//		a.setQuestion(oq.get());
//		
//		this.answerRepository.save(a);

//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1,this.questionRepository.count());
		
//		Question q1 = this.questionRepository.findBySubject("what is sbb?");
//		Question q1 = this.questionRepository.findBySubjectAndContent("what is sbb?","wanna know about sbb");
//		assertEquals(1,q1.getId());

//		List<Question> ql = this.questionRepository.findBySubjectLike("%sbb%");
//		System.out.println(ql.size());
//		assertEquals( 1, ql.size() );
//	}

}
