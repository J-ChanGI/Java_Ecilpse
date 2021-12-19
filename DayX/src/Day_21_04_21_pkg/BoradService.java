package Day_21_04_21_pkg;

import java.util.*;

public class BoradService {
	Scanner sc = new Scanner (System.in);
	void wNumber (List<Borad> boradlist) { // 글 조회 
		System.out.print("글 번호 : ");
		int wNumber1 = sc.nextInt();
		for(int i=0; i<boradlist.size(); i++) {
			if(wNumber1 == boradlist.get(i).getwNumber()) {
				System.out.println(boradlist.get(i));
			}
		}
	}
	
	List<Borad> update(List<Borad> boradlist){ // 글 수정 
		System.out.println("글 번호 : ");
		int wNumber1 = sc.nextInt();
		System.out.println("비밀 번호 :");
		String passward = sc.next();
		
		for(int i=0; i<boradlist.size(); i++) {
			if(wNumber1 == boradlist.get(i).getwNumber() && 
					passward.equals(boradlist.get(i).getPassward())) {
				
				System.out.println("제목 변경 : ");
				sc.nextLine();
				String wtitle  =sc.nextLine();
				boradlist.get(i).setWtitle(wtitle);
				
				System.out.println("내용 수정 : ");
				String wdate = sc.nextLine();
				boradlist.get(i).setWdate(wdate);
				
				System.out.println(boradlist.get(i).toString());
			}
			
		}
		return boradlist;	
	} 
	List<Borad> Delete (List<Borad> boradlist){ // 글 삭제
		System.out.println("글 번호 : ");
		int wNumber = sc.nextInt();
		System.out.println("비밀 번호 : ");
		String wpassward = sc.next();
		for(int i=0; i<boradlist.size(); i++) {
			if(wNumber == boradlist.get(i).getwNumber() && 
					wpassward.equals(boradlist.get(i).getPassward())) {
				boradlist.remove(i);
			} 
			
		}
			return boradlist;
	}			
				
	
	
	void wDelete (List<Borad> boradlist) { // 전체 글 조회
		System.out.println("글 번호 : ");
		int wNumber = sc.nextInt();
		System.out.println("비밀 번호 : ");
		String wpassward = sc.next();
		for(int i=0; i<boradlist.size(); i++) {
			if(wNumber == boradlist.get(i).getwNumber() && 
					wpassward.equals(boradlist.get(i).getPassward())) {
				boradlist.get(i).getWdate();
			}
		}
	}
	
	
	
	
	
	
	
	

	void all (List<Borad> boradlist) {
		for(int i=0; i<boradlist.size(); i++) {
			System.out.println(boradlist.get(i));
		}
	}

}
// 면접 할 때 게시판 할 줄 아는지 물어본다 ..
//crud 
/*
 * C - Create
 * R - Read
 * U - Update
 * D - Delete
*/