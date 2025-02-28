package day04;

public class Ex04_Wait implements Runnable{
	
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + Thread.currentThread().getName());
			// 코드 아이디어: ex)가위바위보처럼 세가지 경우의 수면 %3 하면 세가지 경우가 생기니 참고..
//			if(x % 50 == 0) { // 여기서는 151, 201 notifyAll 해야 무한루픈 안 도는데 
			// 201까지 for문이 안 돌기때문에 notifyAll이 안돼서 .. 무한루프가 돌음
			// 이 코드를 쓰고 싶으면 else를 안쓰고 if문 밖 바로 다음 notifyAll하면 무조건 notifyAll이
			// 실행되므로 무한루프 벗어날 수 있음.
			if(x == 50 || x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}else if(x == 51 || x == 101) {
				notifyAll();
			}
			// 굳이 똑같은 내용 wait()쓸거 else if 쓰지말고 or 연산자 || 쓰자
//			else if(x == 100) {
//				try {
//					wait();
//				} catch (InterruptedException e) {
//
//					e.printStackTrace();
//				}
//			}
			//   매번 깨우지 않고 x==51, 101일때만깨우도록 코드 위에 바꿨음 
//			else {
//				notifyAll();
//			}
		}
		
	}
	
}
