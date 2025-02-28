package k_practice;

import java.util.Scanner;

public class game2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("mod1을 입력하세요>>");
		int mod1 = input.nextInt();
		
		System.out.print("mod2을 입력하세요>>");
		int mod2 = input.nextInt();
		
		System.out.print("ran을 입력하세요>>");
		int ran = input.nextInt();
		
		int count = 0;
		for(int i = 1; i <= ran ;i ++) {
			if((i % mod1) ==0 & (i%mod2) !=0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
