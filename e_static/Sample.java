package e_static;

public class Sample {

	public static void main(String[] args) {
		
		AData a = new AData();
		System.out.println(a.name);
		
		//BData b = new BData();
		//System.out.println(b.name);
		// 객체이름이 아닌 클래스명도? 접근 가능하다!
		System.out.println(BData.name);
	
	}

}

class AData{
	
	//일반변수(정상)
	String name = "홍길동";
}


class BData{
	static String name = "홍길자";
}
