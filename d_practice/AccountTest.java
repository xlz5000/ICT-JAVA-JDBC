package d_practice;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("예금주: ");
		String name = input.next();
		System.out.print("계좌번호: ");
		String number = input.next();
		System.out.print("잔액: ");
		int save = input.nextInt();
		
		Account a = new Account(name, number, save);
		a.deposit(10000);
		System.out.println(a);
		System.out.println();
		a.withdraw(20000);
		System.out.println(a);

	}

}
