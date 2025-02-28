package day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09_Map {

	public static void main(String[] args) {
		// 이메일가지고 사용자 ID를 찾는 코딩을 하자
		Map<String, String> map = new HashMap<>();
		
		map.put("park@naver.com", "park00");
		map.put("hong@gmail.com", "hong01");
		map.put("kang@gmail.com", "kang02");
		map.put("kim@daum.com", "kim03");
		map.put("lee@naver.com", "lee04");
		
		// key만 관리하자(keySet())
		Set<String> keys = map.keySet();
		Scanner scan = new Scanner(System.in);
		
		esc: while(true) {
			System.out.print("이메일을 입력 : ");
			String str = scan.next();
			if(keys.contains(str)) {
				String res = map.get(str);
				System.out.println("해당 사용자의 ID는 " + res + "입니다.");
			}else {
				System.out.println("잘못 입력된 이메일입니다.");
			}
			while(true) {
				System.out.print("계속하시겠습니까?(y/n)");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("y")) {
					continue esc;
				}else if(ans.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
			
		}
	scan.close();
	System.out.println("수고하셨습니다.");

	}

}
