package c_control;

public class Ex04_for중첩2 {

	public static void main(String[] args) {
		/*
		 * 
		 * [1] 5행 5열 기본
		for(int i = 0 ; i < 5; i++) { // 행
			for(int j = 0; j < 5 ; j++) { // 열
				System.out.println('*');
				
			}//j
			System.out.println();
		}//i
		*/
		
		//[2]
		
		/*  규칙 첫번째 열 - 별 5개, 2번째 열 - 별 4개 즉 합쳐서 6정도의
			 *****
			 ****
			 ***
			 **
			 *
		 */
		
//		for(int i = 0 ; i < 5; i++) { // 행
//			for(int j = 0; j < 5 - i ; j++) { // 열 //sol2) j= i;j<5
//				System.out.print('*');
//				
//			}//j
//			System.out.println();
//		}//i
		
		
		//[3] i와 j간의 관계를 잘 고민해보기 첫번째 열- 별 1개, 두번째 열 - 별 두개
		/*
		 *  *
			**
			***
			****
			*****
		 */
		for(int i = 0 ; i < 5; i++) { // 행
		for(int j = 0; j <= i ; j++) { // 열 //sol2) j= i;j<5
			System.out.print('*');
			
		}//j
		System.out.println();
	}//i

	}

}
