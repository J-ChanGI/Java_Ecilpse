package com.icia.project.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dao.goodsDao;
import com.icia.project.dto.goodsDTO;

@Service
public class goodsService {

	@Autowired
	private goodsDao gd;
	
	private ModelAndView mav;
	
	public ModelAndView goodsupload(goodsDTO goodsdto) throws IllegalStateException, IOException {
		System.out.println("goodsupload 서비스" + goodsdto);
		mav = new ModelAndView();
		
		MultipartFile goodsimg = goodsdto.getGoodsimg();
		
		String goodsimgname = goodsimg.getOriginalFilename();
		
		goodsimgname = System.currentTimeMillis() + "-" + goodsimgname;
		String savePath = "C:\\Users\\JJ\\Desktop\\project\\src\\main\\webapp\\resources\\upload\\" + goodsimgname;
		
		if(!goodsimg.isEmpty()) {
			goodsimg.transferTo(new File(savePath));
		}
		
		goodsdto.setGoodsimgname(goodsimgname);
		gd.goodsupload(goodsdto);
		
		mav.setViewName("home");
		return mav;
	}

}
