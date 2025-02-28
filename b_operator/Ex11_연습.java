package b_operator;

import java.util.Scanner;

public class Ex11_연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//
//		String nums = input.nextLine();
//		System.out.println(nums);
//		String num1 = nums.split(" ")[0];
//		String num2 = nums.split(" ")[1];
//		String num3 = nums.split(" ")[2];
//		
//		int A = Integer.parseInt(num1);
//		int B = Integer.parseInt(num2);
//		int C = Integer.parseInt(num3);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		
		if (A > B && B > C) {
			System.out.println(B);
		}else if (C > B && B > A) { // A,B,C 각각 
			System.out.println(B);
		}else if(B > A & A > C) {
			System.out.println(A);
		}else if(C > A & A > B) {
			System.out.println(A);
		}else if(A > C & C > B) {
			System.out.println(C);
		}else if(B > C & C > A) {
			System.out.println(C);
		}
		
		
		

	}

}
