package com.icia.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.board.dto.b_dto;

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

}
