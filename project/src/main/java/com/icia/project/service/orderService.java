package com.icia.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dao.orderDao;
import com.icia.project.dto.goodsDTO;
import com.icia.project.dto.memberDTO;

@Service
public class orderService {

	@Autowired
	private orderDao od;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	public ModelAndView goodsorder(int goodsnumber) {
		System.out.println("goodsorder 서비스" +  goodsnumber );
		mav = new ModelAndView ();
		String loginId = (String) session.getAttribute("login");
		
		
		
		memberDTO memberdto = od.goodsorder(loginId);
		goodsDTO goodsdto = od.goodsorders(goodsnumber);
		
		System.out.println("goodsorder 서비스 리턴" + loginId);
		mav.addObject("order",memberdto);
		mav.addObject("orders", goodsdto);
		mav.setViewName("goodsorder");
		
		return mav;
	}

//	public ModelAndView goodsorders(int goodsnumber) {
//		System.out.println("goodsorders 서비스 " + goodsnumber);
//		mav = new ModelAndView ();
//		
//		goodsDTO goodsdto = od.goodsorders(goodsnumber);
//		
//		mav.addObject("orders", goodsdto);
//		mav.setViewName("goodsorder");
//		return mav;
//	}
}
