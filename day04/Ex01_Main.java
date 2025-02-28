package day04;

// 여러사람이 하나의 계좌에 입출금하는 코드를 짜라
// Thread 이용


//wait() 재운다 notify() 깨우다
public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Bank bank = new Ex01_Bank(10000);
		
		Ex01_User user1 = new Ex01_User(bank, true, 500, "hong");
		Ex01_User user2 = new Ex01_User(bank, false, 5500, "kang");
		Ex01_User user3 = new Ex01_User(bank, false, 500, "hong");
		Ex01_User user4 = new Ex01_User(bank, true, 1500, "kim");
		Ex01_User user5 = new Ex01_User(bank, false, 500, "hong");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		
		try {
			user1.join();
			user2.join();
			user3.join();
			user4.join();
			user5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("잔액 : " + bank.getTotal());
	}

}
