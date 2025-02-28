package e_method;


/*
 		인자: agreement		- 보내는 값
 		매개변수: parameter		- 받는 변수 
 */

public class Ex01_인자 {

	public static void main(String[] args) {
		
		//데이터
		int a = 10, b = 20;
		add(a, b);
	}
	
	//다른 언어와 달리 자바는 main함수에서 호출하기 위해 
	// 호출당하는 함수 앞에 static 붙여줘야함.
	static void add(int a, int b) {
		
		// a 와 b값을 더해서 작업
		int sum = a + b;
		System.out.println("합=" + sum);
		
	}

}
