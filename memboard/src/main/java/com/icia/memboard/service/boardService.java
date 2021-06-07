package com.icia.memboard.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dao.CommentDao;
import com.icia.memboard.dao.boardDao;
import com.icia.memboard.dto.CommentDTO;
import com.icia.memboard.dto.boardDTO;
import com.icia.memboard.dto.memboardDTO;
import com.icia.memboard.dto.pageDTO;

@Service
public class boardService {

	@Autowired
	public boardDao bdao; 
	@Autowired
	public CommentDao cdao;
	
	public ModelAndView mav;
	
	public ModelAndView boardwrite(boardDTO board) throws IllegalStateException, IOException {
		System.out.println("boardwwrite 서비스");
		mav = new ModelAndView();
		
		MultipartFile bfile = board.getBfile();
		
		String bfilename = bfile.getOriginalFilename();
		
		bfilename = System.currentTimeMillis() + "-" + bfilename;
		
		String savePath ="C:\\Users\\user\\Desktop\\memboard\\src\\main\\webapp\\resources\\upload" + bfilename;
		
		if(!bfile.isEmpty()) {
			bfile.transferTo(new File(savePath));
		}
		
		board.setBfilename(bfilename);
		bdao.boardwrite(board);
		
		mav.setViewName("redirect:/writelist"); // 작성 후 넘겨줄 list 이름 
		return mav;
	}
	
	public ModelAndView writelist() {
		System.out.println("writelist 서비스");
		mav = new ModelAndView();
		
		List<boardDTO> writelist = bdao.writelist();
		
		mav.addObject("writelist", writelist); // "items 이름 ", dto 변수 이름
		mav.setViewName("memboardlist"); // 출력할 화면 jsp 
		return mav;
	}

	public ModelAndView writeview(int bnumber) {
		System.out.println("view 서비스");
		mav = new ModelAndView();
		
		bdao.boardHits(bnumber);
		System.out.println("hits 서비스 + bnumber");
		
		boardDTO board = bdao.writeview(bnumber);
		
		List<CommentDTO> commentList = cdao.commentList(bnumber);
		mav.addObject("commentList",commentList);
		
		mav.addObject("bview",board); //
		mav.setViewName("writeview"); // 출력될 jsp
		
		return mav;
	}

	public ModelAndView bviewupdate(int bnumber) {
		System.out.println("update 서비스");
		mav = new ModelAndView();
		
		boardDTO board = bdao.bviewupdate(bnumber);
		// 그리고 여기 파라미터 이름이 안맞으니 수정화면에 아무것도 안나고
		mav.addObject("bviewupdate" , board);
		mav.setViewName("writeupdate");
		return mav;
	}

	public ModelAndView boardupdateprocess(boardDTO board) {
		System.out.println("boardupdat	eprocess 서비스" + board);
		mav = new ModelAndView();
		
		int updateResult = bdao.boardupdateprocess(board);
		
		if(updateResult > 0 ) {
			mav.setViewName("redirect:/writelist?bnumber=" + board.getBnumber());
		}else {
			mav.setViewName("updatefail");
		}
		
		return mav;
	}

	public ModelAndView bdelete(int bnumber) {
		System.out.println("delete 서비스");
		mav = new ModelAndView();
		
		int deleteResult = bdao.bdelete(bnumber);
		if(deleteResult >0 ) {
			mav.setViewName("redirect:/writelist");
		}
		return mav;
	}

	private static final int PAGE_LIMIT = 5;
	private static final int BLOCK_LIMIT = 5;
	
	
	public ModelAndView boardpaging(int page) {
		System.out.println("page 서비스");
		mav = new ModelAndView();
		
		int  listcount = bdao.listcount();
		
		int startRow = (page-1) * PAGE_LIMIT +1;
		int endRow = page * PAGE_LIMIT ;
		
		pageDTO paging = new pageDTO();
		paging.setStartRow(startRow);
		paging.setEndRow(endRow);
		List<boardDTO> writelist = bdao.boardpaging(paging);
		
		int maxPage= (int)(Math.ceil((double)listcount / PAGE_LIMIT));
		int startPage = (((int)(Math.ceil((double)page / BLOCK_LIMIT)))-1) * BLOCK_LIMIT + 1;
		int endPage = startPage + BLOCK_LIMIT -1;	
		
		if(endPage > maxPage)
			endPage = maxPage;
		
		paging.setPage(page);
		paging.setStartpage(startPage);
		paging.setEndpage(endPage);
		paging.setMaxpage(maxPage);
		
		mav.addObject("paging", paging);
		mav.addObject("writelist",writelist);
		mav.setViewName("paging");
		
		return mav;
	}

	public ModelAndView boardsearch(String searchtype, String keyword) {
		mav = new ModelAndView();
		System.out.println("search 컨트롤");
		
		Map<String,String> searchMap= new HashMap<String, String>();
		
		searchMap.put("type", searchtype);
		searchMap.put("word", keyword);
		
		List<boardDTO> writelist = bdao.boardsearch(searchMap);
		
		mav.addObject("writelist", writelist);
		mav.setViewName("paging");
		
		return mav;
	}
		


}
