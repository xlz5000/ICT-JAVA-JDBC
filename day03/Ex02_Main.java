package day03;

public class Ex02_Main {

	public static void main(String[] args) {
		
		//이게 싱글스레드 
		
		
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		Ex02_Cow cow = new Ex02_Cow();
		
		dog.play();
		System.out.println("main : " + Thread.currentThread().getName());
		
		cat.play();
		System.out.println("main : " + Thread.currentThread().getName());
		
		cow.play();
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
	}
	
	


}
