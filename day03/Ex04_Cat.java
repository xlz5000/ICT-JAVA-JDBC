package day03;


// Runnable는 인터페이스이므로 상수와 추상메소드만 있다.
// 일반 클래스가 상속 받으면 추상메서드를 구현 해야 된다.
//Runnable는 run() 만 존재한다.
//shift + f2는 해당 부분 설명서로 연결됨.
public class Ex04_Cat implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("야옹~ : "  + Thread.currentThread().getName());
		}
	}
	
}
