package b_operator;

public class Ex05_Comparable {

	public static void main(String[] args) {
		/*
		 * 비교연산자 : >	>=	<	<=	==	!=
		 * 
		 */
		
		int kor = 88, eng = 88, math = 87;
		int total = kor + eng + math;
		System.out.println("총점:" + total);
		
		//int avg = total / 3; // 두 정수를 나머지하면 결과가 정수이다. (자바만)
		// double avg = (double)total / 3;// 권장
		double avg = total / 3;
		System.out.println("평균:" +  avg);
		
		/*
		if( avg >=90) {
			System.out.println("A학점");
		}else if ( avg >= 80) { 
			System.out.println("B학점");
		}else if( avg >= 70) {
			System.out.println("C학점");
		}
		*/
		
		if( avg >=70) {
			System.out.println("C학점");
		}else if ( avg >= 80) { 
			System.out.println("B학점");
		}else if( avg >= 90) {
			System.out.println("A학점");
		}
		
	
		
		
	}

}
