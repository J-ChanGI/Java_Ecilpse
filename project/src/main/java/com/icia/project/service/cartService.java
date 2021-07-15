package com.icia.project.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dao.cartDao;
import com.icia.project.dto.cartDTO;

@Service
public class cartService {

	
	@Autowired
	private cartDao cd;
	
	private ModelAndView mav;

	@Autowired
	private HttpSession session;
	
	public ModelAndView cart(cartDTO cartdto) {
		System.out.println("cart 서비스 " + cartdto);
		mav = new ModelAndView();
		
		int insertResult = 0;
		insertResult = cd.cart(cartdto);
		if(insertResult > 0) {
			mav.setViewName("cartpage");
			
		}else {
			mav.setViewName("goodsview");
		}
		
		return mav;
	}

	public ModelAndView cartlist() {
		System.out.println("cartlist 서비스");
		
		mav = new ModelAndView();
		String loginId = (String) session.getAttribute("login");
		List<cartDTO> cartdto = cd.cartlist(loginId);
		
		
		mav.addObject("cartlist", cartdto);
		mav.setViewName("cartpage");
		return mav;
	}

	public ModelAndView cartdelete(int cartcode) {
		System.out.println("cattdelete 서비스" + cartcode);
		mav = new ModelAndView();
		cd.cartdelete(cartcode);
		mav.setViewName("cartpage");
		
		return mav;
	}
	
}
