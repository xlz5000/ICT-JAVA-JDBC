package j_review;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Language lang = null;
		Scanner input = new Scanner(System.in);
		System.out.print("언어를 선택하세요(1.한국어 2.영어 3.일본어)");
		int sel = input.nextInt();
		
		//break잊지말기
		switch(sel) {
		case 1: lang = new Korean();break;
		case 2: lang = new English();break;
		case 3: lang = new Japanese();break;
		}
		System.out.print("메세지를 선택하세요(1.인사말 2.자기소개 3.하고픈말)");
		int sel_choice = input.nextInt();
		switch(sel_choice) {
		case 1: lang.greeting();break;
		case 2: lang.introduce();break;
		case 3: lang.message();break;
		}
		
		

	}

}
