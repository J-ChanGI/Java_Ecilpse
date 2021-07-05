package com.icia.project.dao;

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
	
	

}
