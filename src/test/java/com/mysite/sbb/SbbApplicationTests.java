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

import jakarta.transaction.Transactional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository; 
	
	@Test
	@Transactional
	void testJpa() {
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
        
        Integer count = (int) this.questionRepository.count();
        System.out.println(count);
		
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
