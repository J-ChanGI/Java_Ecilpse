package com.icia.memboard.dao;

import java.util.List;

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

	public memboardDTO update(String loginId) { //수정 요청		
		System.out.println("update 디에이오");
		return sql.selectOne("mb.memboardupdate" ,loginId);
	}

	public int updateprocess(memboardDTO memboard) { //수정 처리
		System.out.println("updateprocess 디에이오");
		return sql.update("mb.memboardupdateprocess", memboard);
	}

	public String idcheck(String mid) {  // 중복체크
		System.out.println("idcheck 디에이오");
		return sql.selectOne("mb.memboardidcheck",mid);
	}

	public List<memboardDTO> mblist() {	
		System.out.println("list 디에이오");
		return sql.selectList("mb.memboardlist");
	}

	public memboardDTO infor(String mid) {
		System.out.println("infor 디에이오");
		return sql.selectOne("mb.memboardinfor",mid);
	}

	public void mbdelete(String mid) {
		System.out.println("delete 디에이오");
		sql.delete("mb.memboarddelete", mid);
	}

	
	

//	public memboardDTO mbview(String mid) {
//		System.out.println("view 디에이오");
//		return  sql.selectOne("mb.memboardview", mid);
//	}

}
