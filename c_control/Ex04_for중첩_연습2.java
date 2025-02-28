package c_control;


import java.util.Scanner;

public class Ex04_for중첩_연습2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//[1]
//		int n = input.nextInt();
//		int m = input.nextInt();
//		int num = 1;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m ; j++) {
//				System.out.print(num + " "); 
//				num += 1;
//			}
//			System.out.println();
//		}
		
//		int n = input.nextInt();
//		int m = input.nextInt();
//		for(int i = 0; i < n; i++) {
//			for(int j = 1; j <= m ; j++) {
//				System.out.print(i + j + (m-1) * i); 
//				
//			}
//			System.out.println();
//		}
//		
		
		// [2]
		int n = input.nextInt();
		int num1 = 1;
		int num2 = 1;
		
		for(int i = 0; i < n; i++) {
			num2 = num1;
			for(int j = 0; j < n; j++) {
				System.out.print(num2 + " ");
				num2 += n;
			}
			
			System.out.println();
			num1 ++;
		}
		
//		//[3]
//		int num = 1;
//		int n = input.nextInt();
//		int m = input.nextInt();
//		for(int i = 1; i <= n; i++) {
//			if( i % 2 == 1) {
//				for(int j = 0; j < m ; j++) {
//					System.out.print(num ++ + " ");
//				}
//				num --; // num ++를 하고 끝나므로 +1 한번 더 됐기에 --빼줘야함
//			}else {
//				for(int j = 0; j < m ; j++) {
//				System.out.print(num -- + " ");
//				}
//				num ++; // num--를 하고 끝나므로 -1 한번 더 됐기에 ++더해줘야함
//			}	
//			num += m;
//			System.out.println();
//				
//			}
//		}
		
				
	}
}


