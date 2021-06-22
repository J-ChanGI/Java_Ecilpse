package com.icia.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.web.dao.goodsDao;
import com.icia.web.dto.goodsDTO;

@Service
public class goodsService {
	
	@Autowired
	private goodsDao gd;
	
	private ModelAndView mav;

	public ModelAndView goodsupload(goodsDTO goodsdto) {
		System.out.println("goodsupload 서비스" + goodsdto);
		mav = new ModelAndView ();
		
		int insertvalue= 0;
		insertvalue = gd.goodsupload(goodsdto);
		if(insertvalue > 0 ) {
			mav.setViewName("home");
		}else {
			mav.setViewName("goodsupload");
		}
		
		return mav;
	}

	public ModelAndView goodslist(String catename) {
		System.out.println("goodslist 서비스" + catename);
		mav = new ModelAndView();
//		goodsDTO goodsdto = gd.goodslist(catename);
		
		
		
		
		List<goodsDTO> goodslist = gd.goodslist(catename);
				
		mav.addObject("goodslist", goodslist);
		mav.setViewName("goodslist"); 
		
		return mav;
	}

	public ModelAndView goodssearch(String keyword) {
		System.out.println("search 서비스" + keyword);
		mav = new ModelAndView();
	
		Map<String, String> searchMap= new HashMap<String, String>(); 
		
		searchMap.put("word", keyword);
		
		List<goodsDTO> goodslist = gd.goodssearch(searchMap);
		
		mav.addObject("goodslist", goodslist);
		mav.setViewName("home");
		return mav;
	}

//	public ModelAndView goodsview1(String goodsname) {
//		System.out.println("goodsview1 커피 상세조회" + goodsname);
//		mav = new ModelAndView();
//		
//		
//		
////		return mav;
//	}
	
}
