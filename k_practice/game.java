package k_practice;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num = input.nextInt();
		
		int count = 0;
		for(int i = 1; i <=num; i++) {
			int temp = i;
			
			while(temp != 0) {
				if(temp % 10 == 3 | temp % 10 == 6 |temp % 10 == 9) {
					count ++;
					break;
				}
				temp /= 10;
			}//while
		}//for
		
		System.out.println(count);

	}

}
