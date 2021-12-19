package Day_21_04_22_pkg;

public class SmartPhone extends CellPhone {

	String type ;
	@Override
	void poweron() {
		System.out.println("스마트폰을 킵니다");
	}
	@Override
	void hangoff() {
		System.out.println("스마트폰을 종료합니다");
	}
}
