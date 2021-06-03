package com.icia.memboard.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dao.memboardDao;
import com.icia.memboard.dto.memboardDTO;

@Service
public class memboardService {
	
	@Autowired
	private memboardDao mbdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	
	public ModelAndView member(memboardDTO memboard) throws IllegalStateException, IOException {
		mav = new ModelAndView();
		
		
		
		MultipartFile mfile = memboard.getMfile();
		
		String mfilename = mfile.getOriginalFilename();
		
		mfilename = System.currentTimeMillis() + "-" + mfilename;
		
		String savePath = "D:\\Source_jj\\spring\\memboard\\src\\main\\webapp\\resources\\upload" + mfilename;
		
		if(!mfile.isEmpty()) {
			mfile.transferTo(new File(savePath));
		}
		//  파일 저장 하는 과정 너무 어렵고 ;
		
		memboard.setMfilename(mfilename);
		mbdao.member(memboard);
		
		mav.setViewName("redirect:/.");
		return mav;
	}
	// 로그인 처리 
	public ModelAndView memboardlogin(memboardDTO memboard) {
		mav = new ModelAndView();
		System.out.println("login 서비스");
		String  loginId = mbdao.memboardlogin(memboard);
						
		if(loginId != null) {
			session.setAttribute("memboardlogin", loginId);
			mav.setViewName("memboardlist");
		}else {
			mav.setViewName("login");
		}
		
		return mav;
	}

	public ModelAndView update() {
		mav = new ModelAndView();
		System.out.println("update 서비스");
		String loginId = (String) session.getAttribute("memboardlogin");
		memboardDTO memboardupdate = mbdao.update(loginId);
		
		mav.addObject("mbupdate", memboardupdate);
		mav.setViewName("mbupdate");
		return mav;
	}
	public ModelAndView updateprocess(memboardDTO memboard) {
		System.out.println("updateprocess 서비스");
		mav = new ModelAndView();
		int updateResult = mbdao.updateprocess(memboard);
		if(updateResult > 0) {
			mav.setViewName("mbview");
		}else {
			mav.setViewName("updatefali");
		}
		return mav;
	}
	public String idcheck(String mid) {
		String checkResult = mbdao.idcheck(mid);
		
		String result = "";
		if(checkResult ==null) {
			result = "ok";
		}else {
			result = "no";
		}
		System.out.println("idcheck 서비스");
		return result;
	}
	public ModelAndView mblist() {
		System.out.println("list 서비스");
		mav = new ModelAndView();
		List<memboardDTO> mboardlist = mbdao.mblist();
		
		mav.addObject("mblist", mboardlist);
		mav.setViewName("mblist");
		return mav;
	}
	public ModelAndView infor(String mid) {
		System.out.println("infor 서비스");
		mav = new ModelAndView();
		
		memboardDTO memboard = mbdao.infor(mid);
		mav.addObject("result", memboard);
		mav.setViewName("infor");
		
		return mav;
	}
	public ModelAndView mbdelete(String mid) {
		System.out.println("delete 서비스");
		mav = new ModelAndView();
		mbdao.mbdelete(mid);		
		
		mav.setViewName("redirect:/mblist");
		return mav;
	}

}
