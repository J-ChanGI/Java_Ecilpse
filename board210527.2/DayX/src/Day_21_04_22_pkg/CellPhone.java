package Day_21_04_22_pkg;

// Phone 의 자식클래스 
public class CellPhone extends phone {
	//필드
	String button ;
	String message;
	
	//기본 생성자
	CellPhone (){
		
	}
	
	CellPhone(String button){
		this.button = button;
		
	}
	
	//button, model, company를 매개변수로 하는 생성자
	CellPhone (String button, String model, String company){
		this.button = button;
		this.model = model;
		this.company = company;
	}
	// 메소드 오버로딩 : 메소드 이름은 같지만 매개변수 타입이나 갯수가 다른 것
	
	//메소드
	void sendMessage(String message) {
		System.out.println("메시지 전송 " + message);
	}
	void poweron () {
		System.out.println("전원을 킵니다.");
	}
	// 메소드 재정의 : 상속받은 메소드의 내용을 수정하거나 바꾸는 것
//				 : 메소드 이름은 그대로 유지해아함
	 //@ Annotation (어노테이션) 효과 
	
	@Override
	void hangon() { // 이 처럼 메소드 이름은 유지 하되 출력문은 바꿀 수 있다.
		System.out.println("전화를 걸까나 말까나 -by Cellphone");
	}
}
