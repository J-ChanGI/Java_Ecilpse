package Day2_pkg;

public class MemberMain {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Member mem = new Member();
			mem.id = "abcdef";
			mem.passward = "666666";
			mem.name = "김동그라미";
			mem.age = 30;
					
			mem.info();
			
			mem.update("김수정");
			
			mem.info();
			
			mem.myName(); //리턴이 있는 메소드는 호출 할 때 호출만 하고 끝나면 안됨
			String name1 = mem.name ;
			System.out.println(mem.myName());
			
			
			//매개변수가 있는 생성자를 이용한 객체 
			Member mem2 = new Member("abcdef","666666","김동그라미",30);
					
			
	
	}

}
