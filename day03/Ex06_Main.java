package day03;

public class Ex06_Main {

	public static void main(String[] args) {
		System.out.println("main:" + Thread.currentThread().getName());
		//join() : 현재 스레드는 join()가 호출한 스레드가 끝날 때까지 대기 상태로 빠진다.
		//			join()를 호출한 스레드가 끝나면 그때 다시 실행한다.
		
		
		Ex06_Join j = new Ex06_Join();
		Thread t = new Thread(j);
		Thread t1 = new Thread(j);
		t.start();
		t1.start();
		
		try {
			t.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("수고하셨습니다.");

	}

}
