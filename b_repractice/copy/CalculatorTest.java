package b_repractice.copy;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr();
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 두개를 입력해주세요");
		int num1 =  input.nextInt();
		int num2 = input.nextInt();
		c.setNum1(num1);
		c.setNum2(num2);
		
		System.out.println("덧셈:"+ c.getAddition());
		System.out.println("덧셈:"+ c.getSubtraction());
		System.out.println("덧셈:"+ c.getMultiplication());
		System.out.println("덧셈:"+ c.getDivision());
		
		while(true) {
		System.out.println("계속하기겠습니까?");
		char ch = input.next().charAt(0);
		if(ch == 'n') {
			break;
		}
		System.out.println("숫자 두개를 입력해주세요");
		num1 =  input.nextInt();
		num2 = input.nextInt();
		c.setNum1(num1);
		c.setNum2(num2);
		System.out.println("추출된 숫자:" + num1 + num2);
		System.out.println("덧셈:"+ c.getAddition());
		System.out.println("덧셈:"+ c.getSubtraction());
		System.out.println("덧셈:"+ c.getMultiplication());
		System.out.println("덧셈:"+ c.getDivision());
		
		}
	}	
}
