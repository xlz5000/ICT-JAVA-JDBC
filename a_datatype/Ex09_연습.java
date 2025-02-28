package a_datatype;

import java.util.Scanner;

public class Ex09_연습 {

	public static void main(String[] args) {
		
		/*
		 	- 국, 영, 수 점수를 입력할 변수를 선언
		 	- 사용자에게 국, 영, 수 점수를 입력 받아 해당 변수 저장 하기
		 	- 총점을 계산하여 총점 변수에 저장
		 	- 평균을 계산하여 평균 변수에 저장
		 	- 총점과 평균의 변수를 콘솔에 출력
		 */
		
		int kor, eng, math, total, mean;
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수는?");
		kor = input.nextInt();
		System.out.println("영어점수는?");
		eng = input.nextInt();
		System.out.println("수학점수는?");
		math = input.nextInt();
		total = kor + eng +  math;
		mean = total/3;
		System.out.println("총점은 " + total);
		System.out.println("평균은 " + mean);

	}

}
