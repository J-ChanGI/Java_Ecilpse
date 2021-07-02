package com.icia.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dto.memberDTO;
import com.icia.project.service.memberService;

@Controller
public class memberController {

	@Autowired
	private memberService ms;
	
	private ModelAndView mav;
	
	
	@RequestMapping(value="/membershipjoin")
	public String membershipjoin() {
		return "membership";
	}
	@RequestMapping(value="/loginjoin")
	public String loginjoin() {
		return "login";
	}
	
	@RequestMapping(value="/membership") // 회원가입 처리
	public ModelAndView membership(@ModelAttribute memberDTO memberdto) {
		System.out.println("membership 컨트롤" + memberdto);
		mav = ms.membership(memberdto);
		return mav;
		
	}
	
	
	
	@RequestMapping(value="/idcheck") // id 중복 여부 확인 
	public @ResponseBody String idcheck(@RequestParam("mid") String mid) {
		System.out.println("idcheck 컨트롤 "+ mid);
		String result = ms.idcheck(mid);
		return result;
	}
	
}
