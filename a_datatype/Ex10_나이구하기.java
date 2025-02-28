package a_datatype;

import java.util.Calendar;

public class Ex10_나이구하기 {

	public static void main(String[] args) {
		String id = "011212-4234567"
;
		// [1] 한국나이
		char gender = id.charAt(7);
		
		String str_birthYear = "19";
		// gender 는 char이니까 비교시 = 1이 아닌 '1'임을 잊지 x
		if(gender == '1' || gender == '2') {
			str_birthYear = "19" + id.substring(0, 2); // 0번째부터 2번째 앞에까지 : "80"
		}else if( gender == '3' || gender == '4') {
			str_birthYear = "20" + id.substring(0, 2); // 0번째부터 2번째 앞에까지 : "80"
		}
		
		
		//1900 + nai; int + String -> 말도 안돼
		
		//String -> int 형으로 변환(변경)
		//int nai2 = (int) nai; casting은 기본형끼리만 가능. 
		//그래서 casting -> int 기본, String은 참조형이라 불가능
		
		// 여기서 str_birthYear 값을 쓰려면 위에서 if안에만 쓰면 안됨. if밖에도 선언과 초기화 필수.
		int birthYear = Integer.parseInt(str_birthYear); // wrapper 클래스 이용
			// str_birtYear:  "1980"
			// birthYear : 1980
		
		Calendar cal = Calendar.getInstance();
		int cYear = cal.get(Calendar.YEAR);
		
		int age = cYear - birthYear + 1;
		
		System.out.println("당신의 한국나이는 " + age + "세입니다");
	
	}

}
