package com.icia.memboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.memboard.dao.CommentDao;
import com.icia.memboard.dto.CommentDTO;

@Service
public class CommentService {
	
	@Autowired
	private CommentDao cdao;
	
	public List<CommentDTO> commentWrite(CommentDTO comment) {
			System.out.println("commentWrite 서비스" + comment);
		
		int writeResult = cdao.commentWrite(comment);
		List<CommentDTO> commentList = new ArrayList<CommentDTO>();
		if(writeResult > 0)
			commentList = cdao.commentList(comment.getCbnumber());
		else
			commentList=null;
		return commentList;
	}

}
