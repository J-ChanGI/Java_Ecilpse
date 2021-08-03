package com.icia.project.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.project.dto.goodsDTO;
@Repository
public class goodsDao {

	@Autowired
	private SqlSessionTemplate sql;

	public void goodsupload(goodsDTO goodsdto) {
		System.out.println("goodsupload 디에이오" + goodsdto);
		sql.insert("goods.goodsupload", goodsdto);
	}

	public List<goodsDTO> goodslist(String category) {
		System.out.println("goodslist 디에이오" + category);
		return sql.selectList("goods.goodslist", category);
	}

	public goodsDTO goodsview(int goodsnumber) {
		System.out.println("goodsView 디에이오" + goodsnumber);
		return sql.selectOne("goods.goodsview", goodsnumber);
	}

	public List<goodsDTO> homelist() {
		System.out.println("homelist 디에이오");
		return sql.selectList("goods.homelist");
	}

	public void goodsdelete(int goodsnumber) {
		sql.delete("goods.goodsdelete", goodsnumber);
		
	}

	public List<goodsDTO> goodssearch(Map<String, String> searchMap) {
		System.out.println("goodssearch 디에이오" + searchMap);
		return sql.selectList("goods.goodssearch" , searchMap);
	}
	
	

}
