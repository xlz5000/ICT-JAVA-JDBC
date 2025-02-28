package b_operator;

/*
 * 조건 ? A : B
 * 조건이 true라면 A 실행하고 false라면 B 실행
 * 
 */

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		/*
		// [0]
		int jumsu = 71;
		if (jumsu >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
		// [1] 삼항연산자
		
		
		/*
		int score = 81;
		String result = (score >= 80) ? "합격" : "불합격";
		System.out.println(result);
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력하세요");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		
		/*
		System.out.println("두 수 중 큰 수는 => ");
		String result = (num1 > num2 )? num1+ " 크다": num2 + " 더 크다";
		System.out.println(result);
		*/
		
		int max = num1 > num2 ? num1:num2;
		System.out.println("두 수 중 큰 수는 =>" + max);
		
		
		
	}

}
