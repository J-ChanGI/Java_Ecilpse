package com.icia.web.dto;

public class memberDTO {

	private String mid; // 아이디
	private String mpassword; // 비밀번호
	private String mname; // 이름
	private String mnumber; // 전화번호
	private String memail;  // 이메일
	private String maddressnumber;  // 주소번호 
	private String mroadaddress; // 도로명주소
	private String mlandaddress; // 지번주소
	private String mdatailedaddress; // 상세주소
	private String mnote; // 참고
	
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
		return "memberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mnumber=" + mnumber
				+ ", memail=" + memail + ", maddressnumber=" + maddressnumber + ", mroadaddress=" + mroadaddress
				+ ", mlandaddress=" + mlandaddress + ", mdatailedaddress=" + mdatailedaddress + ", mnote=" + mnote
				+ "]";
	}
	
}

	