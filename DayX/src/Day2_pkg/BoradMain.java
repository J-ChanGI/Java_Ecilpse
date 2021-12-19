package Day2_pkg;

public class BoradMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board bor = new Board();
		
		bor.boradWriter(123, "클래스예제", "김동그라미", "예제");
		
		bor.boradView();
		
		bor.boardUpdate("클래스예제1", "내용수정");
		
		bor.boradView();
		
	}

}
