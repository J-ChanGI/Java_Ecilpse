package Day_21_04_22_pkg;

public class phoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p = new phone ();
		
		p.company = "삼성";
		
		// CellPhone 클래스 선언
		CellPhone cp = new CellPhone();
		cp.button="";
		
		
		// phone  클래스 에 있는 필드 내용
		cp.company = "삼성1";
		
		// phone 가지고 있는 메소드 내용
		cp.hangoff();
		
		SmartPhone sp = new SmartPhone ();
		sp.company = "삼성전자"; // phone 클래스 필드
		sp.button = "터치폰"; // CellPhone 클래스 필드
		sp.type = "타입"; // SmartPhone 클래스 필드 
		
		sp.call("여보세요"); //  phone 클래스 메소드
		sp.sendMessage("메시지"); //CellPhone 클래스 메소드
		sp.hangoff(); // SmartPhone 클래스 메소드 
	}

}
