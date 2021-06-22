package com.icia.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value="/goodslist") // 카테고리별 상품 리스트 
	public ModelAndView goodslist(@RequestParam("catename")String catename) {
		System.out.println("goodslist 컨트롤" + catename);
		mav = gs.goodslist(catename);
		return mav;
	}

	@RequestMapping(value="/search")  // 검색기능
	public ModelAndView goodssearch(@RequestParam("keyword") String keyword) {
		System.out.println("search 컨트롤"+ keyword);
		mav = gs.goodssearch(keyword);
		return mav;
	}
	
	
	
	
	
	
	@RequestMapping(value="/goods1") // 상품 상세페이지 (커피)
	public String goods1view() {
		return "goods1";
	}

	@RequestMapping(value="/goods2") // 상품 상세페이지 (스무디)
	public String goods2view() {
		return "goods2";
	}

	@RequestMapping(value="/goods3") // 상품 상세페이지 (황금올리브)
	public String goods3view() {
		return "goods3";
	}

	@RequestMapping(value="/goods4") // 상품 상세페이지 (허니콤보)
	public String goods4view() {
		return "goods4";
	}
//	@RequestMapping(value="/goods1")
//	public ModelAndView goodsview1(@RequestParam("goodsname")String goodsname) {
//		System.out.println("goods 커피 상세조회 컨트롤" + goodsname );
//		mav = gs.goodsview1(goodsname);
//		return mav;
//	}

	
	
	


}
