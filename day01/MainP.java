package day01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class MainP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 성적을 담을 객체 필요하다.
		// Set를 이용해서 성적 객체를 담자
		
		//HashSet<Practice> set1 = new HashSet<>();
		Set<Practice> set1 = new HashSet<>();
		
		
			
		esc: while(true) {
			try {
				System.out.print("이름을 입력하세요>>");
				String name = input.next();
				
				System.out.print("국어점수를 입력하세요>>");
				int kor = input.nextInt();
				
				System.out.print("영어점수를 입력하세요>>");
				int eng = input.nextInt();
				
				System.out.print("수학점수를 입력하세요>>");
				int math = input.nextInt();
				
				Practice p = new Practice(name, kor, eng, math);
				// 만약 Practice p = new Practice();하고
				// p.setName(name)하면 
	//			p.sum();
	//			p.avg();
	//			p.hak();
				// 따로 써줘야함
				System.out.println(p);
				
				set1.add(p);
			}catch(Exception e) {
				System.out.println("점수는 숫자로 넣어주세요");
				input.next(); // 입력버퍼 지우기
				continue esc;
			}
			
			while(true) {
				System.out.print("계속할까요?(y/n)?");
				String msg = input.next();
				if(msg.equalsIgnoreCase("y")) { //equals는 y만 
					// equalsIngnoreCase는 Y도 가능
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
					
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
				
			}
		}
			
		
		System.out.println();
		input.close();
		
		Iterator<Practice> it1 = set1.iterator();
		while(it1.hasNext()) {
			Practice p = (Practice) it1.next();

			System.out.println(p.getName() + "\t"); //탭
			System.out.println(p.getSum() + "\t");
			System.out.println(p.getAvg() + "\t");
			System.out.println(p.getHak() + "\n"); //줄 바꿈
		}

	}

}


//public class MainP {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		HashSet<Practice> set1 = new HashSet<>();
//		
//		
//		while(true) {
//			System.out.print("이름을 입력하세요>>");
//			String name = input.next();
//			Practice p = new Practice();
//			p.setName(name);
//			
//			System.out.print("국어점수를 입력하세요>>");
//			int kor = input.nextInt();
//			p.setKor(kor);
//			
//			System.out.print("영어점수를 입력하세요>>");
//			int eng = input.nextInt();
//			p.setEng(eng);
//			
//			System.out.print("수학점수를 입력하세요>>");
//			int math = input.nextInt();
//			p.setMath(math);
//			
//			set1.add(p);
//			
//			
//			System.out.print("끝내시겠습니까?(y/n)>>");
//			String answer = input.next();
//			if(answer.equals("y")) {
//				break;
//			}
//			
//		}
//		
//		Iterator<Practice> it1 = set1.iterator();
//		while(it1.hasNext()) {
//			Practice p = (Practice) it1.next();
//			
//			int total = p.getMath() + p.getKor() + p.getEng();
//			System.out.println("이름:" + p.getName());
//			System.out.println("합계:" + total);
//			System.out.println("평균:" + total/3);
//			if(total/3 >= 90) {
//				System.out.println("A");
//			}else if(total/3 >= 80) {
//				System.out.println("B");
//			}else if(total/3 >=70) {
//				System.out.println("C");
//			}else {
//				System.out.println("F");
//			}
//		}
//
//	}
//
//}
