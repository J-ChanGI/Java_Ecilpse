package com.icia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class goodsController {

	@RequestMapping(value="/store")
	public String store() {
		return "categorystore";
	}
	@RequestMapping(value="/categorycoffie")
	public String categorycoffie() {
		return "categorycoffie";
	}
	@RequestMapping(value="/categorypizza/chickin")
	public String categorypizza_chickin() {
		return "categorypizza_chickin";
	}
	@RequestMapping(value="/categoryfastfood")
	public String categoryfastfood() {
		return "categoryfastfood";
	}
	@RequestMapping(value="/categorybakery")
	public String categorybakery() {
		return "categorybakery";
	}

}
