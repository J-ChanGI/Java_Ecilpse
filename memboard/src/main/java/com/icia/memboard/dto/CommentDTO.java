package com.icia.memboard.dto;

public class CommentDTO {

	private int cnumber;
	private int cbnumber;
	private String cwriter;
	private String ccontents;
	
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public int getCbnumber() {
		return cbnumber;
	}
	public void setCbnumber(int cbnumber) {
		this.cbnumber = cbnumber;
	}
	public String getCwriter() {
		return cwriter;
	}
	public void setCwriter(String cwriter) {
		this.cwriter = cwriter;
	}
	public String getCcontents() {
		return ccontents;
	}
	public void setCcontents(String ccontents) {
		this.ccontents = ccontents;
	}
	@Override
	public String toString() {
		return "CommentDTO [cnumber=" + cnumber + ", cbnumber=" + cbnumber + ", cwriter=" + cwriter + ", ccontents="
				+ ccontents + "]";
	}
	
}
