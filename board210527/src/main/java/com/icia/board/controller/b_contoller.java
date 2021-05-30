package com.icia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dto.b_dto;
import com.icia.board.service.b_service;

@Controller
public class b_contoller {

	@Autowired
	private b_service bs;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/writepage") // writer 링크
	public String boardwritepage() {
		System.out.println("writer 링크");
		return "boardwrite";
	}
	
	
	@RequestMapping(value="/boardwrite") // 글작성 
	public ModelAndView boardwrite (@ModelAttribute b_dto b_dto ) {
		System.out.println("컨트롤 boardwrite");
		mav = bs.boardwrite(b_dto);
		return mav;
		
	}
	
	@RequestMapping(value="/boardlist") // 리스트 띄우기
	public ModelAndView boardList() {
	
		mav = bs.boardList();
		
		return mav;
	}
	//글조회
	
	@RequestMapping(value="/boardview")
	public ModelAndView boardView(@RequestParam("bnumber") int bnumber) {
		mav = bs.boardView(bnumber);
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
