package com.icia.memboard.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.memboard.dto.memboardDTO;
@Repository
public class memboardDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int member(memboardDTO memboard) {     //회원가입 
		return sql.insert("mb.member",memboard);
		
	}

	public String memboardlogin(memboardDTO memboard) { //로그인 
		System.out.println("login 디에이오");
		return sql.selectOne("mb.memboardlogin", memboard);
	}

	public memboardDTO update(String loginId) {
		System.out.println("update 디에이오");
		return sql.selectOne("mb.memboardupdate" ,loginId);
	}

	public int updateprocess(memboardDTO memboard) {
		System.out.println("updateprocess 디에이오");
		return sql.update("mb.memboardupdateprocess", memboard);
	}

//	public memboardDTO mbview(String mid) {
//		System.out.println("view 디에이오");
//		return  sql.selectOne("mb.memboardview", mid);
//	}

}
