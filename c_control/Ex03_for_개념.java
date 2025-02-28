package c_control;


/*
 		for ( 초기치; 조건문; 증가치){
 			반복할 구문들
 		}
 */

public class Ex03_for_개념 {

	public static void main(String[] args) {
//		for(int i = 0; i < 10 ; i++ ) {
//			System.out.println("오늘도 행복하세요");
//		}
		
//		int hap = 0;
//		for(int i = 1; i < 11 ; i++ ) {
//			hap += i;	//hap = hap + i
//	}
//		System.out.println("1~10까지 합 : " + hap);
//		
//		// 1~100까지의 홀수의 합과 짝수의 합 출력
//		int odd_total = 0;
//		int twin_total = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				twin_total += i;
//			}else {
//				odd_total += i;
//			} //end of if
//		}
//		System.out.println("홀수의 합" + odd_total);
//		System.out.println("짝수의 합" + twin_total);
//		
		// ch++ 대신, ch = ch+1는 오류 , ch +=1는 오류아님
		// ch = ch + 1에서는 ch는 char이지만 ch + 1하면 int형이 됨
		// ch(2B)에 int(4B)를 넣어야 하는 상황
		// 그래서 casting 써서 ch = (char)ch + 	1임에도 오류
		// ch = (char)(ch + 1)이렇게 써야 오류가 안난다.
		for(char ch = 'A';ch <= 'Z' ; ch++){
			System.out.print(ch);
		}
		
		System.out.println();
//		
//		//'Z' 부터 'A'까지 출력하려면??
//		for(char ch = 'Z'; ch >= 'A'; ch--) {
//			System.out.print(ch);
//		}
	}
}
