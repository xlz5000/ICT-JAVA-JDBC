package c_control;

/*
 	switch( 문자형 | 정수형 | String ) {
 	
	 	case 값1(예를 들어 a>90 처럼 값이 아닌 수식 불가): 실행문; break;
	 	case 값2: 실행문2; break;
	 	case 값3: 실행문3; break;
	 	default: 실행문9; break;
 	
 	}
 */


import java.util.Scanner;

public class Ex02_switch_전화번호 {

	public static void main(String[] args) {
		
		/*
		 * 전화번호를 입력받아서
		 * 지역번호 02라면 서울 출력
		 * 지역번호가 032라면 인천 출력
		 * 나머지는 한국 출력
		 * 
		 * 단, switch문으로 작성
		 */
		
		Scanner input = new Scanner(System.in);
		String number = input.next();
		int idx = number.indexOf('-');
		String localnum = number.substring(0, idx);
		
		switch(localnum) {
		case "02": System.out.println("서울"); break;
		case "032": System.out.println("인천"); break;
		default: System.out.println("한국");  break;
		
		}
		
		
		


	}

}
