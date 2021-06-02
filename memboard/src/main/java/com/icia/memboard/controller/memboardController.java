package com.icia.memboard.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.memboardDTO;
import com.icia.memboard.service.memboardService;

@Controller
public class memboardController {
	
	@Autowired
	private memboardService mbs;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/memberjoin") // 회원가입 화면 띄우기
	public String memberjoin() {
		return "member";
	}
	
	@RequestMapping(value="/member") // 회원가입 처리
	public ModelAndView member(@ModelAttribute memboardDTO memboard) throws IllegalStateException, IOException {
		mav = mbs.member(memboard);
		return mav;
	}
	
	
	@RequestMapping(value="/loginjoin") // 로그인 화면 띄우기
	public String loginjoin() {
		return "login";
	}
	
	@RequestMapping(value="/login")  // 로그인 처리
	public ModelAndView memboardlogin(@ModelAttribute memboardDTO memboard) {
		System.out.println("login 컨트롤");
		mav = mbs.memboardlogin(memboard);		
		return mav;
	}
	@RequestMapping(value="/mypages") // 마이페이지 띄우기
	public String mypage() {
		return "mypage";
	}
	
	@RequestMapping(value="/mbviewpage") // 회원정보 페이지  띄우기
	public String mbview() {
	 System.out.println("엠비뷰");
		return "mbview";
	}
//	@RequestMapping(value="/mbview") // 회원 정보 view 
//	public ModelAndView mbview(@RequestParam("mid")String mid) {
//		System.out.println("view 컨트롤 " + mid);
//		mav = mbs.mbview(mid);
//		return mav;
//	}
	@RequestMapping(value="/memboardupdate")
	public ModelAndView update() {
		System.out.println("update 컨트롤");
		mav = mbs.update();
		return mav;
	}
	
	@RequestMapping(value="/updateprocess")
	public ModelAndView updateprocess (@ModelAttribute memboardDTO memboard) {
		System.out.println("updateprocess 컨트롤");
		mav = mbs.updateprocess(memboard);
		return mav;
	}
	
	}
	


