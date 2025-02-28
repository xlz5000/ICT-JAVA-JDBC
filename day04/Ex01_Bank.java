package day04;

public class Ex01_Bank {
	
	private int total;
	
	// 생성자의 목적인 total 같은데에 초기값 설정하는 데 있음.
	// 생성자는 객체 생성시 무조건 한번 호출, 호출되면서 값을 넣어주면 초기값을 넣어줄 수 있음.

	public Ex01_Bank(int total) {
		this.total = total;
	}
	
	// total 이 private니까 get, set 메소드 설정해주기
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}
	
	// 입금(동기화 처리)
	public synchronized void deposit(int amount) {
		
		total += amount;
		System.out.println(Thread.currentThread().getName()
				+ " 입금 : " + amount + ", 총액: " + total);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// 출금(동기화 처리)
	public synchronized void withdraw(int amount) {
		if(total >= amount) {
			total -= amount;
			System.out.println(Thread.currentThread().getName()
					+ " 출금 : " + amount + ", 총액: " + total);
			
		}else {
			System.out.println(Thread.currentThread().getName()
					+  " 잔액 부족 : " + total);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
