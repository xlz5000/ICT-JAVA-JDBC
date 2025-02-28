package d_review;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		System.out.print("데이터 갯수->");
		int num = input.nextInt();
		int [] data = new int[num];
		
		System.out.print("점수입력 (예시)10, 20, 30 ->");
		
		String str = input.next();
		StringTokenizer st = new StringTokenizer(str, ",");
		for(int i = 0; i < num; i++) {
			data[i] =Integer.parseInt(st.nextToken());
	}
		
		
//		for(int i = 0; i < num; i++) {
//			data[i] = input.nextInt();
//		}
		System.out.print("점수들: ");
		for(int i = 0; i < num; i++) {
			System.out.print(data[i]);
			if( i != num -1) {
			System.out.print(", ");
			}
		}
		
		
		System.out.println();
		
		GradeExpr g = new GradeExpr(data);
		System.out.println("총점: " + g.getTotal());
		System.out.printf("평균: %.2f" , g.getAverage());
		System.out.println();
		System.out.println("최고 점수: " + g.getGoodScore());
		System.out.println("최저 점수: " + g.getBadScore());
		

	}

}
