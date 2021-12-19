package Day_21_04_22_pkg;

public class phone {
	/*
	 * 상속
	 *  : 부모 클래스 , 자식 클래스 
	 *  : 부모가 자식한테 주는 것
	 *  : 필드, 메소드 등을 준다 
	 *  private 으로 선언한 필드, 메소드는 상속 불가능
	 *  
	 */
	//phone 클래스  : 부모 클래스
	//Phone -> CellPhone -> SmartPhone
	// 필드
		String model;
		String company;
		
		//메소드 정의
		void hangon() {
			System.out.println("전화를 겁니다.");
		}
		void hangoff() {
			System.out.println("전화를 끊습니다.");	
		}
		void call(String sendvoice) {
			System.out.println(sendvoice);	
		}

}

