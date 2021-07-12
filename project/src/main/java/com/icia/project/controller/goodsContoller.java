package com.icia.project.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dto.goodsDTO;
import com.icia.project.service.goodsService;

@Controller
public class goodsContoller {

	@Autowired
	private goodsService gs;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/goodsuploadjoin") // 상품등록으로 이동
	public String goodsuploadjoin() {
		return "goodsupload";
	}
	
	@RequestMapping(value="/goodsupload") // 상품등록
	public ModelAndView goodsupload(@ModelAttribute goodsDTO goodsdto) throws IllegalStateException, IOException {
		System.out.println("goodsupload 컨트롤" + goodsdto);
		mav = gs.goodsupload(goodsdto);
		return mav;
	}
	
	@RequestMapping(value="/goodslist") // 카테고리별 상품목록
	public ModelAndView goodslist(@RequestParam("category") String category) {
		System.out.println("goodslist 컨트롤" + category);
		mav = gs.goodslist(category);
		return mav;
	}
	@RequestMapping(value="/goodsview") // 상품 상세페이지
	public ModelAndView goodsview(@RequestParam("goodsnumber") int goodsnumber) {
		System.out.println("goodsview 컨트롤" + goodsnumber);
		mav = gs.goodsview(goodsnumber);
		return mav;
	}
	@RequestMapping(value="/")
	public ModelAndView homelist() {
		System.out.println("homelist 컨트롤");
		mav = gs.homelist();
		return mav;
	}
	@RequestMapping(value="/goodsdelete")
	public ModelAndView goodsdelete(@RequestParam("goodsnumber") int goodsnumber) {
		System.out.println("goodsdelete 컨트롤 " + goodsnumber);
		mav = gs.goodsdelete(goodsnumber);
		return mav;
	}
	@RequestMapping(value="/search")
	public ModelAndView goodssearch(@RequestParam("keyword")String keyword,
									@RequestParam("searchtype") String searchtype) {
		System.out.println("search 컨트롤 " + keyword + searchtype);
		mav = gs.goodssearch(keyword, searchtype);
		return mav;
	}
	
	
}
