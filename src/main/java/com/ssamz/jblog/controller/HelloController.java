package com.ssamz.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
//
@Controller  // 해당 객체가 컴포넌트로 스캔되도록 지정
public class HelloController {
	@GetMapping("/html")  // GET방식으로 요청을 처리
	public String html() {
		System.out.println("HTML 파일이 요청됨");
		return "redirect:hello.html";
	}
	
	@GetMapping("/image")
	public String image() {
		System.out.println("이미지 파일이 요청됨");
		return "redirect:image/bowl.png";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("JSP 파일이 요청됨");
		model.addAttribute("username", "지훈");
		return "hello";  // View의 이름
	}

}
