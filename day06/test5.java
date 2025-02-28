package day06;

public class test5 {

	public static void main(String[] args) {
		int[] lotto = {45,2,15,27,10, 41};
		
		for (int i = lotto.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(lotto[j+1] < lotto[j]) {
					int temp = lotto[j];
					lotto[j] =  lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
