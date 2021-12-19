package Day2_pkg;

public class people {
	// 필드 , 생성자, 메소드
	// 필드 선언
	String name;
	int age;
	String nation;
	// 생성자 선언
	// 기본생성자
	people(){
		nation = "대한민국";
	}
	//매게변수가 있는 생성자
	people(String name, int age){
		// 매개변수를 사용하는 이유
		/*
		 * 생성자 필드값을 세팅하거나 메소드에서 처리할 값을 넘길 때
		 */
		// 넘겨받은 매개변수를 필드값으로 저장
		this.name = name;
		this.age = age;
		//this 는 filed 에 붙인다. 
	}	//파랑색 필드, 갈색 변수 
}
