package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class QuestionController {

	private final QuestionService questionService; 
	
	@GetMapping("/question/list")
	public String list(Model model){
		List<Question> list = this.questionService.getList();
		model.addAttribute("questionList", list);
		return "question_list";
		
	}

}
