package com.icia.memboard.dto;

import org.springframework.web.multipart.MultipartFile;

public class boardDTO {
	
		private int bnumber;
		private String bwriter;
		private String btitle;
		private String bcontents;
		private String bdate;
		private int bhits;
	
		private MultipartFile bfile;
		private String bfilename;
		
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
		public MultipartFile getBfile() {
			return bfile;
		}
		public void setBfile(MultipartFile bfile) {
			this.bfile = bfile;
		}
		public String getBfilename() {
			return bfilename;
		}
		public void setBfilename(String bfilename) {
			this.bfilename = bfilename;
		}
		@Override
		public String toString() {
			return "boardDTO [bnumber=" + bnumber + ", bwriter=" + bwriter + ", btitle=" + btitle + ", bcontents="
					+ bcontents + ", bdate=" + bdate + ", bhits=" + bhits + ", bfile=" + bfile + ", bfilename="
					+ bfilename + "]";
		}
		
		
		
		
		
	
}
