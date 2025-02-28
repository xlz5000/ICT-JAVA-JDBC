package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String []str = {"맛점", "즐기기", "멍때리기"};
		
		
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(str[i]);
			}
			System.out.println("예외가 발생할 여지가 있는 구문");
			//return; 이것을 작성하면 프로그램이 catch 등등 이 밑에 아무것도 
			// 실행하지 않지만, finally만은 실행
			// 단, 여기서 i <4로 할경우 예외 발생하기 때문에
			//for 작동하다가 바로 catch로 가기에 for문 다음 "예외가 발생할 여지~"
			//부터 출력을 하지 않는다.
		}catch(Exception ex) {
			System.out.println("예외발생" + ex.getMessage());
			ex.printStackTrace();
		}finally {
			System.out.println("예외발생여부 관련없이 무조건 수행");
		}
		
	
		System.out.println("프로그램 정상 종료");

	}

}
