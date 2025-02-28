package e_review;

public class Main {

	public static void main(String[] args) {
		Goods g = new Goods();
		g.output();
		
		Goods g2 = new Goods(1004, "의지", "겁나편한 의자");
		g2.output();
		
		Goods g3 = new Goods(2000, "책상");
		g3.output();
		
		//getCount() 앞에 Goods즉 클래스 접근하기 위해 getCount()앞에 static을 붙여줘야함.
		System.out.println("총 상품수:" + Goods.getCount());
	}

}


/*
 	 멤버변수의 값을 지정하는 방법
 	 1> setter 각각지정
 	 2> constructor 초기화
*/