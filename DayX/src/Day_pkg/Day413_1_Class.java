package Day_pkg;

import java.util.Scanner;

public class Day413_1_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		boolean run= true;
		int[] score = null; // score  라는 배열 이름만 선언
		
		int student =0;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			if(select == 1 ) {
				System.out.print("학생수> ");
				student = sc.nextInt();
				score = new int[student] ;
			}else if (select ==2 ) {
				// 배열에 데이터 저장 
				for(int i=0; i<score.length; i++) {
					System.out.print((i+1)+ "번 째 학생점수 ");
					score[i] = sc.nextInt();
				}
				
			}else if (select == 3) {
				System.out.println("점수 리스트 :");
				// 배열의 저장된 데이터 출력
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1)+ "번 째 학생점수 "+ score[i]);
				}
			}else if (select == 4) {
				System.out.println("분석 : ");
				// 최대값 평균값 내림차순정렬
				int sum = 0, max = 0;
				double avg = 0.0; // 평균값을 내기 위한 변수
				for(int i=0; i<score.length; i++) {
					if(max < score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
				avg = sum / score.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				System.out.println();
				//내림차순
				int temp;
				for(int i=0; i<score.length; i++) {
					for(int j=i+1; j<score.length; j++) {
						if(score[i] < score[j]) {
							temp = score[i];
							score[i] = score[j];
							score[j] = temp ;
						}
						}
					}
				for(int i=0; i<score.length; i++)
					System.out.println(score[i]);
								
			}else if (select == 5){
				System.out.println("종료");
				run = false; 
			}
		}
	}
}
		
	


