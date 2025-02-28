package c_control;

public class Ex07_break_continue {

	public static void main(String[] args) {
		
		
		/*
		 * break와 continue 차이점 확인
		 */
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j < 3; j++) {
				// if(j == 1) break;
				if(j == 1) continue;
				System.out.printf(" < %d, %d> \n", i, j);
			
			System.out.println("-------- 데이터 --------");
		}

	}
	}

}
