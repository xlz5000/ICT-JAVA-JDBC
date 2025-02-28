package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		
		
		/*
		int temp = (int)(Math.random()*45) + 1 ;
		//0.0 <= 랜덤값 < 1.0
		// 랜덤수* 10 => 0부터 9까지 임의의 수 
		// 랜덤수* 45 => 0부터 44까지의 임의의 수
		System.out.println(temp);
		*/
		
		// for문 6개의 임의의 수(1~45) 출력
		for(int i = 0; i < 6; i++) {
			int temp = (int)(Math.random()*45 + 1);
			System.out.print(temp + "/");
		}

		
		System.out.println();
		//while 변경
//		int i = 0;
//		while(i<6) {
//			int temp = (int)(Math.random()*45 + 1);
//			System.out.print(temp + "/");
//			i++;
//		}
		
		// do~while 변경
		int i = 0;
		do {
			int temp = (int)(Math.random()*45 + 1);
			System.out.print(temp + "/");
			i++;
		}while(i<6);
	}

}
