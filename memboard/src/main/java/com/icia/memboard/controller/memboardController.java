package com.icia.memboard.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.memboardDTO;
import com.icia.memboard.service.memboardService;

@Controller
public class memboardController {
	
	@Autowired
	private memboardService mbs;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
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
	
	@RequestMapping(value="/mbviewpage") // 회원정보 페이지  view  띄우기
	public String mbview() {
	 System.out.println("엠비뷰");
		return "mbview";
	}

	@RequestMapping(value="/memboardupdate") // 수정 요청 view 안에 존재
	public ModelAndView update() {
		System.out.println("update 컨트롤");
		mav = mbs.update();
		return mav;
	}
	
	@RequestMapping(value="/updateprocess") // 수정 처리 view 안에 존재
	public ModelAndView updateprocess (@ModelAttribute memboardDTO memboard) {
		System.out.println("updateprocess 컨트롤");
		mav = mbs.updateprocess(memboard);
		return mav;
	}
	
	@RequestMapping(value="/incheck") // 아이디 중복
	public @ResponseBody String idcheck(@RequestParam("mid") String mid) {
		String result = mbs.idcheck(mid);
		return result;
	}
		
	
	@RequestMapping(value="/mblist") //회원목록 관리자용 // mblist.jsp
	public ModelAndView mblist() {
		System.out.println("list 컨트롤");
	mav = mbs.mblist();
		return mav;
	}
		
	@RequestMapping(value="/infor") //회원정보 infor.jsp
	public ModelAndView infor(@RequestParam("mid")String mid) {
		System.out.println("infor 컨트롤");
		mav = mbs.infor(mid);
		return mav;
	}
	
	@RequestMapping(value="/mbdelete") //삭제  // mblist.jsp 안에 있음
	public ModelAndView mbdelete(@RequestParam("mid") String mid) {
		System.out.println("delete 컨트롤");
		mav = mbs.mbdelete(mid);
		return  mav;
	}
	@RequestMapping(value="/logout") //로그아웃
	public String logout() {
		System.out.println("로그아웃");
		session.invalidate();
		return "home";
		
	}
	
	}
	


