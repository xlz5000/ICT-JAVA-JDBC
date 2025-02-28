package d_practice;

public class Account {
	
	private String name;
	private String number;
	private int save;
	
	public Account(String name, String number, int save) {
		this.name = name;
		this.number = number;
		this.save = save;
	}
	
	public void deposit(int money) {
		save += money;
		System.out.println("입금한 금액은 " + money);
	}
	
	public void withdraw(int money) {
		if(save < money) {
			System.out.println("잔액이 부족합니다");
		}else {
			save -= money;
			System.out.println("인출한 금액은 " + money);
		}
		
	}
	
	@Override
	public String toString() {
		return ("예금주 :" +  name + ", 계좌번호: " + number + ", 잔액: " + save);
	}

}
