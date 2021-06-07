package com.icia.memboard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.memboard.dto.CommentDTO;

@Repository
public class CommentDao {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	public int commentWrite(CommentDTO comment) {
		System.out.println("Commentwrite 디에이오" + comment);
		return sql.insert("cm.commentwrite",comment);
	}

	public List<CommentDTO> commentList(int cbnumber) {
		System.out.println("commentList 디에이오 " + cbnumber);
		return sql.selectList("cm.commentlist", cbnumber);
	}
	
}
