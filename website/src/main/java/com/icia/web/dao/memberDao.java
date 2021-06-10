package com.icia.web.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.web.dto.memberDTO;
@Repository
public class memberDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int membership(memberDTO memberdto) {
		System.out.println("membership 디에이오"+ memberdto);
		return sql.insert("mb.membership", memberdto);
	}

	public String idcheck(String mid) {
		System.out.println("idcheck 디에이오"+ mid);
		return sql.selectOne("mb.memberidcheck", mid);
	}

	public String login(memberDTO memberdto) {
		System.out.println("login 디에이오" + memberdto);
		return sql.selectOne("mb.memberlogin", memberdto);
	}

	public memberDTO memberupdate(String loginId) {
		System.out.println("memberupdate 디에이오" + loginId);
		return sql.selectOne("mb.memberupdate", loginId);
	}

	public int memberupdateprocess(memberDTO memberdto) {
		System.out.println("memberupdateprocess 디에이오" + memberdto);
		return sql.update("mb.memberupdateprocess", memberdto);
	}

}
