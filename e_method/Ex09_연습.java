package e_method;

import java.util.Scanner;

public class Ex09_연습 {

	public static void main(String[] args) {
		
		input();


	}
	//국, 영, 수 점수를 입력
	static void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("국어 입력");
		int kor = input.nextInt();
		System.out.println("영어 입력");
		int eng = input.nextInt();
		System.out.println("수학 입력");
		int math = input.nextInt();
		calc(kor, eng, math);
		
	}
	// 입력받은 국, 영, 수 점수를 받아서 총점, 평균 구해서 출력
	static void calc(int kor, int eng, int math) {
		int total = kor + eng + math;
		 int avg = total/3;
		 System.out.println("총점" + total);
		 System.out.println("평균" + avg);
		 output(avg);
		
	}
	
	//평균값만 받아서 학점을 구하고 출력
	static void output(int avg) {
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
	}

}
