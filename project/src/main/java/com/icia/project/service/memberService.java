package com.icia.project.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import com.icia.project.dao.memberDao;
import com.icia.project.dto.memberDTO;

@Service
public class memberService {

	@Autowired
	private memberDao md;

	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	public ModelAndView membership(memberDTO memberdto) {
		System.out.println("membership 서비스" + memberdto);
		mav = new ModelAndView ();
		
		int insertResult = 0;
		insertResult = md.membership(memberdto);
		if(insertResult > 0 ) {
			mav.setViewName("/home");
		}else {
			mav.setViewName("membership");
		}
		
		
		return mav;
	}
	
	public String idcheck(String mid) {
		System.out.println("idcheck 서비스" + mid);
		String checkresult = md.idcheck(mid);
		
		String result="";
		if(checkresult == null) {
			result = "ok";
		}else {
			result = "no";
		}			
		
		return result;
	}

	public ModelAndView login(memberDTO memberdto) {
		System.out.println("login 서비스" + memberdto);
		mav = new ModelAndView();
		String loginId = md.login(memberdto);
		
		if(loginId != null) {
			session.setAttribute("login", loginId);
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("login");
		}
		return mav;
	}

	public ModelAndView mbupdate() {
		System.out.println("mbupdate 서비스");
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("login");
		memberDTO memberdto = md.mbupdate(loginId);
		
		mav.addObject("mbupdate", memberdto);
		mav.setViewName("mbupdate");
		return mav;
	}

	public ModelAndView mbupdateprocess(memberDTO memberdto) {
		System.out.println("mbupdateprocess 서비스 " + memberdto);
		mav = new ModelAndView();
		
		int updateresult = md.mbupdateprocess(memberdto);
		if(updateresult > 0 ) {
			mav.setViewName("mypage");
		}else {
			mav.setViewName("updatefail");
		}
		return mav;
	}

	public ModelAndView mypage() {
		System.out.println("mypage 서비스");
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("login");
		memberDTO memberdto = md.mypage(loginId);
		
		mav.addObject("mypage", memberdto);
		mav.setViewName("mypage");
		
		return mav;
	}

	public ModelAndView memberlist() {
		System.out.println("memberlist 서비스");
		mav = new ModelAndView();
		List<memberDTO> memberdto = md.memberlist();
		
		mav.addObject("memberlist", memberdto);
		mav.setViewName("memberlist");
		return mav;
		
	}

	public ModelAndView memberview(String mid) {
		System.out.println("memberview 서비스"+ mid);
		mav = new ModelAndView();
		
		memberDTO memberdto = md.memberview(mid);
		
		mav.addObject("view", memberdto);
		mav.setViewName("memberview");
		
		return mav;
	}

	public ModelAndView memberdelete(String mid) {
		System.out.println("memberdelete 서비스" + mid);
		mav = new ModelAndView();
		md.memberdelete(mid);
		mav.setViewName("memberlist");
		
		return mav;
	}


	
}
