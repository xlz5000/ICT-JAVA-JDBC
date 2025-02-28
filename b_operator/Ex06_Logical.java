package b_operator;

import java.util.Scanner;

/*
 * 	 일반논리연산자
 * 
 * 		- OR : ||	최소 1개 ture면 true
 * 		- AND : &&	모두 1이여야 ture
 * 
 * 
 *  -----------------------------
 * 		A	B	A||B	A&&B
 * 	-----------------------------
 * 		0	0	0		0
 * 		1	0	1		0
 * 		0	1	1		0
 * 		1	1	1		1	
 * 
 * 	-----------------------------
 * 		A	B	A||B	A&&B
 * 	-----------------------------
 * 		F	F	F		F
 * 		T	F	T		F
 * 		F	T	T		F
 * 		T	T	T		T	
 * 
 */		

public class Ex06_Logical {

	public static void main(String[] args) {
//
//		int 성적 = 75;
//		char 태도 = 'A';
//		
//		if (성적 >= 80 || 태도 =='A') {
//			System.out.println("성적이 80이점이상이건가 태도가 A이면 우등상입니다");
//		}
//		
//		if('A' > 'B' ){ //'A' : 65	'B' : 66, 'A' < 'B' < 'C'
//			System.out.println("크다");
//		}else {
//			System.out.println("작다");
//		}
//		
//		if('가' > '나' ){ // ㄱ < ㄴ < ㄷ < ㄹ
//			System.out.println("크다");
//		}else {
//			System.out.println("작다");
//		}
//		// 'ㄱ' ~ '힣'
		
		
//		int jumsu = 88;
//		if( jumsu >= 80 && jumsu < 90) {
//			System.out.println("점수가 80이상 90미만이면 우수상");
//		}
		
		
		/*
		 *  1)문자 하나를 입력받아서 그 문자가 대문자인지 출력
		 *  2) 대문자가 아니라면 소문자인지 출력
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자 하나만 입력->");
		char c = input.next().charAt(0);		
		if (c >= 'A' && c <= 'Z') {
			System.out.println("대문자");
		}else if(c >= 'a' && c <='z'){
			System.out.println("소문자");
		}else {
			System.out.println("그 외 문자");
		}
		
	}

}
