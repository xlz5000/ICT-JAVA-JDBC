package day03;

public class Ex03_Cow extends Thread{
//	@Override
//	public void start() {
//		for(int i = 0; i < 100; i ++) {
//			System.out.println("음~메~ : "  + Thread.currentThread().getName());
//		}
//	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("음~메~ : "  + Thread.currentThread().getName());
		}
	}
}
