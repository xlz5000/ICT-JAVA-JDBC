package day03;

public class Ex04_Dog implements Runnable{

	
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("멍~멍~ : "  + Thread.currentThread().getName());
		}
	}
}
