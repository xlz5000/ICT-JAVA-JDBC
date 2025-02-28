package d_array;

public class Ex09_정렬 {

	public static void main(String[] args) {
		int[] lotto = {45, 2, 15, 27, 10, 41};
		//int[] lotto = {9,6,7,3,5};
		
		// 버블 정렬
//		for(int i = lotto.length -1; i > 0 ;i--) {
//			for(int j = 0 ;j <i; j++) {
//				if(lotto[j] > lotto[j+1]) {
//					//swapping
//					int temp = lotto[j];
//					lotto[j] = lotto[j+1];
//					lotto[j+1] = temp;
//				}
//			}
//		}
		
		
		// [선택] 선택정렬, 삽입정렬
		
		// 선택정렬 : 1회전시 0번째 인덱스 확정, 2회전시 1번째 인덱스 확정.....
		
//		int idx = 0;
//		for(int i = 0; i < lotto.length - 1; i++) { //0번째 부터 마지막 인덱스 한개 전까지 돌면 됨.
//			int min = 99999;
//			for(int j = i; j < lotto.length; j++) { // i번째 부터 끝까지 최솟값 찾기
//				if(lotto[j] < min) {
//					min = lotto[j];
//					idx = j;
//				}
//			}
//			
//		
//				int temp = lotto[idx]; // 배열의 i번째 값이랑 최솟값을 가진 배열의 인덱스값과 
//				lotto[idx] = lotto[i]; // swapping
//				lotto[i] = temp;
//			
//		}
		
		// 삽입정렬
		for(int i = 1; i< lotto.length; i++) { // 인덱스 1번부터 시작하며
			for(int j = i - 1 ; j >=0 ; j--) { // 인덱스 i를 하고 있을 경우
				if(lotto[i] < lotto[j]) { // i와 i-1, i-2...등을 비교해서
					int temp = lotto[i]; //swapping
					lotto[i] = lotto[j]; // 이때 swapping시 현재 키값의 인덱스값이 swapping 된 값과 
					lotto[j] = temp; //바뀌므로 swapping 된다면
					i--; //i -- 해서 해당 i로 바궈야 한다.
				}
			}
		}
		
		
		// 셸 정렬
		
		
		
		
		// 출력
		for(int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
