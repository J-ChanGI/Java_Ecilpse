package com.icia.project.dto;

public class memberDTO {
	
	private String mid;
	private String mpassword;
	private String mpasswordcheck;
	private String mname;
	private String mnumber;
	private String memail;
	private String mdomain;
	private String maddressnumber;
	private String mroadaddress;
	private String mlandaddress;
	
	public String getMpasswordcheck() {
		return mpasswordcheck;
	}
	public void setMpasswordcheck(String mpasswordcheck) {
		this.mpasswordcheck = mpasswordcheck;
	}
	private String mdatailedaddress;
	private String mnote;
	
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
	public String getMdomain() {
		return mdomain;
	}
	public void setMdomain(String mdomain) {
		this.mdomain = mdomain;
	}
	public String getMaddressnumber() {
		return maddressnumber;
	}
	public void setMaddressnumber(String maddressnumber) {
		this.maddressnumber = maddressnumber;
	}
	public String getMroadaddress() {
		return mroadaddress;
	}
	public void setMroadaddress(String mroadaddress) {
		this.mroadaddress = mroadaddress;
	}
	public String getMlandaddress() {
		return mlandaddress;
	}
	public void setMlandaddress(String mlandaddress) {
		this.mlandaddress = mlandaddress;
	}
	public String getMdatailedaddress() {
		return mdatailedaddress;
	}
	public void setMdatailedaddress(String mdatailedaddress) {
		this.mdatailedaddress = mdatailedaddress;
	}
	public String getMnote() {
		return mnote;
	}
	public void setMnote(String mnote) {
		this.mnote = mnote;
	}
	@Override
	public String toString() {
		return "memberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mpasswordcheck=" + mpasswordcheck + ", mname="
				+ mname + ", mnumber=" + mnumber + ", memail=" + memail + ", mdomain=" + mdomain + ", maddressnumber="
				+ maddressnumber + ", mroadaddress=" + mroadaddress + ", mlandaddress=" + mlandaddress
				+ ", mdatailedaddress=" + mdatailedaddress + ", mnote=" + mnote + "]";
	}
		
	
	

}
