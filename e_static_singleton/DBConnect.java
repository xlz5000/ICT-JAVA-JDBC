package e_static_singleton;
// 싱글톤 패턴
public class DBConnect {
	
	private DBConnect(){
		System.out.println("실제로 디비 연결");							
	}
	
	private static DBConnect con = null;
	
	//static 붙은 애들은 static 붙은 애들만 접근가능
	public static DBConnect getInstance() {
		// 무조건 단 한번만 객체 생성한다는 의미
		// 한번만 올리기 위해 이 방식을 사용한것 
		if(con == null) con = new DBConnect();
		return con;
		
	}

}
