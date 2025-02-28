package day04;

public class Ex03_Sync implements Runnable{
	
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + Thread.currentThread().getName());
		}
		
	}

}
