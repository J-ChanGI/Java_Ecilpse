package com.icia.web.dao;

import java.util.List;

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

	public List<memberDTO> memberlist() {
		System.out.println("list 디에이오");
		return sql.selectList("mb.memberlist");
	}

	public memberDTO memberview(String mid) {
		System.out.println("view 디에이오" + mid);
		return sql.selectOne("mb.memberview", mid);
	}

	public void memberdelete(String mid) {
		System.out.println("delete 디에이오" + mid);
		sql.delete("mb.memberdelete", mid);
	}

}
