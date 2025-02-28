package c_control;


import java.util.Scanner;

public class Ex04_for중첩_연습3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		if(m == 1) {
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(m == 2) {
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n - i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}else {
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n - i - 1 ; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 2 * i + 1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}

}
