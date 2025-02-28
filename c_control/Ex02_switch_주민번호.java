package c_control;

public class Ex02_switch_주민번호 {

	public static void main(String[] args) {
		String id = "801212-1934567";
		
		// 인덱스 8번째꺼 뽑아 올때 쓰는 거
		char chul = id.charAt(8);

		String home = "";
		
		switch(chul) {
		// chul이 char이기에 case 0이 아닌 case '0'이라고 해야함을 주의
		// break 빼면 home = "경기" 대입
		case '0': home="서울"; break;
		case '1': home="인천/부산"; break;
		case '2': home = "경기"; break;

		}

		System.out.println(home+"태생입니다");

	}

}
