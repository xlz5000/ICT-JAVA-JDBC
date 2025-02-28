package g_access2;

import g_access2.sub.Access;

public class Main {

	public static void main(String[] args) {
		
		Access me = new Access();
		// private는 다른 클래스에서 접근이 불가능한것 
		// me.a = "프라이빗 변경";
		
//		me.b = "디폴트 변경";
//		me.c = "프로텍티트 변경";
		
		//public은 다른 패키지에 있어도 접근가능, 즉 모두 접근 가능
		me.d = "퍼블릭 변경";
		

	}

}
