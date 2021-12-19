package Day2_pkg;

public class Member {
	// 필드 선언
	String id;
	String passward;
	String name;
	int age;
	
	
	//기본생성자
	// 생성자 이름 : 클래스이름과 동일함 
	Member(){ 
		
	}
	// 매개변수로 하는 생성자
	Member(String id, String passward, String name, int age){
		// 매개변수로 받은 값을 각 필드에 저장
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.age = age;
		
		
	}
	
	void info() {
		System.out.println(this.id);
		System.out.println(this.passward);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	// name을 매개변수로 받아서 그 값을 필드에 저장
	void update(String name) {
		this.name = name;
		
	}
	//필드 값을 리턴해주는 메소드 
	String myName() {
		return this.name;
	}
	
}

