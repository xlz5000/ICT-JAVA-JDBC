package k_interface.nointerface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		
		OracleDriver driver = new OracleDriver();
		driver.connectOracle();
		driver.insertOracle();
		
		//문제: 데이터베이스 바꿨다는 이유로 다 뜯어고쳐야함.
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		MariadbDriver driver2 = new MariadbDriver();
		driver2.connectDB();
		driver2.insertDB();

	}

}
