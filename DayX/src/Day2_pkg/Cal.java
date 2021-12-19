package Day2_pkg;

import java.util.Scanner;

public class Cal {
Scanner sc = new Scanner(System.in);
	
	// 더하기 메소드
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
		
	}
	//빼기 메소드
	void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	//곱하기 메소드
	int mul(int num1, int num2) {
		int mul = num1 * num2;
		return mul ;
	}
	//나누기 메소드
	int div() {
		int num1=sc.nextInt();
	 	int num2=sc.nextInt();
		int div = num1 / num2;
		
		return div;
	}
}
