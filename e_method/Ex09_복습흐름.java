package e_method;

public class Ex09_복습흐름 {
	public static void main(String[] args) {
			System.out.println("A");
			test();
			System.out.println("B");
	}
	static void test() {
			System.out.println("C");
			sample();
			imsi();
			System.out.println("D");			
	}	
	static void sample() {
		System.out.println("E");	
	}
	static void imsi() {
		System.out.println("F");	
	}
}

//for(int i = 0; i<c.length; i++) {
//	c[i] = a[i] + b[i];
//}
//
//for(int i = 0; i<c.length; i++) {
//	System.out.println(c[i]);
//}

//함수명:sum
//인자: 정수형 배열 변수 두개
//리턴값: 정수형 배열
//역할: