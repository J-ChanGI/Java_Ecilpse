package com.icia.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired 
	private MemberService ms;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	// home.jsp에서 joinpage 링크클릭 요청을 하면 
	// 아래 메소드가 호출됨 
	@RequestMapping(value="/joinpage")
	public String joinPage() {
		return "memberjoin";
	}
	
//	@RequestMapping(value="/memberjoin")
//	public ModelAndView memberJoin(@RequestParam("mid") String mid, 
//									@RequestParam("mpassword") String mpassword,
//									@RequestParam("mname") String mname, 
//									@RequestParam("memail") String memail) {
//		MemberDTO member = new MemberDTO();
//		member.setMid(mid);
//		member.setMpassword(mpassword);
//		member.setMname(mname);
//		member.setMemail(memail);
//		
//		mav = ms.memberJoin(member);
//
//		// 회원가입이 완료되면 로그인 페이지가 출력되도록 
//		return mav;
//	}
	
	@RequestMapping(value="/memberjoin")
	public ModelAndView memberJoin(@ModelAttribute MemberDTO member) {
		mav = ms.memberJoin(member);

		// 회원가입이 완료되면 로그인 페이지가 출력되도록 
		return mav;
	}
	
	@RequestMapping(value="/memberlist")
	public ModelAndView memberList() {
		mav = ms.memberList();
		
		return mav;
	}
	
	@RequestMapping(value="/memberview")
	public ModelAndView memberView(@RequestParam("mid") String mid) {
		mav = ms.memberView(mid);
		return mav;
	}
	
	// 로그인 화면 출력 메소드
	@RequestMapping(value="/loginpage")
	public String loginPage() {
		return "memberlogin";
	}
	
	// 로그인 처리 메소드 
	@RequestMapping(value="/login")
	public ModelAndView memberLogin(@ModelAttribute MemberDTO member) {
		// member 객체에는 memberlogin.jsp 에서 입력한 mid, mpassword 값만 담겨있음. 
		System.out.println("login 메소드"+member.toString());
		mav = ms.memberLogin(member);
		return mav;
	}
	
	// 로그아웃 처리 메소드 
	@RequestMapping(value="/logout")
	public String logout() {
		// 로그아웃은 세션에 저장된 내용을 지운다는 개념 
		session.invalidate();
		return "home";
	}
	
	// 회원정보 수정 요청 메소드 
	@RequestMapping(value="/memberupdate")
	public ModelAndView update() {
		mav = ms.update();
		
		return mav;
	}
	
}











