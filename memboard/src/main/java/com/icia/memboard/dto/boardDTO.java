package com.icia.memboard.dto;

import org.springframework.web.multipart.MultipartFile;

public class boardDTO {
	
		private String btitle;
		private String bcontents;
		private MultipartFile bfile;
		private String bfilename;
		
		
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
			return "boardDTO [btitle=" + btitle + ", bcontents=" + bcontents + ", bfile=" + bfile + ", bfilename="
					+ bfilename + "]";
		}
		
		
	
}
