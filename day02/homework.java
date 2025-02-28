package day02;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*	로또 생성기
 	원하는 줄 수를 입력 받아서
 	원하는 줄 수만큼 출력
 */

public class homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 줄 수를 입력해주세요>>");
		int num = scan.nextInt();
	

		
		for(int i = 0; i < num ; i++) {
			Set<Integer> set1 = new TreeSet<Integer>();
			
			while(set1.size() < 6 ) {
				int lotto = (int)(Math.random()*45 + 1);
				set1.add(lotto);
			}
			System.out.println(set1);


		}

	}

}
