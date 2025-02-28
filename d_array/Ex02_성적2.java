package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_성적2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생들의 국어점수를 입력하세요 ( 입력예시 : 10/10/10/10/10 ) ->");
		//String str = input.next(); // 스페이스바, 엔터, 탭키 등등 문자열종료로 취급
		String str = input.nextLine(); // 엔터만 종료로 취급
		StringTokenizer st = new StringTokenizer(str, "/");
		
		int[] kor = new int[st.countTokens()];
		//System.out.println("토큰 수:" + st.countTokens());
		
		
		// 국어점수를 kor 변수에 지정(**)
		
	
			// 꼭 while문 (st.hasMoreTokens()) 쓸 필요 x
			// 여기서는 배열을 사용하기에 kor.length로 i 제한을 둘 수 있기 때문
			for(int i = 0; i<kor.length; i++) {
//				String token = st.nextToken();
//				int num = Integer.parseInt(token);
//				kor[i] = num;
				
				kor[i] = Integer.parseInt(st.nextToken());
			}
			
		
		
		
		// 총점과 평균 구해서 출력
		
		int total = 0;
		for(int i = 0; i<kor.length;i++) {
			total += kor[i];
		}
		System.out.println("위 학생들의 총점은 "+ total+ "입니다.");
		System.out.println("위 학생들의 평균은 "+ total/kor.length+ "입니다.");
		
	}

}
