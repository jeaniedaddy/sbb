package com.mysite.sbb;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbb.question.Question;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final MainService mainService;

	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		System.out.println("SBB");
		return "index"; 
		
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
	@GetMapping("/insert-samples")
	@ResponseBody
	public String insertSamples() {
		try{
			this.mainService.inserSamples();
			return "good";
		}catch(Exception e) {
			return "error";
		}
	}

}
