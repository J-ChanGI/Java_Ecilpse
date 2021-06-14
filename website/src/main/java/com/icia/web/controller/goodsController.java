package com.icia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class goodsController {

	@RequestMapping(value="/goods1join")
	public String goods1join() {
		return "goods1";
	}
	@RequestMapping(value="/goods2join")
	public String goods2join() {
		return "goods2";
	}
	@RequestMapping(value="/goods3join")
	public String goods3join() {
		return "goods3";
	}
}
