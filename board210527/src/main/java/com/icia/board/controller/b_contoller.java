package com.icia.board.controller;

import java.io.IOException;

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
	
	// writer 링크
	@RequestMapping(value="/writepage") 
	public String boardwritepage() {
		System.out.println("writer 링크");
		return "boardwrite";
	}
	
	// 글작성 
	
	@RequestMapping(value="/boardwrite") 
	public ModelAndView boardwrite (@ModelAttribute b_dto b_dto ) {
		System.out.println("컨트롤 boardwrite");
		mav = bs.boardwrite(b_dto);
		return mav;
		
	}
	
	//파일첨부 글쓰기
	@RequestMapping(value="/boardwritefile")
	public ModelAndView boardwritefile(@ModelAttribute b_dto b_dto) throws IllegalStateException, IOException { //예외처
		mav = bs.boardwritefile(b_dto);
		return mav;
	}
	
	
	// 목록 출력
	@RequestMapping(value="/boardlist")
	public ModelAndView boardList() {
	
		mav = bs.boardList();
		
		return mav;
	}
	//글조회
	
	@RequestMapping(value="/boardview")
	public ModelAndView boardView(@RequestParam("bnumber") int bnumber,
			@RequestParam(value="page", required=false, defaultValue="1")int page) {
		System.out.println("view 컨트롤"+bnumber);
		mav = bs.boardView(bnumber,page);
		return mav;
	}
	
	// 수정 요청
	@RequestMapping(value="/boardupdate")
	public ModelAndView boardupdate(@RequestParam("bnumber") int bnumber) {
		System.out.println("update 수정요청 컨트롤");
		mav = bs.boardupdate(bnumber);
		return mav;
	}
	//수정 처리
	@RequestMapping(value="/updateprocess")
	public ModelAndView updateprocess(@ModelAttribute b_dto board) {
		System.out.println("update 수정처리 컨트롤");
		mav = bs.updateprocess(board);
		return mav;
	}
	// 삭제
	@RequestMapping(value="/boarddelete")
	public ModelAndView boarddelete(@RequestParam("bnumber") int bnumber) {
		mav = bs.boarddelete(bnumber);
		return mav;
	}
	
	
	// 페이징처리
	@RequestMapping(value="/paging")
	public ModelAndView boardpaging(@RequestParam(value="page", required=false, 
															defaultValue="1")int page) {
		mav = bs.boardpaging(page);
		return mav;
	}
	
	@RequestMapping(value="/search")
	public ModelAndView boardsearch(@RequestParam("searchtype") String searchtype, @RequestParam("keyword")String keyword) {
		mav = bs.boardsearch(searchtype,keyword);
		return mav;
	}
	

	
}
