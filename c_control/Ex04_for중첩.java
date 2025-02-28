package c_control;


import java.util.Scanner;

public class Ex04_for중첩 {

	public static void main(String[] args) {
	/*	
		for(int i = 0 ; i < 4 ; i ++) {
			// 개행 여기다가 쓰면 먼저 한줄 띄고 하게 되므로 코드로 
			// 별 5개찍고 그 다음에 개행 해서 한 줄 띄어야 한다는 점 줒의
			for(int j = 0; j< 5; j++) {
				System.out.print('*');
			} // end of for-j
			System.out.println(); // 개행
		}// end of for-i
*/
//		Scanner input = new Scanner (System.in);
//		System.out.println("행과 열을 입력->");
//		int row = input.nextInt();
//		int column = input.nextInt();
//		
//		int sutja = 1;
//		for(int i = 0 ; i < row ; i++) {
//			for(int j = 0 ; j < column ; j++) { 
//				System.out.print(sutja + " "); //sutja + ' ' 이건 공백이 아닌
//				sutja ++; // 이거안쓰고 위에 sutja에서	++써도 됨.// 문자열 합으로 계산됨 고로 " "쓰기
//			}
//			
//			System.out.println();
//		}
		
		Scanner input = new Scanner (System.in);
		System.out.println("행과 열을 입력->");
		int row = input.nextInt();
		int column = input.nextInt();
		
		
		//sol2) 구구단 방식 사용하면 더 쉽고 간단하게 풀림!
		int temp = 1;
		int sutja = 1;
		for(int i = 0 ; i < row ; i++) {
			  temp = sutja;
				for(int k = 1; k <= column; k++) {
					sutja *= k;
					System.out.print(sutja + " ");
					sutja = temp;
				}
				sutja ++;
			System.out.println();
		}
		
	}
	

}
