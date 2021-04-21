package Day_21_04_21_pkg;

public class Books2 {
	
	private int bookNumber;// 책번호 
	private String bookName; // 도서명 
	private String bookWirter; // 저자
	private int clientNumber; // 회원번호 
	private boolean check;
	
	Books2(){
		
	}

	public Books2(int bookNumber, String bookName, String bookWirter, int clientNumber, boolean check) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookWirter = bookWirter;
		this.clientNumber = clientNumber;
		this.check = check;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWirter() {
		return bookWirter;
	}

	public void setBookWirter(String bookWirter) {
		this.bookWirter = bookWirter;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Books2 [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookWirter=" + bookWirter
				+ ", clientNumber=" + clientNumber + ", check=" + check + "]";
	}
	
	

	
}
