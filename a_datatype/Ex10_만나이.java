package a_datatype;

import java.util.Calendar;

public class Ex10_만나이 {

	public static void main(String[] args) {
		String id = "800126-1234567";
		
		// int 형 birthYear, birthMonth, birthDay
		
		int birthYear = Integer.parseInt("19" + id.substring(0,2));
		int birthMonth = Integer.parseInt(id.substring(2,4));
		int birthDay = Integer.parseInt(id.substring(4,6));// 숫자값이므로 02일경우 2만 콘솔에 출력됨. 0은 생략
		
		

		System.out.println(birthYear + "/" + birthMonth + "/" + birthDay);
		
		//	 오늘 날짜의 년/월/일
		Calendar c = Calendar.getInstance();
		
		int cYear = c.get(Calendar.YEAR);
		int cMonth = c.get(Calendar.MONTH)+ 1; 
		int cDay = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(cYear+ "/" + cMonth + "/" + cDay);
		
		// 만나이 구하기
		int age = cYear - birthYear;
		
		
		// 12 * 100 + 2 => 1202
		// 1 * 100 + 27 => 127
		
		if(birthMonth * 100 + birthDay > cMonth*100 + cDay) {
			age--;
		}
		System.out.println(age);
	
	
	}

}
