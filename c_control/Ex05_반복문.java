package c_control;

public class Ex05_반복문 {

	public static void main(String[] args) {
		/*
		 // [1] for 문
		
		for(int i = 0; i< 5; i++) {
		System.out.println("새해복");
		}
		
		 // [2] while 문
				
		int i = 0;
		// for(;i< 5;) {
		while(i<5) {
			System.out.println("새해복2");
			i++;
		}*/
		
		/*
		// [3] do ~ while 문
		int i = 0;
		do {
			System.out.println("새해복2");
			i++;
		}while(i < 5);
		*/
		
		/*
		 * for문: 반복횟수가 정해진 
		 * while 문: 반복횟수가 정해지지 않은 경우 주로 
		 * 
		 * 
		 */
		
		//---------------------------------
		// 1~10까지의 합을 먼저 for문으로 작성 ==> while으로 수정하기
		
		/*
		int result = 0;
		for(int j = 1; j <= 10; j++) {
			result += j;
		}
		System.out.println(result);
		
		
		int total = 0;
		int k = 1;
		while(k <= 10) {
			total += k;
			k++;
		}
		System.out.println(total);
		*/
		
		// do ~ while
		
		int total = 0;
		int k = 1;
		do {
			total += k;
			k++;
		}while(k <= 10);
		System.out.println(total);

	}

}
