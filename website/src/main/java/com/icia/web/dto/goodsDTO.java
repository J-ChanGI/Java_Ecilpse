package com.icia.web.dto;

public class goodsDTO {

	private String goodsname;
	private String goodsprice;
	private String goodsbrand;
	private String catename;
	private int goodsnumber;
	
	public int getGoodsnumber() {
		return goodsnumber;
	}
	public void setGoodsnumber(int goodsnumber) {
		this.goodsnumber = goodsnumber;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getGoodsbrand() {
		return goodsbrand;
	}
	public void setGoodsbrand(String goodsbrand) {
		this.goodsbrand = goodsbrand;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	@Override
	public String toString() {
		return "goodsDTO [goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodsbrand=" + goodsbrand
				+ ", catename=" + catename + ", goodsnumber=" + goodsnumber + "]";
	}
	

	
}
