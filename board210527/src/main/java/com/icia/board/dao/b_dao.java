package com.icia.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.board.dto.b_dto;
import com.icia.board.dto.pageDTO;

@Repository
public class b_dao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int  boardwrite(b_dto b_dto) { 
		System.out.println("write dao 호출");
		return sql.insert("board.boardwrite" ,b_dto);
	}

	public List<b_dto> boardList() {
		System.out.println("boardlist dao 호출");
		return sql.selectList("board.boardlist");
	}

	public void boardHits(int bnumber) {
		System.out.println("hits dao 호출");
		sql.update("board.boardhits",bnumber);
		
	}

	public b_dto boardView(int bnumber) { 
		System.out.println("view 디에이오" + bnumber);
		return sql.selectOne("board.boardview", bnumber);
	}

	public b_dto boardupdate(int bnumber) {
		System.out.println("update 수정요청 디에이오");
		return sql.selectOne("board.boardupdate");
	}

	public int updateprocess(b_dto board) {
		System.out.println("update 수정처리 디에이오");
		return sql.selectOne("board.boardupdateprocess", board);
	}


	public int boardelete(int bnumber) {
		
		return sql.delete("board.boarddelete", bnumber);
	}

	public void boardwriteFile(b_dto b_dto) {
		sql.insert("board.boardwritefile",b_dto);
		
	}

	public int listCount() {
		
		return sql.selectOne("board.listcount");
	}

	public List<b_dto> boardpaging(pageDTO paging) {
		
		return sql.selectList("board.boardpaging", paging);
	}

	public List<b_dto> boardsearch(Map<String, String> searchmap) {
		
		return sql.selectList("board.boardsearch", searchmap);
	}



	
	
	
	
	
	
	
	
	
	
}













