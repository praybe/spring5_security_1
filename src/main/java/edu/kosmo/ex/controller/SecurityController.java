package edu.kosmo.ex.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@RequestMapping("/security/*")
@Controller
public class SecurityController {
	
	@GetMapping("/all")
	public String all() {
		
		System.out.println("do all access everybody");
		return "/security/all";
	}
	 
	//멤버 치고 들어옴
	@GetMapping("/member") 
	public String member() {
		
		System.out.println("logined member");
		return "/security/member";
	}
	
}
