package com.icia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dao.b_dao;
import com.icia.board.dto.b_dto;

@Service
public class b_service {
		
	@Autowired
	private b_dao bdao;
	
	private ModelAndView mav;
	
	public ModelAndView boardwrite(b_dto b_dto) {
		System.out.println("boardwrie 서비스");
		mav = new ModelAndView();
		
		int insertvalue =0;
		insertvalue = bdao.boardwrite(b_dto);
		
		// 글쓰기 성공 - 목록 출력 (목록출력을 담당하는 컨트롤러의 주소를 요청해야한다.)
		// 어떻게 ? redirect 로 주소값을 요청한다.
		// 글쓰기 실패 : boardwrite .jsp 출력
		if(insertvalue > 0) {
			
			mav.setViewName("home"); //home 이전에 redirect:/boardlist 있었음 
		}else {
			mav.setViewName("boardwrite");
		}
		
		return mav;
	}
	
	public ModelAndView boardList() {
		mav = new ModelAndView();
		List<b_dto> boardList = bdao.boardList();
		
		System.out.println("service boardlist 호출");
		mav.addObject("boardList", boardList);
		mav.setViewName("boardlist"); // 출력될 jsp 주소  
		return mav;
	}

	public ModelAndView boardView(int bnumber) {
		mav = new ModelAndView();
		
		//1. 해당 글의 조회수 값 1증가 (update쿼리)
		//2. 해당 글의 내용 가져오기 (select 쿼리)
		
		bdao.boardHits(bnumber);
		
		b_dto board = bdao.boardView(bnumber);
		
		mav.addObject("board",board);
		mav.setViewName("boardview");
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
