package d_array;

import java.util.Scanner;

public class Ex02_성적 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요-> ");
		int num = input.nextInt();
		
		int[] students = new int[num];
		for(int i = 0; i<num; i++) {
			System.out.print(i+"번 학생의 국어점수를 입력하세요->");
			
			students[i] = input.nextInt();
		}
		
		//총점구하기
		int total = 0;
		for(int i = 0; i<students.length;i++) {
			total += students[i];
		}
		
		//총점과 평균 출력
		System.out.println("위 학생들의 총점은 "+ total+ "입니다.");
		System.out.println("위 학생들의 평균은 "+ total/num+ "입니다.");
	}

}
