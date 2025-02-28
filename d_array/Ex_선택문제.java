package d_array;

public class Ex_선택문제 {

	public static void main(String[] args) {
		int a[][]=new  int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		int []hap = new int[a.length];
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				hap[i] += a[i][j];
			}
		}
		
		int max = -99999;
		int row = 0;
		
		for(int i = 0; i<hap.length;i++) {
			if(hap[i]> max) {
				max = hap[i];
				row = i;
			}
		}
		System.out.println("합이 가장 큰 행은 " + row + "이고 합은 "+ max);

	}

}
