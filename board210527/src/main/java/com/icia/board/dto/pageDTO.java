package com.icia.board.dto;


public class pageDTO {
	
	private int page;
	private int maxpage;
	private int startpage;
	private int endpage;
	private int startRow;
	
	@Override
	public String toString() {
		return "pageDTO [page=" + page + ", maxpage=" + maxpage + ", startpage=" + startpage + ", endpage=" + endpage
				+ ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMaxpage() {
		return maxpage;
	}
	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}
	public int getStartpage() {
		return startpage;
	}
	public void setStartpage(int startpage) {
		this.startpage = startpage;
	}
	public int getEndpage() {
		return endpage;
	}
	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	private int endRow;
}
