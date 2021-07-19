package com.icia.project.dto;

import org.springframework.web.multipart.MultipartFile;

public class goodsDTO {

	
	private String goodsname; // 상품명
	private String goodsbrand; // 상품브랜드
	private String goodsintro; // 상세설명
	private int goodsnumber; // 코드번호
	private String category; // 카테고리
	private String goodsprice; // 가격
	private String goodstype;
	
	private MultipartFile goodsimg;; // bfile
	private String goodsimgname; //bfilename 
	
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsbrand() {
		return goodsbrand;
	}
	public void setGoodsbrand(String goodsbrand) {
		this.goodsbrand = goodsbrand;
	}
	public String getGoodsintro() {
		return goodsintro;
	}
	public void setGoodsintro(String goodsintro) {
		this.goodsintro = goodsintro;
	}
	public int getGoodsnumber() {
		return goodsnumber;
	}
	public void setGoodsnumber(int goodsnumber) {
		this.goodsnumber = goodsnumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}
	public MultipartFile getGoodsimg() {
		return goodsimg;
	}
	public void setGoodsimg(MultipartFile goodsimg) {
		this.goodsimg = goodsimg;
	}
	public String getGoodsimgname() {
		return goodsimgname;
	}
	public void setGoodsimgname(String goodsimgname) {
		this.goodsimgname = goodsimgname;
	}
	@Override
	public String toString() {
		return "goodsDTO [goodsname=" + goodsname + ", goodsbrand=" + goodsbrand + ", goodsintro=" + goodsintro
				+ ", goodsnumber=" + goodsnumber + ", category=" + category + ", goodsprice=" + goodsprice
				+ ", goodstype=" + goodstype + ", goodsimg=" + goodsimg + ", goodsimgname=" + goodsimgname + "]";
	}
	
	
	
	
	
	
}
