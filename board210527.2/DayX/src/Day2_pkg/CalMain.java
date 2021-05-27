package Day2_pkg;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Cal cal1 = new Cal();
		
		boolean run = true;
		int num1 = 0;
		int num2 = 0;
		
		while(run) {
			System.out.print("선택> ");
			int Select  = sc.nextInt();
			
			switch(Select) {
			
			case 1 :
				System.out.println("덧셈");
			 	num1=sc.nextInt();
			 	num2=sc.nextInt();
			 	cal1.add(num1, num2);
			 	break ;
			case 2 :
				System.out.println("뺄셈");
				num1=sc.nextInt();
			 	num2=sc.nextInt();
				cal1.sub(num1, num2);
				break ;
			case 3 :
				System.out.println("곱셈");
				num1=sc.nextInt();
			 	num2=sc.nextInt();
			 	int mul = cal1.mul(num1, num2);
			 	System.out.println(mul);
			 	
			 	break;
			case 4 : 
				System.out.println("나눗셈");
				int div = cal1.div();
				System.out.println(div);
			 	
				break;
			}
		
			
			
			
			
			
			
		}
	}

}
