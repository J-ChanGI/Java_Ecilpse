package com.icia.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.project.dto.memberDTO;

@Repository
public class memberDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int membership(memberDTO memberdto) {
		System.out.println("membership 디에이오" + memberdto);
		return sql.insert("mm.membership", memberdto);
	}

	public String idcheck(String mid) {
		System.out.println("idcheck 디에이오" + mid);
		return sql.selectOne("mm.idcheck", mid);
	}

}
