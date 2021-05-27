package com.icia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping(value="/listpage") //list  링크
	public String boardlistpage() {
		System.out.println("list 링크");
		return "boardlist";
	}
	
	@RequestMapping(value="/boardwrite") // 글작성 
	public ModelAndView boardwrite (@ModelAttribute b_dto b_dto ) {
		System.out.println("컨트롤 boardwrite");
		mav = bs.boardwrite(b_dto);
		return mav;
		
	}
	
	@RequestMapping(value="/boardlist")
	public ModelAndView boardList() {
		System.out.println("boardlist 컨트롤");
		mav = bs.boardList();
		
		return mav;
	}
	
	
}
