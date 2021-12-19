package com.icia.memboard.dto;

import org.springframework.web.multipart.MultipartFile;

public class memboardDTO {
	
	
	private String mid;
	private String mpassword;
	private String mname;
	private String mnumber;
	private String memail;
	private MultipartFile mfile;
	private String mfilename;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public MultipartFile getMfile() {
		return mfile;
	}
	public void setMfile(MultipartFile mfile) {
		this.mfile = mfile;
	}
	public String getMfilename() {
		return mfilename;
	}
	public void setMfilename(String mfilename) {
		this.mfilename = mfilename;
	}
	@Override
	public String toString() {
		return "memboardDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mnumber=" + mnumber
				+ ", memail=" + memail + ", mfile=" + mfile + ", mfilename=" + mfilename + "]";
	}
	
	
}
