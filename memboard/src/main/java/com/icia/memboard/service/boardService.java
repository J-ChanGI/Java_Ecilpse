package com.icia.memboard.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dao.boardDao;
import com.icia.memboard.dto.boardDTO;
import com.icia.memboard.dto.memboardDTO;

@Service
public class boardService {

	@Autowired
	public boardDao bdao; 
	
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
		
		mav.addObject("bview",board); //
		mav.setViewName("writeview"); // 출력될 jsp
		
		return mav;
	}

	public ModelAndView bviewupdate(int bnumber) {
		System.out.println("update 서비스");
		mav = new ModelAndView();
		
		boardDTO board = bdao.writeview(bnumber);
		mav.addObject("bviewupdate" , board);
		mav.setViewName("writeupdate");
		return mav;
	}

	public ModelAndView boardupdateprocess(boardDTO board) {
		System.out.println("boardupdateprocess 서비스");
		mav = new ModelAndView();
		
		int updateResult = bdao.boardupdateprocess(board);
		
		if(updateResult > 0 ) {
			mav.setViewName("redirect:/writeview?bnumber=" + board.getBnumber());
			
		}
		
		return mav;
	}
		


}
