package com.icia.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dao.memberDao;
import com.icia.project.dto.memberDTO;

@Service
public class memberService {

	@Autowired
	private memberDao md;

	private ModelAndView mav;
	
	
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


	
}
