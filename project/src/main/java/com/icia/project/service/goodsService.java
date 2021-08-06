package com.icia.project.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		mav.setViewName("redirect:/");
		return mav;
	}

	public ModelAndView goodslist(String category) {
		System.out.println("goodslist 서비스" + category);
		mav = new ModelAndView();
		
		List<goodsDTO> goodslist = gd.goodslist(category);
		
		mav.addObject("goodslist", goodslist);
		mav.setViewName("goodslist");
		return mav;
	}

	public ModelAndView goodsview(int goodsnumber) {
		System.out.println("goodsview 서비스" + goodsnumber);
		mav = new ModelAndView();
		
		goodsDTO goodsdto  = gd.goodsview(goodsnumber);
		
		mav.addObject("goods", goodsdto);
		mav.setViewName("goodsview");
		return mav;
	}

	public ModelAndView homelist() {
		System.out.println("homelist 서비스");
		mav = new ModelAndView();
		
		List<goodsDTO> homelist = gd.homelist();
		
		mav.addObject("homelist", homelist);
		mav.setViewName("home");
		return mav;
	}

	public ModelAndView goodsdelete(int goodsnumber) {
		System.out.println("goodsdelete 서비스" + goodsnumber);
		mav = new ModelAndView();
		gd.goodsdelete(goodsnumber);
		mav.setViewName("redirect:/");
		return mav;
	}

	public ModelAndView goodssearch(String keyword, String searchtype) {
		System.out.println("search 서비스 "+ keyword + searchtype);
		mav = new ModelAndView();
		
		Map<String, String> searchMap= new HashMap<String, String>();
		
		searchMap.put("word", keyword);
		searchMap.put("type", searchtype);
		
		List<goodsDTO> goodslist = gd.goodssearch(searchMap);
		mav.addObject("homelist", goodslist);
		mav.setViewName("home");
		
		return mav;
	}
	
	

}
