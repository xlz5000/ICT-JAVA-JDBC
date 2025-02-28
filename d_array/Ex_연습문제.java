package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_연습문제 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("입력할 학생수를 입력하세요.");
		int num = input.nextInt();
		
		int[][] scores = new int[num][3];
		
		for(int i = 0; i < num; i ++) {
			System.out.print((i+1) + "째 학생의 성적을 입력 -> ");
			String str = input.next();
			for(int j = 0; j< 3; j++) {
				scores[i][j] = Integer.parseInt(str.split("/")[j]);
			}

//			StringTokenizer st = new StringTokenizer(str, "/");
//			
//				for(int j = 0; j< 3; j++) {
//					while(st.hasMoreTokens()) {
//					String token = st.nextToken();
//					int score = Integer.parseInt(token);
//					scores[i][j] = score;
//				}
//			}	
		}
		
		

		
		System.out.println("[결과]");
		for(int i = 0; i< num; i++) {
			int total = 0;
			for(int j = 0; j < 3; j++) {
				total += scores[i][j];
			}
			System.out.println((i+1) + "째 학생의 총점 " + total + "이고 평균은 " + total/3 + " 입니다");
		
		}
		
		String[] subject = {"국어", "영어", "수학"};
		System.out.println("[선택]");
		
		int[] subject_total = new int[3];
		

			for(int i = 0; i< 3; i++) {
				for(int j = 0; j < num; j++) {
					subject_total[i] += scores[j][i];
				}
			}
		

//		int[] subject_total = new int[3];
//		for(int j = 0; j < num; j++) {
//			for(int i = 0; i< 3; i++) {
//				subject_total[i] += scores [j][i];
//				System.out.println(subject_total[i]);
//			}
//			for(int j = 0; j < 3; j++) {
//				subject_total[i] += scores[j][i];
//			}
//		}
			
			for(int i = 0; i< 3;i++) {
			System.out.println("[결과]");
			System.out.println(subject[i] + "과목	총점 " + subject_total[i] + "이고 평균은 " + subject_total[i]/num + " 입니다");
			}
		
		
		

	}

}
