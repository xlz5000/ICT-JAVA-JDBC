package a_datatype;

//ctrl + shift + o => 자동 소속 넣어줌
import java.util.Scanner;

public class Ex05_Input {

	public static void main(String[] args) {
		System.out.println("당신의 이름은?");
		String irum;
		
		Scanner input = new Scanner(System.in);
		irum  = input.next();
		
		System.out.println(irum +"님 반갑습니다.");
		
		
		//-------------------------
		System.out.println("당신의 나이는?");
		int age;
		
		age = input.nextInt();
		System.out.println(age + "살입니다.");
		
	}

}
