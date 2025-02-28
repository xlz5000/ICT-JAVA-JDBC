package day02;

import java.util.Set;
import java.util.TreeSet;

public class Ex02_Set {

	public static void main(String[] args) {
		// 1-10 까지 랜덤 숫자 6개 출력 중복 안되게
		int[] arr = new int[6];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			// random은 실수를 넣기에 int써줘야
			int num = (int)(Math.random()*10 + 1);
			
			//중복 검사
			// arr.contains()로 원소 포함 확인하는 것은 arr이 ArrayList일때 가능한듯..?
			for(int j = 0; j < i; j++) {
				// 중복이면
				if(arr[j] == num) {
					// 새로 난수 발생
					num = (int)(Math.random()*10 + 1);
					j = -1;
				}//if
				
			}//안for
		
			arr[i] = num;
		}//밖
		
		
		//개선된 for문
		//배열 numbers 요소를 하나씩 꺼내서 int i저장
		// : 의 의미가 처음부터 끝까지라는 의미
		//단, 특정요소만을 처리할 때는 더 불편하다.(이유: index가 존재하지 않음)
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		// 1 - 10까지 랜덤 숫자 6개 출력 중복 안되게 (Set)
		Set<Integer> set1 = new TreeSet<Integer>();
		while(set1.size() < 6 ) {
			int su = (int)(Math.random()*10) + 1;
			set1.add(su);
		}
		System.out.println(set1);
		
		
//		int count = 0;
//		esc: while(count < 6) {
//			// random은 실수를 넣기에 int써줘야
//			int num = (int)(Math.random()*10 + 1);
//			
//			
//			// arr.contains()로 원소 포함 확인하는 것은 arr이 ArrayList일때 가능한듯..?
//			for(int j = 0; j < 6; j++) {
//				if(arr[j] == num) {
//					continue esc;
//				}//if
//				
//			}//for
//			
//
//			arr[count] = num;
//			count++;
//		}//while
		

	}

}
