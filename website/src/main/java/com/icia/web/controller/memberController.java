package com.icia.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.web.dto.memberDTO;
import com.icia.web.service.memberService;

@Controller
public class memberController {

	@Autowired
	private memberService ms;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value="/memberjoin") //회원가입 페이지로 이동
	public String memberjoin() {
		return "membership";
	}
	
	@RequestMapping(value="/membership") // 회원가입 처리
	public ModelAndView membership(@ModelAttribute memberDTO memberdto ) {
		System.out.println("membership 컨트롤"+ memberdto);
		mav = ms.membership(memberdto);
		return mav;
	}
	
	@RequestMapping(value="/idcheck") // 아이디 중복 처리
	public @ResponseBody String idcheck(@RequestParam("mid") String mid) {
		System.out.println("idcheck 컨트롤" + mid);
		String result = ms.idcheck(mid);
		return result;
	}
	@RequestMapping(value="/loginjoin") // 로그인 페이지로 이동
	public String loginjoin() {
		return "login";
	}
	@RequestMapping(value="/login") //로그인 처리
	public ModelAndView login(@ModelAttribute memberDTO memberdto) {
		System.out.println("login 컨트롤" + memberdto);
		mav = ms.login(memberdto);
		return mav;
	}
	@RequestMapping(value="/logout") // 로그아웃
	public String logout() {
		System.out.println("logout");
		session.invalidate();
		return "home";
	}
	@RequestMapping(value="/mypagejoin") // 마이페이지로 이동
	public String mypagejoin() {
		return "mypage";
	}
	@RequestMapping(value="/memberupdate") // 수정 요청
	public ModelAndView memberupdate() {
		System.out.println("memberupdate 컨트롤");
		mav = ms.memberupdate();
		return mav;
	}
	@RequestMapping(value="/memberupdateprocess") // 수정 처리
	public ModelAndView memberupdateprocess(@ModelAttribute memberDTO memberdto) {
		System.out.println("memberupdateprocess 컨트롤" + memberdto);
		mav = ms.memberupdateprocess(memberdto);
		return mav;
	}
	
	@RequestMapping(value="/memberlistjoin")// list 처리
	public ModelAndView memberlist() {
		System.out.println("list 컨트롤");
		mav = ms.memberlist();
		return mav;
	}
	@RequestMapping(value="/memberview") // view 
	public ModelAndView memberview(@RequestParam("mid") String mid) {
		System.out.println("view 컨트롤" + mid);
		mav= ms.memberview(mid);
		return mav;
	}
	@RequestMapping(value="/memberdelete")
	public ModelAndView memberdelete(@RequestParam("mid") String mid) {
		System.out.println("delete 컨트롤 "+mid);
		mav = ms.memberdelete(mid);
		return mav;
	}
	
}	
