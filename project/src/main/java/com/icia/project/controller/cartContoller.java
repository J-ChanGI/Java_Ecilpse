package com.icia.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dto.cartDTO;
import com.icia.project.service.cartService;

@Controller
public class cartContoller {

	@Autowired
	private cartService cs;
	
	private ModelAndView mav;

	
	@RequestMapping(value="/cart")
	public ModelAndView cart(@ModelAttribute cartDTO cartdto) {
		System.out.println("cart 컨트롤"+ cartdto);
		mav = cs.cart(cartdto);
		return mav;
	}
	@RequestMapping(value="/cartpage")
	public ModelAndView cartlist() {
		System.out.println("cartlist 컨트롤");
		
		mav = cs.cartlist();
		return mav;
	}
	@RequestMapping(value="/cartdelete")
	public ModelAndView cardelete(@RequestParam("cartcode") int cartcode) {
		System.out.println("cartdelete 컨트롤"+cartcode);
		mav = cs.cartdelete(cartcode);
		return mav;
		
	}
	
}
