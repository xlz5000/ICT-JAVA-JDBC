package b_practice;

import java.util.Scanner;

public class MainSolution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		
		int n = 5;
		int[] arr = {1,5,4,3,2,5,2,5,5,4};
		s.setN(n);
		s.setVotes(arr);
		for(int i = 0; i<s.vote().length; i++) {
			System.out.print(s.vote()[i]);
			
		}
		
	}

	

}
