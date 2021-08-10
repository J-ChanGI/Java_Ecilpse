package com.icia.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.service.orderService;

@Controller
public class orderController {

	@Autowired
	private orderService os;
	
	private ModelAndView mav;
	

	
	@RequestMapping(value="/goodsorder")
	public ModelAndView goodsorder(@RequestParam("goodsnumber")int goodsnumber) {
		
		System.out.println("goodsorder 컨트롤");
		mav = os.goodsorder(goodsnumber);
		return mav;
		
	}
//	@RequestMapping(value="/goodsorders")
//	public ModelAndView goodsdrders(@RequestParam("goodsnumber")int goodsnumber) {
//		System.out.println("goodsorders 컨트롤" + goodsnumber);
//		mav = os.goodsorders(goodsnumber);
//		return mav;
//	}
//	
}
