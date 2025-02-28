package e_method;

public class Ex01_리턴타입 {

	public static void main(String[] args) {
		//데이터를 받아서 합산하고 결과 처리
		int[] sum = add();
		int total = 0;
		for(int i = 0; i<sum.length; i++) {
			total += sum[i];
			// if 이 안에서 int total += sum[i]
			// 할 경우 for 밖에서 total 사용 못함.
		}
		System.out.println("합산: " + total);
		

	}
	
	static int[] add() {
		// 데이터
		int kor = 99, eng=88, math=77;
		int[] data = {kor, eng, math};
		
		return data ;//리턴할 때 딱 1개만 가능
	}

}
