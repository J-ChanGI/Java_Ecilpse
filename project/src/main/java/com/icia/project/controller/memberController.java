package com.icia.project.controller;

import javax.servlet.http.HttpSession;

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
	
	@Autowired
	private HttpSession session;
	
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
	
	@RequestMapping(value="/login") // login 처리 
	public ModelAndView login (@ModelAttribute memberDTO memberdto) {
		System.out.println("login 컨트롤" + memberdto);
		mav = ms.login(memberdto);
		return mav;
	}
	@RequestMapping(value="/logout") //로그아웃
	public String logout() {
		session.invalidate();
		return "home";
	}
	
	@RequestMapping(value="/mypagejoin") // mypage 이동
	public String mypagejoin() {
		return "mypage";
	}
	
	@RequestMapping(value="mbupdate") // 수정요청
	public ModelAndView mbupdate() {
		System.out.println("mbupdate 컨트롤");
		mav = ms.mbupdate();
		return mav;
	}
	@RequestMapping(value="/mbupdateprocess") // 수정 처리
	public ModelAndView mbupdateprocess(@ModelAttribute memberDTO memberdto) {
		System.out.println("mbupdateprocess 컨트롤"+memberdto);
		mav = ms.mbupdateprocess(memberdto);
		return mav;
	}
	
	@RequestMapping(value="/mypage")
	public ModelAndView mypage(@RequestParam("mid") String mid) {
		System.out.println("mypage 컨트롤 " + mid);
		mav = ms.mypage(mid);
		return mav;
	}
		
	@RequestMapping(value="/memberlist") // 회원목록
	public ModelAndView memberlist() {
	System.out.println("memberlist 컨트롤");
	mav = ms.memberlist();
		return mav;
	}
	
	@RequestMapping(value="/memberview") // 회원상세조회
	public ModelAndView memberview(@RequestParam("mid") String mid) {
		System.out.println("memberview 컨트롤" + mid);
		mav = ms.memberview(mid);
		return mav;
	}
	
	@RequestMapping(value="/memberdelete")
	public ModelAndView memberdelete(@RequestParam("mid")String mid) {
		System.out.println("memberdelete 컨트롤" + mid);
		mav = ms.memberdelete (mid);
		return mav;
	}
	
	
}
