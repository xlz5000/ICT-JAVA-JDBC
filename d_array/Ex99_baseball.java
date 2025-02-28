package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex99_baseball {

	public static void main(String[] args) {
		// -----------------------------------
		// [1] 서로 다른 임의의 수 3개를 baseball 변수 지정

		
		int[] baseball = new int[3];
		for (int i = 0; i < baseball.length; i++) {
			baseball[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (baseball[j] == baseball[i]) {
					i--;
					break;
				}
			}
		}

		// baseball값 출력-> 추후에 지움
		for (int i = 0; i < baseball.length; i++) {
			System.out.print(baseball[i] + "/");
		}

		// ---------------------
		// 2. 사용자의 입력값 answer에 숫자로 저장
		// [입력예]
		while (true) {
			int[] answer = new int[3];
			System.out.println("숫자입력 [입력예] 1 2 3 ->");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			StringTokenizer st = new StringTokenizer(str); // 공백이 default
			for (int i = 0; i < answer.length; i++) {
				answer[i] += Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < baseball.length; i++) {
				System.out.print(answer[i] + "/");
			}

			// -------------------------------------
			// 값 비교하여 결과 출력

			int strike = 0, ball = 0;
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if (baseball[i] == answer[j]) {
						if (i == j)
							strike++;
						else
							ball++;

					}
				}
			}
			System.out.println("스트라이크:" + strike + "/볼:" + ball);
			if (strike == 3) {
				break;
			}
			System.out.println("계속 하시겠습니까?(y/n)");
			char c = input.next().charAt(0);
			if (c == 'y') {
				continue;
			} else {
				break;
			}

		}

	}

}
