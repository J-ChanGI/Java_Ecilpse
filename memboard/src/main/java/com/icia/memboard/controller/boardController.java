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
		System.out.println("update 컨트롤" + bnumber);
		mav = bs.bviewupdate(bnumber);
		return mav;
	}
	// 수정 처리
	@RequestMapping(value="/boardupdateprocess")
	public ModelAndView boardupdateprocess(@ModelAttribute boardDTO board) {
		System.out.println("boardupdate process 컨트롤" + board);
		mav = bs.boardupdateprocess(board);
		return mav ;
	}
	//삭제
	@RequestMapping(value="/bdelete")
	public ModelAndView bdelete(@RequestParam int bnumber) {
		System.out.println("delete 컨트롤");
		mav = bs.bdelete(bnumber);
		return mav;
	}
	// 페이징 처리
	@RequestMapping(value="/paging")
	public ModelAndView boardpaging(@RequestParam(value="page", required=false, defaultValue="1") int page) {
		mav= bs.boardpaging(page);
		return mav;
		
	}
	// 검색 기능
	@RequestMapping(value="/search")
	public ModelAndView boardsarch(@RequestParam("searchtype")String searchtype,
									@RequestParam("keyword") String keyword) {
		System.out.println("search 컨트롤");
			mav = bs.boardsearch(searchtype,keyword);
			return mav ;
	}
	
	
	
	
}
	



