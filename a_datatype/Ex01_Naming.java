package a_datatype;

public class Ex01_Naming {

/*  
  변수 : 메모리상에 하나의 값을 저장하는 공간
  데이터 타입(자료형)
  1. 기본형 
   - 논리형 : boolean
   - 문자형 : char
   - 정수형 : int /long
   - 실수형 : double
 */
	public static void main(String[] args) {
		// 문자형 변수 선언 -> 문자 1개를 저장하는 공간을 만들고 공간의 이름이 ch이다.
		char ch;
		
		// 정수형 변수 abcdefg 선언
		int abcdefg;
		
		// 실수형 변수 Ch 선언
		double Ch;
		
		// ----------------------
		// 값 대입 -> 변수에 값을 저장
		
		ch ='홍'; // char(문자한개) : ' '
		abcdefg = 100;
		Ch = 3.6;
		
		// 값을 출력
		System.out.println(ch);
		System.out.println(abcdefg);
		System.out.println(Ch);
		
		// 논리형 변수 b 선언
		boolean b;
		
		//변수 b에 true 값 대입하기
		b = true;
		
		// 변수 b를 출력
		System.out.println("변수 b안에 있는 값:" + b);

	}

}
