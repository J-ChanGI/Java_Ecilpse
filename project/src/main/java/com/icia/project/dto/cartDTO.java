package com.icia.project.dto;

public class cartDTO {

	private String cartid;
	private String cartgoods;
	private String cartprice;
	private int cartnumber;
	private int cartamount;
	private int cartcode;
	private String cartimgname;
	
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public String getCartgoods() {
		return cartgoods;
	}
	public void setCartgoods(String cartgoods) {
		this.cartgoods = cartgoods;
	}
	public String getCartprice() {
		return cartprice;
	}
	public void setCartprice(String cartprice) {
		this.cartprice = cartprice;
	}
	public int getCartnumber() {
		return cartnumber;
	}
	public void setCartnumber(int cartnumber) {
		this.cartnumber = cartnumber;
	}
	public int getCartamount() {
		return cartamount;
	}
	public void setCartamount(int cartamount) {
		this.cartamount = cartamount;
	}
	public int getCartcode() {
		return cartcode;
	}
	public void setCartcode(int cartcode) {
		this.cartcode = cartcode;
	}
	public String getCartimgname() {
		return cartimgname;
	}
	public void setCartimgname(String cartimgname) {
		this.cartimgname = cartimgname;
	}
	
	@Override
	public String toString() {
		return "cartDTO [cartid=" + cartid + ", cartgoods=" + cartgoods + ", cartprice=" + cartprice + ", cartnumber="
				+ cartnumber + ", cartamount=" + cartamount + ", cartcode=" + cartcode + ", cartimgname=" + cartimgname
				+ "]";
	}
		
	
	
	
	
	
	
}
