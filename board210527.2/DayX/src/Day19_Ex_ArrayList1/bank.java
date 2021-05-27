package Day19_Ex_ArrayList1;

//DTO  (Date Transfer Object) : 데이터 전달을 위한 객체 (클래스)
//VO (Value object) , Bean 등 으로도 불림
public class bank {
	
	private int clientNumber; // 고객번호
	private String name; // 고객이름
	private String accountNumber; // 계좌번호
	private int balance; // 잔고
	
	bank(){
		
	}
	
	bank(int clientNumber, String name, String accountNumber, int balance){
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "bank [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
}
