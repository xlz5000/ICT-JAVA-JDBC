package day03;

public class Ex07_Main {
	public static void main(String[] args) {
		Ex07_Sync sync = new Ex07_Sync();
		Thread t1 = new Thread(sync, "dog");
		Thread t2 = new Thread(sync, "cat");
		Thread t3 = new Thread(sync, "tiger");
		Thread t4 = new Thread(sync, "lion");
		
		
		// 실행순서가 t1, t2, t3, 이런식으로 코드 순서가 아님.
		// 병렬처리기 때문에 t2가 먼저 나올수도 t3가 먼저 나올수도 뭐가 먼저 나올지 모름
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
