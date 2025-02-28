package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1번
//		String str = input.nextLine();
//		StringTokenizer st = new StringTokenizer(str);
//		int even = 0;
//		int odd = 0;
//		
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int num = Integer.parseInt(token);
//			if(num % 2 ==0) {
//				even += 1;
//			}else {
//				odd += 1;
//			}
//		}
//		
//		System.out.println("출력");
//		System.out.println("짝수 : " + even + "개");
//		System.out.println("홀수 : " + odd + "개");
		
		
		
		
		// 2번
		int total = 0;
		double count = 0;
		for(int i = 0; i <10; i++) {
			int num = input.nextInt();
			if(num == 0) {
				break;
			}
			total += num;
			count += 1;
		} //for end
		
		double avg = total / count;
		System.out.println("출력");
		System.out.println(total);
		System.out.printf("%.2f", avg);
		
		
		// 3번
//		String str = input.nextLine();
//		StringTokenizer st = new StringTokenizer(str);
//		
//		int  max = 0;
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int num = Integer.parseInt(token);
//			if (max < num) {
//				max = num;
//			}
//		}// while end
//		System.out.println(max);
	}

}
