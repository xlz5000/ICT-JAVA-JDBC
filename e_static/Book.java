package e_static;

/* [static]
  	` 공유 - 객체끼리의 공유 
  	` 메모리에 단 1개만 생성
  	` 객체 생성보다 먼저 생성 ==> 클래스명으로 접근
  	
  	--> static은 클래스명 접근
 */

public class Book {
	
	private static int count;
	
	
	//Book.getCount()처럼 static count 접근하고 싶을경우 이경우도
	//객체 생성 전에 접근가능해야 해서 객체 이름이 아닌 클래스명.getCount()로 
	//표현하고자하는데 오류가 난다. 오류를 해결하기에 위해 이 함수에도 static을
	//꼭 붙여주자. 이게 바로 static에 캡슐화 개념 접목 시킨것
	public static int getCount() {
		return count;
	}
	
	
	/*
	  예시
	 	Integer i = new Integer;
	 	i.parseInt()
	 	
	 	대신
	 	
	 	Integer.parseInt();
	 	(객체 i를 만들지 않고도 클래스명 Integer에
	 	parseInt()함수 가져온 것. 즉 static인듯?)
	 	
	 	--------------------------------------
	 	
	 	Calendar c = Calendar.getInstance();
	 	Calendar는 클래스 getInstance()은 static임을 알 수 있음.
	 	
	 */
	public Book() {
		count ++;
		System.out.println("책 한권 생성");
	}
}
