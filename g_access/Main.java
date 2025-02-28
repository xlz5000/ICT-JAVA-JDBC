package g_access;

public class Main {

	public static void main(String[] args) {
		
		Access me = new Access();
		// private는 다른 클래스에서 접근이 불가능한것 
		// me.a = "프라이빗 변경";
		me.b = "디폴트 변경";
		me.c = "프로텍티트 변경";
		me.d = "퍼블릭 변경";
		

	}

}
