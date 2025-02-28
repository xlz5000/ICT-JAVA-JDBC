package k_practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long[] arr= {10, 20, 30, 55, 60, 75, 80, 95, 83, 50};
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num = input.nextInt();
		
		CallcFactory f = new CallcFactory(num);
		
		Calculator c1 = f.getCalculator(num);
		
		System.out.println(c1.calc(arr));
		

	}

}
