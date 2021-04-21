package Day_21_04_21_pkg;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookService bs = new BookService();
		List<Books> Booklist = new ArrayList<Books>();
		List<Books2> Booklist2 = new ArrayList<Books2>();
		int clientNumber = 0;
		boolean run = true ;
		while (run) {
			System.out.println("1. 회원동록 | 2. 도서등록 | 3. 도서대출 | 4. 도서목록 | 5.회원목록  | 6. 종료");
			int Seclect = 0;
			System.out.println("선택> ");
			Seclect = sc.nextInt();
			switch (Seclect) {
	
			case 1 :  // 회원등록
				Books books = new Books();
				clientNumber = Booklist.size()+1;
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("전화번호 : ");
				String number = sc.next();
				
				books.setClientNumber(clientNumber);
				books.setName(name);
				books.setNumber(number);
				Booklist.add(books);
				
				break ;
			case 2 : // 도서등록 
				Books2 books2 = new Books2();
				System.out.println("도서명  : ");
				String bookName = sc.next();
				System.out.println("저자 : ");
				String bookWirter = sc.next();
				
												
				books2.setBookName(bookName);
				books2.setBookWirter(bookWirter);
				int bookNumber = Booklist.size()+1;
				books2.setBookNumber(bookNumber);
				
				
				Booklist2.add(books2);
				
				break ; 
				
			case 3 : // 도서 대출 
				
						Booklist2 = bs.bookout(Booklist2);
				
				break ; 
				
			case 4 :  // 도서 목록 
				bs.booklist(Booklist2);
				break ;
				
			case 5 :  //회원목록
				
				bs.peoplelist(Booklist);
				
				break ; 
				
			case 6 : 
				
				System.out.println("종료");
				run = false;
				
				break ; 
				
				
			}
			
		}
		
	}

}
