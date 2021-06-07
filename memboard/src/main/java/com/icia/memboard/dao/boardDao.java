package com.icia.memboard.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.boardDTO;
import com.icia.memboard.dto.pageDTO;

@Repository
public class boardDao {

	@Autowired
	private SqlSessionTemplate sql;

	public void boardwrite(boardDTO board) {
		System.out.println("boardwrite 디에이오");
		sql.insert("bw.boardwrite",board);
		
	}

	public List<boardDTO> writelist() {
		System.out.println("writelist 디에이오");
		return sql.selectList("bw.boardlist");
	}

	public void boardHits(int bnumber) {
		System.out.println("hits 디에이오");
		sql.update("bw.boardhits", bnumber);
	}

	public boardDTO writeview(int bnumber) {
		System.out.println("view 디에이오");
		return sql.selectOne("bw.boardview",bnumber);
	}
	public boardDTO bviewupdate(int bnumber) {
		System.out.println("bviewupdate 디에이오");
		return sql.selectOne("bw.bviewupdate", bnumber);
	}

	public int boardupdateprocess(boardDTO board) {
		System.out.println("boardupdateprocess 디에이오" + board);
		return sql.update("bw.boardupdateprocess", board);
	}

	public int bdelete(int bnumber) {
		System.out.println("delete 디에이오");
		
		return sql.delete("bw.boarddelete", bnumber);
	}

	public int listcount() {
		System.out.println("listcount 디에이오");
		return sql.selectOne("bw.listcount");
	}

	public List<boardDTO> boardpaging(pageDTO paging) {
		System.out.println("page2 디에이오");
		return sql.selectList("bw.boardpaging", paging);
	}

	public List<boardDTO> boardsearch(Map<String, String> searchMap) {
		System.out.println("search 디에이오");
		return sql.selectList("bw.boardsearch",searchMap);
	}

	
	
	




}
