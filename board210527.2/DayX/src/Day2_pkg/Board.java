package Day2_pkg;

public class Board {
	
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;
	
	Board(){
		
	}
	Board(int bNumber, String bTitle, String bWriter, String bContents){
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
		
	}
	
	void boradWriter(int bNumber, String bTitle, String bWriter, String bContents){
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
	void boradView() {
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}
	void boardUpdate(String bTitle, String bContents) {
		this.bTitle = bTitle;
		this.bContents = bContents;
	}
	
	
	
}
