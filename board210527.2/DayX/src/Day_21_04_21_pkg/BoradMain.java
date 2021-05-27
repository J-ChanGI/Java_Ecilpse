package Day_21_04_21_pkg;

import java.util.*;

public class BoradMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSkip to content

				Scanner sc = new Scanner(System.in);
				
				List<Borad> boradlist = new ArrayList<Borad>();
			//  List<클래스명> 변수 이름 	  = new ArrayList<클래스명>();
				BoradService bs = new BoradService();
			//  서비스 클래스명  변수이름  = new 서비스 클래스명 
				int Seclect = 0 ;
				boolean run = true ;
				
				while (run) {
					System.out.println("1. 글쓰기 | 2. 글 조회 | 3. 글 수정 | 4. 글삭제 | 5. 전체 글조회 | 6. 종료");
					System.out.println("선택 >");
					Seclect = sc.nextInt();
					switch(Seclect) {
					
					case 1 : // 글쓰기 - 리스트 저장
						Borad borad = new Borad(); // 클래스 선언
						int wNumber = boradlist.size()+1;
						System.out.println("글 제목 : ");
						String wtitle = sc.next();
						System.out.println("비밀 번호 : ");
						String passward = sc.next();
						System.out.println("작성자 : ");
						String name = sc.next();
						System.out.println("내용 : ");
						sc.nextLine();
						String wdate = sc.nextLine();
						
						borad.setWtitle(wtitle);
						borad.setPassward(passward);
						borad.setName(name);
						borad.setWdate(wdate);
						borad.setwNumber(wNumber);
						
						boradlist.add(borad);
						
						break;
						
					case 2 :	// 글 조회 
						bs.wNumber(boradlist);
						
						break;
						
					case 3 :	// 글 수정
						boradlist = bs.update(boradlist);
						
						break;	
							
					case 4 :	// 글 삭제
						bs.wDelete(boradlist);
						break;
						
					case 5 :	// 전체 글 목록 
						
						bs.all(boradlist);
						break;
						
					case 6 :
						
						System.out.println("종료");
						run = false;
						
						break;
						
					
					}
				}
				
			}

	}


