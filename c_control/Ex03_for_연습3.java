package c_control;

import java.util.Scanner;

public class Ex03_for_연습3 {

	public static void main(String[] args) {
		// 문자 하나 입력받아서 문자인지 확인하여 "소문자"출력
		// 그렇지 않고 대문자라면 "대문자"출력
		// 그 외는 "에러" 출력
		
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		
		if ( c >= 'a' && c <='z') {
			for(char d = 'a'; d <= c ; d++) {
				System.out.println(d);
			}
		}else if( c >= 'A' && c <='Z') {
			for(char d = c ; d <= 'Z' ; d++) {
				System.out.println(d);
			}
		}else {
			System.out.println("Error");
		}

	}

}
