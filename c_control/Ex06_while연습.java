package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_while연습 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아서 입력 받은 수들 중에서 짝수의 개수와 홀수의 개수를 각자 구해서 출력
		 * 
		 * [입력 예]
		 * 10 20 22 1 99 120 44 35
		 * 
		 * [출력예]
		 * 	짝수 : x개
		 * 	홀수 : y개
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("숫자 입력=>");
		String str = input.nextLine();
		
		int odd_count = 0;
		int even_count = 0;
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int num = Integer.parseInt(token);
			System.out.println(num);
			if(num % 2 == 0) {
				even_count += 1;
			}else {
				odd_count += 1;
			}
		}
		System.out.println("짝수 : " + even_count + "개");
		System.out.println("홀수 : " + odd_count + "개");
		
//		int odd_count = 0;
//		int even_count = 0;
//		while(true) {
//			System.out.println("숫자 입력=>");
//			int num = input.nextInt();
//			
//			if(num % 2 == 0) {
//				even_count += 1;
//			}else {
//				odd_count += 1;
//			}
//		}
		


	}

}
