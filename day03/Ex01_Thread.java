package day03;

public class Ex01_Thread {
	
	// 출력결과의문 왜 play가 먼저 나오나?
	
	
	// 스레드(담당일꾼) : 현재 실행 중인 프로그램 내에서 실행되는 세부 작업 단위
	// 싱글 스레드 : 스레드가 하나,
	// 멀티 스레드 : 스레드가 여러개, 병행처리
	// 자바에서 스레드 생성(일꾼처리): start() -> run()
	
	// 스레드 생성 방법
	// 1. Thread 클래스 이용 : start(), run() 둘 다 존재한다.
	// 2. Runnable 인터페이스 이용 : run()만 존재한다.(start x)
	
	// Thread 클래스 가지고 생성
	// 1. Thread(), 2. Thread(Runnable 인터페이스를 상속받은 객체)
	// 3. Thread(스레드이름지정), 
	// 4. Thread(Runnable 인터페이스를 상속받은 객체, 스레드 이름지정)
	
	
	

	//Thread.currentThread()는 static 메소드여서 Thread 객체를 생성안하고도 
	// 이렇게 코드 가능한듯, 즉 미리 만들어져서 언제나 가져다 쓸 수 있음
	
	
	// 인스턴스와 static의 차이점? 시험 문제
	// 인스턴스변수, 인스턴스 메소드는 반드시 객체를 생성해야 쓸 수 있음. 클래스가 객체 생성할 때 같이 만들어진게 인스턴스
	// static 메소드는 객체 생성과는 상관없이 미리 만들어져 있기에 객체를 만들지 않고도 언제나 가져다 쓸 수 있는 것임.
	// ctrl + 스페이스 =>  옆에 s붙어있으면 이게 static
	
	
	// main이 하는일은 진입점
	// 사람이 쓴 문자를 0과 1로 바꾸는게 컴파일러임
	// jvm이 하는 일은 0,1로 바뀐걸 받아서 자바식으로 해석하고 실행함, jvm은 main도 실행함
	public static void main(String[] args) {
		//현재 실행중인 스레드 이름 구하기
		System.out.println(Thread.currentThread().getName());
		
		// 인스턴스와 static 차이점
		
		//sound(); // 첫번째 차이점: 오류나는 이유 : main에는 미리 만들어진게 있어야하는건데
		// sound()는 아직 안만들어졌으므로 오류가 나는 것
		// 2번째 차이점: static은 class.으로 접근
		
		
		// 첫번째 차이점:  인스턴스 메소드, 변수 :  객체 생성할 때 같이 만들어지는 메소드와 변수를 말함
		Ex01_Thread test = new Ex01_Thread();
		test.sound();// 2번째 차이점: class는 참조변수로 접근
		System.out.println("sound " + Thread.currentThread().getName());
		
		test.play();// 2번째 차이점: class는 참조변수로 접근
		System.out.println("sound " + Thread.currentThread().getName());
	}
	
	public void sound() {
		//현재 실행중인 스레드 이름 구하기
		// 메소드는 끝나면 다시 자기 호출했던 곳으로 감. 
		// 그래서 지금 상황으로는 다시 main의 test.sound()로 감. 고로 main이 출력됨
		// 우리가 지금까지 배웠던것은 main하나에서 한개의 쓰레드 했다고 볼 수 있음
		//(main이 100개든 200개든 하나의 스레드였던 것임. 이것이 싱글쓰레드)
		System.out.println("sound " + Thread.currentThread().getName());
		
		// 만약 무한 루프를 넣으면 자기를 호출한 곳으로 갈 수 없다. 
	}
	
	
	public void play() {
		//현재 실행중인 스레드 이름 구하기
		System.out.println("play: " + Thread.currentThread().getName());
	}

}
