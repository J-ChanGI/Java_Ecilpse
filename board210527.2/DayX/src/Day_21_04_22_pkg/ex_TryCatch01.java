package Day_21_04_22_pkg;

public class ex_TryCatch01 {

	public static void main(String[] args) {
		/*
		 * 예외 (Exception) 처리
		 * try {
		 * 실행할 내용
		 * 
		 * } catch(익셉션이름 e) {
		 * 	해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 */
		
		try {
			int[] num = new int[3];
			
			num[3] = 10;
		} catch(Exception  e) { //catch를 여러 개 사용 할 수 있다.
			System.out.println("배열 크기 초과");
			e.printStackTrace();
		}finally {
			System.out.println("예외가 나든 안나든 무조건 여기는 나옵니다.");
		}


	}

}

