package b_review;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product p = new Product();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("상품번호를 입력하세요->");
		String num = input.next();
		p.setProductNo(num);
		
		System.out.print("상품명을 입력하세요->");
		String name = input.next();
		p.setProductName(name);
		
		
		System.out.print("초기재고량을 입력하세요->");
		int first = input.nextInt();
		p.setStock(first);
		
		
		System.out.println();
		
		System.out.print("판매량을 입력하세요->");
		int sell = input.nextInt();
		p.output(sell);
		
		System.out.println();
		
		System.out.print("입고량을 입력하세요->");
		int sell_in = input.nextInt();
		p.output(sell_in);

	}

}
