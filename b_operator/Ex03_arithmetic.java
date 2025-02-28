package b_operator;


import java.util.Scanner;

public class Ex03_arithmetic {

	public static void main(String[] args) {
		
		// 통로(아직 입력 x)
		Scanner input = new Scanner(System.in);
		
		System.out.println("더하기");
		System.out.println("첫번째 숫자 입력하세요->");
		
		// 입력 받기(아직 저장 x)
		//input.next();
		
		// Casting은 참조형이 아닌 기본형에만 적용 -> 그래서 이 코드는 오류임
		//int su1 = (int)input.next();
		
		int su1 = input.nextInt();
		
		System.out.println("두번째 숫자 입력하세요->");
		int su2 = input.nextInt();
		
		int result1 = su1 + su2;
		
		System.out.println("더하기 결과:" + result1);
		
		// 빼기(-)
		System.out.println("빼기");
		System.out.println("첫번째 숫자 입력하세요->");
		int a = input.nextInt();
		System.out.println("두번째 숫자 입력하세요->");
		int b = input.nextInt();
		
		int result2 = a - b;
		System.out.println("뺄셈 결과:" + result2);
		
		// 곱하기(*)
		System.out.println("곱하기");
		System.out.println("첫번째 숫자 입력하세요->");
		int c = input.nextInt();
		System.out.println("두번째 숫자 입력하세요->");
		int d = input.nextInt();
		int result3 = a * b;
		System.out.println("곱하기 결과:"  + result3);
		
		
		// 나누기(/)
		System.out.println("나누기");
		System.out.println("첫번째 숫자 입력하세요->");
		int e = input.nextInt();
		System.out.println("두번째 숫자 입력하세요->");
		int f = input.nextInt();
		int result4 = e / f;
		System.out.println("나누기 결과:" + result4);
		 
		
		// 나머지(%)
		System.out.println("나머지");
		System.out.println("첫번째 숫자 입력하세요->");
		int h = input.nextInt();
		System.out.println("두번째 숫자 입력하세요->");
		int i = input.nextInt();
		int result5 = h % i;
		System.out.println("나머지 결과:" + result5 );
 
	}

}
