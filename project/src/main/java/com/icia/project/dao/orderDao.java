package com.icia.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.project.dto.goodsDTO;
import com.icia.project.dto.memberDTO;

@Repository
public class orderDao {
	
	@Autowired
	private SqlSessionTemplate sql;

	public memberDTO goodsorder(String loginId) {
		System.out.println("goodsorder 디에이오" + loginId);
		return sql.selectOne("mm.goodsorder",loginId);
	}

	public goodsDTO goodsorders(int goodsnumber) {
		System.out.println("goodsorders 디에이오" + goodsnumber );
		return sql.selectOne("goods.goodsorders", goodsnumber);
	}
	
	
}
