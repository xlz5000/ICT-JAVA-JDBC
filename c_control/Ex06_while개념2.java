package c_control;

import java.util.Scanner;

public class Ex06_while개념2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		//구구단 단수를 입력받아서 해당 구구단 출력 -> for문 1-9정해져있기 때문

		
		
		// --------------------------------
		// 개수가 확실할 때는 for문을 쓰자.
		System.out.println("몇 번 반복하시겠습니까?");
		int su = input.nextInt();
		for(int m = 0; m < su ; m++) {
			System.out.println("단 입력=> ");
			int dan = input.nextInt();
				for(int i=1; i<=9; i++) {
					//System.out.println(dan+ " * " + j + " = " + dan*j);
					
					System.out.printf(" %d * %d = %d \n", dan, i, dan * i);
				}

		}*/
		
		//--------------------------------------------
		
		while(true) {
			System.out.println("단 입력=> ");
			int dan = input.nextInt();
				for(int i=1; i<=9; i++) {
					//System.out.println(dan+ " * " + j + " = " + dan*j);
					
					System.out.printf(" %d * %d = %d \n", dan, i, dan * i);
				}
				System.out.println("끝내시겠습니까?(y|n)");
				String answer = input.next();
				if(answer.equals("y") | answer.equals("Y")) { // ** String은 무조건 == 실행 x 고로 꼭 .equals()쓰기
					break; // 어차피 break;실행문 할거는 똑같으니
				}// 대문자, 소문자 if랑 else if로 하기보다는 하나의 if문에서 | 활용하기

		}
		
		
	}

}
