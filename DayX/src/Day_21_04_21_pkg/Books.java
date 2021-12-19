package Day_21_04_21_pkg;

public class Books {
	
	private String name;// 이름
	private String number; // 전화번호
	private int clientNumber; //고객번호 
	
	Books(){
		
	}
	
	public Books(String name, String number, int clientNumber) {
		super();
		this.name = name;
		this.number = number;
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", number=" + number + ", clientNumber=" + clientNumber + "]";
	}
	

	
}


