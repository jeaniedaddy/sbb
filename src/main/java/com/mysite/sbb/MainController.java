package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		System.out.println("SBB");
		return "index"; 
		
	}
	
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "<h1>Welcome to SBB</h1>"; 
	}

}
