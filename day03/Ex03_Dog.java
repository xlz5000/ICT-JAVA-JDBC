package day03;

public class Ex03_Dog extends Thread{
//	@Override
//	public void start() {
//		for(int i = 0; i < 100; i ++) {
//			System.out.println("멍~멍~ : "  + Thread.currentThread().getName());
//		}
//	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("멍~멍~ : "  + Thread.currentThread().getName());
		}
	}
}
