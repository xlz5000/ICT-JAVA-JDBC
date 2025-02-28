package e_method;

import java.util.Scanner;

public class Ex09_복습 {

	public static void main(String[] args) {
		String answer = func();
		//합격여부를 출력
		System.out.println(answer);
		
		method(answer);
		
	
	}
	
	static void method(String answer) {
		// 합격여부를 출력
		System.out.println(answer);
		
	}
	
	static String func() {
		// 점수를 입력받아 80점이상이면 "합격" 리턴 그렇지 않으면 "불합격" 리턴하기
		System.out.println("점수 입력->");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num >= 80) {
			return "합격"; // 여기가 오류일경우 위에 void는 아닌지 확인
		}else {
			return "불합격";
		}
		
	}

}
