package com.icia.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.member.dao.MemberDAO;
import com.icia.member.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO mdao;
	
	private ModelAndView mav;
	
	// 세션을 사용하기 위해 세션 객체 선언 
	@Autowired
	private HttpSession session;
	
	public ModelAndView memberJoin(MemberDTO member) {
		mav = new ModelAndView();
		
		// memberJoin 호출 결과를 받아서 insert 성공 여부에 따라 처리 
		int insertResult = 0;
		insertResult = mdao.memberJoin(member);
		if(insertResult > 0) {
			// insertResult 가 0보다 크다는 것은 insert를 성공했다는 의미이기 때문에 회원가입이 완료된것으로 판단 
			mav.setViewName("memberlogin");
		} else { 
			// insertResult 가 0이라는 의미는 insert가 실패했다는 의미
			mav.setViewName("joinfail");
		}
		
		return mav;
	}

	public ModelAndView memberList() {
		mav = new ModelAndView();
		List<MemberDTO> memberList = mdao.memberList();
		
		// memberList에 DB 조회 결과를 담아서 memberlist.jsp로 이동 
		mav.addObject("memberList", memberList);
		mav.setViewName("memberlist");
		
		return mav;
	}

	public ModelAndView memberView(String mid) {
		mav = new ModelAndView();
		
		// 한명 회원에 대한 정보만 필요하기 때문에 DTO 타입의 객체로 리턴을 받음. 
		MemberDTO member = mdao.memberView(mid);
		
		// DB 조회 결과를 member에 받았고.. 
		// member를 담아서 memberview.jsp로 가야함. 
		mav.addObject("result", member);
		mav.setViewName("memberview");
		
		return mav;
	}

	public ModelAndView memberLogin(MemberDTO member) {
		/*
		 * 로그인 처리 로직 개념 
		 * 	사용자가 memberlogin.jsp에서 입력한 아이디, 비번이 회원가입할 때 DB에 저장된 아이디, 비번과 일치하는지를 
		 * 	판단하여 일치하면 로그인 성공, 일치하지 않으면 로그인 실패로 처리 
		 */
		mav = new ModelAndView();
		
		String loginId = mdao.memberLogin(member);
		
		// loginId에 값이 있다면 아이디, 비번이 모두 맞았다는 것이고,(로그인 성공으로 처리) 
		// loginId에 값이 없다면 틀렸다는 것 (로그인 실패로 처리)

		// 사용자가 로그인을 하고 나면 로그아웃 또는 브라우저를 닫기 전까지는 로그인을 유지하고 있어야 한다. 
		// 일반적으로 로그인 정보(아이디 값) 는 세션(session)에 저장을 하도록 함. 
		// 세션은 서버(톰캣)에서 관리하는 일종의 저장공간. 
		// 세션에 데이터를 저장하게 되면 브라우저를 닫기 전까지는 페이지가 변경되어도 데이터는 유지됨. 
		
		if(loginId != null) {
			// 로그인 성공 처리 
			// 로그인한 회원의 아이디를 세션에 저장 
			session.setAttribute("loginMember", loginId);
			mav.setViewName("membermain");
		} else {
			// 로그인 실패 처리
			mav.setViewName("memberlogin");
		}
				
		return mav;
	}

	public ModelAndView update() {
		mav = new ModelAndView();
		// 우변 : 현재 로그인을 한 상태에서 수정 요청을 하는 것이기 때문에 
		// 		 세션에 저장된 로그인 아이디 값을 가지고 옴. 
		//		 가져와서 loginId 변수에 저장 
		String loginId = (String) session.getAttribute("loginMember");
		// 강제형변환
//		double a=0.0;
//		int b=0;
//		b=(int) a;
		
		// update() 메소드는 현재 로그인한 회원의 전체 정보를 DB로 부터 가져와서
		// memberupdate.jsp에 출력하는 것이 목적이기 때문에 memberview 메소드를 사용해도 문제 없음. 
//		MemberDTO memberUpdate = mdao.memberView(loginId);
		MemberDTO memberUpdate = mdao.update(loginId);
		
		mav.addObject("member123", memberUpdate);
		mav.setViewName("memberupdate");
		
		return mav;
	}

}








