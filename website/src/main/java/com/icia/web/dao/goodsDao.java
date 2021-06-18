package com.icia.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.web.dto.goodsDTO;

@Repository
public class goodsDao {

	@Autowired
	private SqlSessionTemplate sql;

	public int goodsupload(goodsDTO goodsdto) {
		System.out.println("goodsupload 디에이오" + goodsdto);
		return sql.insert("goods.goodsupload", goodsdto);
	}

	public List<goodsDTO> goodslist() {
		System.out.println("goodslist 디에이오");
		return sql.selectList("goods.goodslist");
	}
	
}
