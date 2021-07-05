package com.icia.project.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dto.goodsDTO;
import com.icia.project.service.goodsService;

@Controller
public class goodsContoller {

	@Autowired
	private goodsService gs;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/goodsuploadjoin")
	public String goodsuploadjoin() {
		return "goodsupload";
	}
	
	@RequestMapping(value="/goodsupload")
	public ModelAndView goodsupload(@ModelAttribute goodsDTO goodsdto) throws IllegalStateException, IOException {
		System.out.println("goodsupload 컨트롤" + goodsdto);
		mav = gs.goodsupload(goodsdto);
		return mav;
	}
	
}
