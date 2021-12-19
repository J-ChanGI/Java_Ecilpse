package Day4_15_pkg;

import java.util.*;

public class Ex01_ArrayList_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Array List
		 * 
		 * 
		 * ArrayList 선언 (저장 데티어 타입 : String)
		 */ 
		List<String> list = new ArrayList<String>();
			//타입 	//변수이름				//타입	 = 타입은 앞 뒤 동일하게 해야한다. 
		
		//list에 데이터 저장 : add 메소드 호출
		list.add("첫 번째");
		list.add("두 번째");
		list.add("세 번째");
		list.add(1, "네 번째");
		//list에 담긴 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// list는 기존에 인덱스 안에 있던 값이 밀려난다 1 ,2, 3 일 경우 4를 2번에 넣게 되면 1,4,2,3 이 된다 
		
		// list 크기 확인
		System.out.println(list.size());
		
		//list 데이터 삭제
		list.remove(1); //해당 인덱스에 값이 삭제된다.
		
		//for 문을 이용하여 list에 담긴 모든 데이터 출력
		for(int i=0; i<=list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		//list 에 정수를 저장할 때 
		List<Integer> list1 = new ArrayList<Integer>(); // Wrapper Class
		
		
	}

}
