package Day2_pkg;

public class peoplemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//peoplemain 클래스에서 people 클래스 를 객체로 만들어 활용
		// people 클래스 객체 선언
		people p = new people();
		
// 객체로 만들 클래스 이름	 . 현재 파일에서 쓸 객체이름 (변수이름 처럼 아무거나 써도 무관) = 
//    new 는 객체가 들어 올 때 반드시 써줘야한다. 해당 클래스가 가지고 있는 생성자 해당 클래스가 별도의 생성자를 정의하고 있지 않다면 기본생성자를 사용함
		p.name = "이름1";
		p.age = 30;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.nation);
		p.nation = "미국"; // 객체의 출력값을 변경 하는 작업
		System.out.println(p.nation);
		
		
		
		
		// 매개변수가 있는 생성자를 이용한 객체(인스턴스)생성
		people p2 = new people ("이름4", 30);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.nation);
		p2.nation = "캐나다";
		System.out.println(p2.nation);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
