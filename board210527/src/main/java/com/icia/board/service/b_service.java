package com.icia.board.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
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
		System.out.println("view 서비스" + bnumber);
		//1. 해당 글의 조회수 값 1증가 (update쿼리)
		//2. 해당 글의 내용 가져오기 (select 쿼리)
		
		bdao.boardHits(bnumber);
		
		b_dto b_dto = bdao.boardView(bnumber);
		
		mav.addObject("board",b_dto);
		mav.setViewName("boardview");
		return mav;
	}
// 		update 수정 요청
	public ModelAndView boardupdate(int bnumber) {
		// DB에서 bnumber 에 해당하는 데이터를 가져와서 
		System.out.println("update 수정요청 서비스");
		mav = new ModelAndView ();
				
		b_dto b_dto = bdao.boardupdate(bnumber);
		mav.addObject("boardupdate",b_dto);
		mav.setViewName("boardupdate");
		return mav;
	}
//  update 수정 처리
	public ModelAndView updateprocess(b_dto b_dto) {
		System.out.println("update 수정처리 서비스");
		mav = new ModelAndView();
		int updateResult = bdao.updateprocess(b_dto);
		if(updateResult > 0) {
			//1. 목록출력
//			mav.setViewName("redirect:/boardlist"); 
			//2. 해당글의 상세화면 출력
			mav.setViewName("redirect:/boardview?bnumber" + b_dto.getBnumber());
//			단순히 redirect 를 하게 될 경우 오류가 나온다 이유는 parameter로 값을 받아온게 있기 때문에 그냥 사용이불가능 parameter로 설정한 값을 가져와야한다. 
		
		}
		
		return mav;
	}
//		삭제 
	public ModelAndView boarddelete(int bnumber) {
		mav = new ModelAndView();
		int deleteResult = bdao.boardelete(bnumber);
		if(deleteResult >0 ) {
			mav.setViewName("redirect:/boardlist");
		}
		return mav;
		
		
	}
//	첨부파일 글작성 
	public ModelAndView boardwritefile(b_dto b_dto) throws IllegalStateException, IOException { // 예외 처리 
		mav = new ModelAndView();
		// dto 에 담긴 파일을 가져옴
		MultipartFile bfile = b_dto.getBfile();
		// 파일 이름을 가져옴(파일이름을 DB에 저장힉 위해)
		String bfilename = bfile.getOriginalFilename();
		// 파일명 중복을 피하기 위해 파일 이름 앞에 현재시간값을 붙인다.
		bfilename = System.currentTimeMillis() + "-" + bfilename;
		System.out.println("boardwriteFile 메소드" + bfilename);
		// 파일저장하기
		
		
		String savePath = "C:\\Users\\user\\Desktop\\board210527\\src\\main\\webapp\\resources\\upload\\" + bfilename;
		// bfil이 비어있지 않다면 (즉 파일이 있으면) savePath에 저장을 하겠다.
		if(!bfile.isEmpty()) {
			bfile.transferTo(new File(savePath));
		}
		//여기까지의 내용은 파일을 저장하는 과정
		
		b_dto.setBfilename(bfilename);
		bdao.boardwriteFile(b_dto);
		
		mav.setViewName("redirect:/boardlist");
		
		return mav;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
