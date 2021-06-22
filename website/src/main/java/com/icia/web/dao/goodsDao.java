package com.icia.web.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.icia.web.dto.goodsDTO;

@Repository
public class goodsDao {

	@Autowired
	private SqlSessionTemplate sql;

	public int goodsupload(goodsDTO goodsdto) {
		System.out.println("goodsupload 디에이오" + goodsdto);
		return sql.insert("goods.goodsupload", goodsdto);
	}

	public List<goodsDTO> goodslist(String catename) {
		System.out.println("goodslist 디에이오" + catename);
		return sql.selectList("goods.goodslist", catename);
	}


	public List<goodsDTO> goodssearch(Map<String, String> searchMap) {
		System.out.println("search 디에이오" + searchMap);
		return sql.selectList("goods.goodssearch", searchMap);
	}

	
	
}
