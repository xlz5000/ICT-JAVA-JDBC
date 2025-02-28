package day06;



public class test4 {

	public static void main(String[] args) {
		
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				even += i;
				System.out.println(i);
			}else {
				odd += i;
			}
		}
		
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
	}

}
