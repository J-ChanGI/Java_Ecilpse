package com.icia.project.dao;

import java.util.List;

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

	public String login(memberDTO memberdto) {
		System.out.println("login 디에이오" + memberdto);
		return sql.selectOne("mm.login", memberdto);
	}

	public memberDTO mbupdate(String loginId) {
		System.out.println("mbupdate 디에이오" + loginId);
		return sql.selectOne("mm.mbupdate" ,loginId);
	}

	public int mbupdateprocess(memberDTO memberdto) {
		System.out.println("mbupdateprocess 디에이오 " + memberdto);
		return sql.update("mm.updateprocess", memberdto);
	}

	public memberDTO mypage(String loginId) {
		System.out.println("mypage 디에이오" + loginId);
		return sql.selectOne("mm.mypage", loginId );
	}

	public List<memberDTO> memberlist() {
		System.out.println("memberlist 디에이오");
		return sql.selectList("mm.memberlist");
	}

	public memberDTO memberview(String mid) {
		System.out.println("memberview 디에이오"+ mid);
		return sql.selectOne("mm.memberview", mid);
	}

	public void memberdelete(String mid) {
		System.out.println("memberdelete 디에이오" + mid);
		sql.delete("mm.memberdelete",mid);
		
	}

}
