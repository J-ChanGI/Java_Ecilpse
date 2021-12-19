package Day_21_04_22_pkg;

public class ex_TryCatch02 {

	public static void main(String[] args) {
		// 나눗셈 할 때
		// a/b 에서 b가 0 이면 발생하는 예외를 확인하고
		// 예외처리를 할 수 있는 코드를 작성하라
		// 예외가 발생하는 경우 "0으로 나눌 수 없습니다." 출력
		try {
			
		int a = 10;
		int b = 0 ;
		System.out.println(a/b);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		

	}

}
