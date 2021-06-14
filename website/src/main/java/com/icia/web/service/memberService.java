package com.icia.web.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.web.dao.memberDao;
import com.icia.web.dto.memberDTO;
@Service
public class memberService {

	@Autowired
	private memberDao mdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session; 
	
	public ModelAndView membership(memberDTO memberdto) {
		mav = new ModelAndView();
		System.out.println("membership 서비스"+ memberdto);
		
		int insertResult = 0;
		insertResult = mdao.membership(memberdto);
		if(insertResult > 0) {
			mav.setViewName("/home");
		}else {
			mav.setViewName("membership");
			
		}
		
		return mav;
	}

	public String idcheck(String mid) {
		System.out.println("idcheck 서비스" + mid);
		String checkResult = mdao.idcheck(mid);
		
		String result ="";
		if(checkResult ==null) {
			result = "ok";
		}else {
			result = "no";
		}
		
		return result;
	}

	public ModelAndView login(memberDTO memberdto) {
		System.out.println("login 서비스"+ memberdto);
		mav = new ModelAndView();
		String loginId = mdao.login(memberdto);
		
		if(loginId != null) {
			session.setAttribute("login", loginId);
			mav.setViewName("home");
		}else {
			mav.setViewName("login");
		}
		
		return mav;
	}

	public ModelAndView memberupdate() {
		System.out.println("memberupdate 서비스");
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("login");
		memberDTO memberupdate = mdao.memberupdate(loginId);
		
		mav.addObject("memberupdate", memberupdate);
		mav.setViewName("memberupdate");
		return mav;
	}

	public ModelAndView memberupdateprocess(memberDTO memberdto) {
		System.out.println("memberupdateprocess 서비스" + memberdto);
		mav = new ModelAndView();
		
		int updateResult = mdao.memberupdateprocess(memberdto);
		if(updateResult > 0) {
			mav.setViewName("mypage");
		}else {
			mav.setViewName("updatefail");
		}
		
		return mav;
	}

	public ModelAndView memberlist() {
		System.out.println("list 서비스");
		mav = new ModelAndView();
		List<memberDTO> memberlist = mdao.memberlist();
		
		mav.addObject("memberlist",memberlist);
		mav.setViewName("memberlist");
		return mav;
	}

	public ModelAndView memberview(String mid) {
		System.out.println("view 서비스 "+ mid);
		mav = new ModelAndView();
		
		memberDTO memberdto = mdao.memberview(mid);
		mav.addObject("memberview",memberdto); // 
		mav.setViewName("memberview");  // 출려할 jsp
		return mav;
	}

	public ModelAndView memberdelete(String mid) {
		System.out.println("delete 서비스" + mid);
		mav = new ModelAndView();
		mdao.memberdelete(mid);
		mav.setViewName("memberlist");
		return mav;
	}
	
}
