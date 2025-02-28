package c_control;


import java.util.Scanner;

public class Ex03_연습_선택문제 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		String str = input.nextLine();
		System.out.print(str + " -> ");
		
		for(int i = str.length() - 1; i >= 0; i --) {
			System.out.print(str.charAt(i));
			
		}

	}

}
