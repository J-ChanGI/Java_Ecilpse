package com.icia.memboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.boardDTO;
import com.icia.memboard.service.boardService;

@Controller
public class boardController {
	
	@Autowired
	private boardService bs;
	
	private ModelAndView mav;
	
	
	
	//첨부파일 글 쓰기
	@RequestMapping(value="/boardwrite")
	public ModelAndView boardwrite(@ModelAttribute boardDTO board){
		mav = bs.boardwrite(board); 
		return mav;
		
	}
}
	



