package day04;


// 두 개의 스레드를 생성하여 첫번째 스레드의 출력을 1-100까지 출력하고,
// 두번째 스레드의 출력은 101-200까지 출력하라(synchronized 사용)
public class Ex03_Main {
	
	public static void main(String[] args) {
		
		Ex03_Sync syn = new Ex03_Sync();
		
		Thread t1 = new Thread(syn, ": first");
		Thread t2 = new Thread(syn, ": second");
		
		
//		Thread t1 = new Thread(syn);
//		Thread t2 = new Thread(syn);
		
		
		t1.start();
		t2.start();
	}
	
	
	
}
