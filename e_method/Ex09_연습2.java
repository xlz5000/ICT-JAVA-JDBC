package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_연습2 {

	public static void main(String[] args) {
		char[][] result = input();
		output(result);
	}
	
	
	// 두 정수와 알파벳 문자 하나 입력받음
	//[예시] 3 4 F
	static char[][] input() {
		Scanner input = new Scanner(System.in);
		System.out.println("입력 [예] 3 4 F => ");
		int first = input.nextInt();
		int second = input.nextInt();
		char ch = input.next().charAt(0);
		
		//return makeSquare(first, second, ch);
		char[][] arr =  makeSquare(first, second, ch);
		return arr;

	}
	
	/*
	 	입력받은 두 정수와 알파벳 문자를 받아서 
	 	첫번째 정수만큼의 행과 두번째 정수만큼의 열의 문자 배열을 만들어서
	 	입력받은 문자로 시작하는 배열을 만들기
	 	[예시]
	 */
	
	static char[][] makeSquare(int first, int second, char ch) {
		char [][] arr = new char[first][second];
		for(int i = 0; i < first; i++) {
			for(int j=0; j <second; j++) {
				arr[i][j] = ch ++;
				//ch++;
			}
		} 
		return arr;
		
	}
	
	// 2차원 문자변수를 받아서 출력
	static void output(char[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j <arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		} 
	}

}
