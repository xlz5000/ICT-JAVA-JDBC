package day03;

import java.util.Iterator;

// Thread 클래스 : start(), run() 존재한다.
public class Ex03_Cat extends Thread{
//이게 있으면 start(main) ->  start(Ex03_Cat)은 Thread가 안 만들어짐. 고로 쓰면 안됨.
//	@Override
//	public void start() {
//		for(int i = 0; i < 100; i ++) {
//			System.out.println("야옹~ : "  + Thread.currentThread().getName());
//		}
//	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println("야옹~ : "  + Thread.currentThread().getName());
		}
	}
	
}
