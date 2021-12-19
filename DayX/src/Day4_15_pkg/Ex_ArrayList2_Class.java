package Day4_15_pkg;

import java.util.*;

public class Ex_ArrayList2_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList 에 영어로 된 단어 5개를 스캐너로 입력 받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는 가장 긴 단어를 출력하세요.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<String>();
		String str1 = "";
		list1.add(str1);
		list1.add(str1);
		list1.add(str1);
		list1.add(str1);
		list1.add(str1);
		String va1 = "water";
		System.out.println(va1.length());
		for(int i=0; i<list1.size(); i++) {
			System.out.print("단어를 입력하세요 : ");
			str1 = sc.nextLine();
			System.out.println(list1.get(i));
			
		}
		
	
		
		
		
		
	}

}
