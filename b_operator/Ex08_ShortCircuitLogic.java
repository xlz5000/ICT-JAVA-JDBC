package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
        /*
		int a = 3;
		if(a > 3 && ++a>3) {
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a); // A=3
		
		if(a > 1 || ++a > 3) {
			System.out.println("조건만족2"); // 조건만족2
		}
		
		System.out.println("A=" + a); // 조건만족2
		
		
		 *  <short circuit logic>
		 * 출력결과가 이거인데 이거는 이상 자바에서만 그러하다
		 * 고로 &&가 아닌 &, ||가 아닌 |를 쓰자
		 */
		

		   
		
		int a = 3;
		if(a > 3 & ++a>3) {
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a);
		
		if(a > 1 | ++a > 3) {
			System.out.println("조건만족2");
		}
		
		System.out.println("A=" + a);
	}
	


}
