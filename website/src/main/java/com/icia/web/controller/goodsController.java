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

	
	
	@RequestMapping(value="/goods")
	public ModelAndView goods(@RequestParam("goodsnumber")int goodsnumber) {
		System.out.println("goods 컨트롤 "  + goodsnumber);
		mav = gs.goods(goodsnumber);
		return mav;
	}
	
	
	
	
	
	
	@RequestMapping(value="/search")  // 검색기능
	public ModelAndView goodssearch(@RequestParam("keyword") String keyword,
										@RequestParam("searchtype")String searchtype) {
		System.out.println("search 컨트롤"+ keyword + searchtype);
		mav = gs.goodssearch(keyword,searchtype);
		return mav;
	}
	
	
	@RequestMapping(value="/")
	public ModelAndView homelist() {
		System.out.println("homelist 컨트롤");
		mav = gs.homelist();
		return mav;
	}

	@RequestMapping(value="/homegoods")
	public ModelAndView homegoods(@RequestParam("goodsnumber")int goodsnumber) {
		System.out.println("goods 컨트롤1" + goodsnumber);
		mav = gs.homegoods(goodsnumber);
		return mav;
	}

	
	
	


}
