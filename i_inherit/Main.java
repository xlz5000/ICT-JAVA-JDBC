package i_inherit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Book b = new Book("1000", "자바", "자바쌤", "ICT");
//		b.output();
		
		Item i = null;
		
		System.out.println("등록할 상품(1.책 2.CD 3. DVD) ->");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: i = new Book("1000", "자바", "javassem", "ICT");break;
		case 2: i = new CD();break;
		case 3: i = new DVD();break;
		}
		
		//상황에 따라 해당하는 것의 output함수를 출력해줌
		// 다형성이라고 함
		i.output();
		
		//i.output()과 같은 의미
//		switch(sel) {
//		case 1: b.output();break;
//		case 2: c.output();break;
//		case 3: d.output();break;
//		}
		
	}

}
