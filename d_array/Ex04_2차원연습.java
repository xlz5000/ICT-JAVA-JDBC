package d_array;

public class Ex04_2차원연습 {

	public static void main(String[] args) {
		//int [][] a = new int [][] {};
		int [][] a = {
						{3, -5, 12},
						{-2, 11, 2, -7},
						{21, -21, 3, 9, -27, -11},
						{9, 14, 21, -100}
					};
		//출력
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + "/");
//			}
//			System.out.println();
//		}
		
		//a배열의 모든 값의 합을 구해서 출력
//		int total = 0;
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				total += a[i][j];
//			}
//			
//		}
//		System.out.println("총합:" + total);
		
		// [문제] 각 행의 값들의 합을 출력
		
		int[] hap = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				// 합산
				hap[i] += a[i][j];
			}
			// 출력
			System.out.println(i+ "번째 줄의 합산:" + hap[i]);
			
		}
		
	}

}
