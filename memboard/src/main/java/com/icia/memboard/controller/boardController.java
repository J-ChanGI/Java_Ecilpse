package com.icia.memboard.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.boardDTO;
import com.icia.memboard.service.boardService;

@Controller
public class boardController {
	
	@Autowired
	private boardService bs;
	
	private ModelAndView mav;
	
	
	@RequestMapping(value="/writepage")
	public String writepage() {
		return "write";
	}
	
	
	//첨부파일 글 쓰기
	@RequestMapping(value="/boardwrite")
	public ModelAndView boardwrite(@ModelAttribute boardDTO board) throws IllegalStateException, IOException{
		System.out.println("boardwwrite 컨트롤");
		mav = bs.boardwrite(board); 
		return mav;
		
	}
	// 목록 출력
	@RequestMapping(value="/writelist")
	public ModelAndView writelist() {
		System.out.println("writelist 컨트롤");
		mav = bs.writelist();
		return mav;
	}
	// 목록 조회
	
	@RequestMapping(value="/writeview")
	public ModelAndView writeview(@RequestParam("bnumber")int bnumber) {
		System.out.println("view 컨트롤 ");
		mav = bs.writeview(bnumber);
		return mav;
	}
	
	// 수정 요청
	@RequestMapping(value="/bviewupdate")
	public ModelAndView bviewupdate(@RequestParam("bnumber")int bnumber) {
		System.out.println("update 컨트롤");
		mav = bs.bviewupdate(bnumber);
		return mav;
	}
	// 수정 처리
	@RequestMapping(value="/boardupdateprocess")
	public ModelAndView boardupdateprocess(@ModelAttribute boardDTO board) {
		System.out.println("boardupdate process 컨트롤");
		mav = bs.boardupdateprocess(board);
		return mav ;
	}
	
}
	



