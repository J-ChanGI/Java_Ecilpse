package com.icia.memboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.icia.memboard.dto.boardDTO;

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

	public int boardupdateprocess(boardDTO board) {
		System.out.println("boardupdateprocess 디에이오");
		return sql.update("bw.boardupdateprocess", board);
	}
	
	




}
