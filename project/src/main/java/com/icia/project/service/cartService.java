package com.icia.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.project.dao.cartDao;
import com.icia.project.dto.cartDTO;

@Service
public class cartService {

	
	@Autowired
	private cartDao cd;

	public ModelAndView cart(cartDTO cartdto) {
		
		return null;
	}
	
}
