package d_array;

public class Ex09_로또 {

	public static void main(String[] args) {
		
		int[][] lotto = new int[5][6];
		
		// 로또번호지정
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = (int)(Math.random()*45)+1;
			}
		}
		
//		// 정렬(버블 정렬)
//		for(int k = 0; k < lotto.length; k++) {
//			for(int i = lotto[k].length -1; i > 0 ;i--) {
//				for(int j = 0 ;j <i; j++) {
//					if(lotto[k][j] > lotto[k][j+1]) {
//						//swapping
//						int temp = lotto[k][j];
//						lotto[k][j] = lotto[k][j+1];
//						lotto[k][j+1] = temp;
//					} //if
//				} // for 3
//			 } // for 2
//		} // for 1
//		
		
		// 선택정렬 : 1회전시 0번째 인덱스 확정, 2회전시 1번째 인덱스 확정.....
		
		int idx = 0;
		for(int k = 0; k < lotto.length; k++) {
			for(int i = 0; i < lotto[k].length - 1; i++) { //0번째 부터 마지막 인덱스 한개 전까지 돌면 됨.
				int min = 99999;
				for(int j = i; j < lotto[k].length; j++) { // i번째 부터 끝까지 최솟값 찾기
					if(lotto[k][j] < min) {
						min = lotto[k][j];
						idx = j;
					}
				}
				
			
					int temp = lotto[k][idx]; // 배열의 i번째 값이랑 최솟값을 가진 배열의 인덱스값과 
					lotto[k][idx] = lotto[k][i]; // swapping
					lotto[k][i] = temp;
				
			}
		}
		
//		// 삽입정렬
//		for(int k = 0; k < lotto.length; k++) {
//			for(int i = 1; i< lotto[k].length; i++) { // 인덱스 1번부터 시작하며
//				for(int j = i - 1 ; j >=0 ; j--) { // 인덱스 i를 하고 있을 경우
//					if(lotto[k][i] < lotto[k][j]) { // i와 i-1, i-2...등을 비교해서
//						int temp = lotto[k][i]; //swapping
//						lotto[k][i] = lotto[k][j]; // 이때 swapping시 현재 키값의 인덱스값이 swapping 된 값과 
//						lotto[k][j] = temp; //바뀌므로 swapping 된다면
//						i--; //i -- 해서 해당 i로 바궈야 한다.
//					}
//				}
//			}
//		}
		

		// 출력
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j<lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "/");
			}
			System.out.println();
		}

	}

}
