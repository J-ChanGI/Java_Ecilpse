package Day_21_04_21_pkg;

import java.util.*;

public class BookService {
	Scanner sc = new Scanner (System.in);
	
	void peoplelist (List<Books> Booklist)	{ // 회원 리스트 
		for(int i=0; i<Booklist.size(); i++) {
			System.out.println(Booklist.get(i).toString());
		}
	}
	
	void booklist (List<Books2> Booklist2)	{ // 도서 리스트 
		for(int i=0; i<Booklist2.size(); i++) {
			System.out.println(Booklist2.get(i).toString());
		}
	}
	
	List<Books2> bookout (List<Books2> Booklist2) {
		System.out.println("고객번호 : ");
		int clientNumber = sc.nextInt();
		System.out.println("빌릴 책 번호 : ");
		int bookNumber = sc.nextInt();
		for(int i=0; i<Booklist2.size(); i++) {
			if(bookNumber == Booklist2.get(i).getBookNumber() &&
					Booklist2.get(i).isCheck() == false ) {
				Booklist2.get(i).setClientNumber(clientNumber);
				Booklist2.get(i).setCheck(true);
				System.out.println("대출이 완료 되었습니다");
			}else if(bookNumber == Booklist2.get(i).getBookNumber() &&
					Booklist2.get(i).isCheck() == true ) {
				System.out.println("대출이 불가능 합니다 .");
			}
					}
		
		
		
		
		return Booklist2;
	}
	
	
	
	
	
	
	
}
