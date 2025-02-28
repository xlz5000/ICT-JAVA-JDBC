package e_static;

public class Main {

	public static void main(String[] args) {
		Book b1 =  new Book();
		Book b2 =  new Book();
		Book b3 =  new Book();
		
		//System.out.println("책 갯수:" + b1.count);
		//System.out.println("책 갯수:" + b2.count);
		//System.out.println("책 갯수:" + b3.count);
		
		
		// static은 객체 생성전에 미리 만들어지므로
		// 값 접근시 객체 이름.count가 아닌 클래스명.count로도 접근 가능. 
		// 즉 객체 생성 전에도 접근 가능한 값.
		//System.out.println("책 갯수:" + Book.count);
		
		
		System.out.println("책 갯수:" + Book.getCount());
		

	}

}
