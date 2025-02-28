package day03;

public class Ex03_Main {

	public static void main(String[] args) {
		// main이 먼저 출력 다 되고 그 다음 run()이 처리가 되는건가? 근데 04는 그렇지 않다.. 수고하셨습니다가 나중에 아무데나 나옴
		// but 이건 먼저 나옴
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cow cow = new Ex03_Cow();
		
		
		// start() -> run() : 스레드 생성
		
		// run() 호출 : 스레드 아님(start-> run이 아니기에 싱글 스레드로 처리 됐음)
//		cat.run();
//		dog.run();
//		cow.run();
		
		// 스레드 처리됨
		// 부모인 Thread에게 start()와 run()있음. 고로 자식은 부모에게서 가져올 수 있으니까
		// 여기서 자식이 부모에게서 start()메소도를 가져와서 사용 할 수 있었던 것
		//병행처리라 cat 먼저 호출했다고 cat이 먼저 오지 않음. 병렬 처리하기에 섞일 수 있음.
		
		//만약 cat에도 start있어서 start -> start하면 이것은 Thread가 아님 main으로만 쭉 처리
		// 즉 run-> run도 안됨. start ->  run만 가능
		
		// Thread의 경우 무한루프일경우 3개가 각자 돌아감.
		cat.start();// 이 이후로 cat에 있는 run으로 가서 일꾼 떨구고 다시 옴.
		System.out.println("main : " + Thread.currentThread().getName());// main 출력
		
		dog.start();// 이 이후로 dog에 있는 run으로 가서 일꾼 떨구고 다시 옴.
		System.out.println("main : " + Thread.currentThread().getName());// main 출력
		
		cow.start();// 이 이후로 cow에 있는 run으로 가서 일꾼 떨구고 다시 옴.
		System.out.println("main : " + Thread.currentThread().getName()); // main 출력
		
		
		//main을 jvm이 호출, 고로 main호출돼서 실행되고 jvm에게로 돌아감.
		
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
		
		
		
	}
	
	

}
