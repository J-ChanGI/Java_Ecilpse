package com.icia.board.dto;

import lombok.Data;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Data //getter,setter, toString 생성자를 자동으로 만들어줌

//@Getter
//@Setter
//@ToString
public class b_dto {
	
	private int bnumber;
	private String bwriter;
	private String bpassword;
	private String btitle;
	private String bcontents;
	private String bdate;
	private int bhits;
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBpassword() {
		return bpassword;
	}
	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontents() {
		return bcontents;
	}
	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public int getBhits() {
		return bhits;
	}
	public void setBhits(int bhits) {
		this.bhits = bhits;
	}
	@Override
	public String toString() {
		return "b_dto [bnumber=" + bnumber + ", bwriter=" + bwriter + ", bpassword=" + bpassword + ", btitle=" + btitle
				+ ", bcontents=" + bcontents + ", bdate=" + bdate + ", bhits=" + bhits + "]";
	}
		
	
}
