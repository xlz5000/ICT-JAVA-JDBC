package d_array;

public class Ex03_2차원 {

	public static void main(String[] args) {
		char[][] alpha = new char[3][4]; //'\u0000'
		//char alpha[][] = new char[3][4];
		//char[] alpha[] = new char[3][4];
		
//		alpha[1][1] = 'ㅋ';
//		alpha[1][3] = 'ㅎ';
//		alpha[2][2] = '힣';
		
		//값지정
		
		char c = 'A';
		for(int i = 0; i<alpha.length; i++) {
			for(int j = 0; j < alpha[i].length; j++, c++) {
				alpha[i][j] = c;
				//c++;
			}
		}
		
		
		// 출력
		for(int i = 0; i<alpha.length; i++) {
			for(int j = 0; j<alpha[i].length; j++) {
			System.out.print(alpha[i][j] + "/");
			}
			System.out.println();
		}
		
	}

}
