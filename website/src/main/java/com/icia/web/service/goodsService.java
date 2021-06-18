package com.icia.web.service;

import java.util.List;

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

	public ModelAndView goodslist() {
		System.out.println("goodslist 서비스");
		mav = new ModelAndView();
		List<goodsDTO> goodslist = gd.goodslist();
		
		mav.addObject("goodslist", goodslist);
		mav.setViewName("goodslist");
		
		return mav;
	}
	
}
