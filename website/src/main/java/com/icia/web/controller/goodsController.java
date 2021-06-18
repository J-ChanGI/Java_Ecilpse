package com.icia.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.web.dto.goodsDTO;
import com.icia.web.service.goodsService;

@Controller
public class goodsController {

	@Autowired
	private goodsService gs;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/goodsuploadjoin") //상품등록 페이지 이동
	public String goodsuploadjoin() {
		return "goodsupload";
	}
	
	@RequestMapping(value="/goodsupload") // 상품등록
	public ModelAndView goodsupload(@ModelAttribute goodsDTO goodsdto) {
		System.out.println("goodsupload 컨트롤" + goodsdto);
		mav = gs.goodsupload(goodsdto);
		return mav;
	}
	@RequestMapping(value="/goodslist") // 전체 상품 리스트
	public ModelAndView goodslist() {
		System.out.println("goodslist 컨트롤");
		mav = gs.goodslist();
		return mav;
	}
//	@RequestMapping(value="goodslistjoin") // 상품리스트로 이동
//	public String goodslistjoin() {
//		return "goodslist";
//	}
}
