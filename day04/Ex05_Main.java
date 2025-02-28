package day04;

public class Ex05_Main {

	public static void main(String[] args) {
		Ex05_Car c = new Ex05_Car();
		
		Ex05_Producer p = new Ex05_Producer(c);
		Thread tProducer = new Thread(p);
		
		Ex05_Customer cust  = new Ex05_Customer(c);
		Thread tCustomer = new Thread(cust);
		
		tProducer.start();
		tCustomer.start();

	}

}
