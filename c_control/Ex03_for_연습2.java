package c_control;


import java.util.Scanner;
public class Ex03_for_연습2 {

	public static void main(String[] args) {
		// 숫자 하나를 입력받아 1부터 그 숫자까지 출력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자하나 입력->");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i ++) {
			System.out.print(i + " ");
			if (i % 5 == 0) {
				System.out.print("\n");
			}
		} //end of for
		
		/* System.out.println(i + " ");
		 *  1 2 3 4 5 6 7 8 9 10가 아닌
		 *  
		 *  1 2 3 4 5
		 *  6 7 8 9 10 출력되게 해주자
		 */
	
		
	}

}
