package com.icia.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.project.dto.cartDTO;

@Repository
public class cartDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int cart(cartDTO cartdto) {
		System.out.println("cart 디에이오" + cartdto);
		return sql.insert("cart.cartinsert", cartdto);
	}

	public List<cartDTO> cartlist(String loginId) {
		System.out.println("cartlist 디에이오" +loginId );
		return sql.selectList("cart.cartlist",loginId);
	}

	public void cartdelete(int cartcode) {
		System.out.println("cartdelete 디에이오" + cartcode);
		sql.delete("cart.cartdelete", cartcode);
	}

//	public int order(cartDTO orderdto) {
//		System.out.println("order 디에이오" + orderdto);
//		return sql.insert("order.order", orderdto);
//	}

}
