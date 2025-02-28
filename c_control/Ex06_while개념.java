package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_while개념 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 각 과목 점수를 입력(예시. 90/80/70)");
		String strScore = input.next();
		StringTokenizer st = new StringTokenizer(strScore, "/");
		
		
		int total = 0;
		while(st.hasMoreTokens()) { // 90/80/70
			String token = st.nextToken();
			// System.out.println("점수:" + token);
			
			total += Integer.parseInt(token);
		}

		System.out.println("총점:" + total);
	}

}
