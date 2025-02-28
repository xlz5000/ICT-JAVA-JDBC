package c_control;

import java.util.Scanner;

public class Ex04_연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num = input.next();
	
		String year = num.substring(0,4);
		String school = num.substring(4,5);
		String major = num.substring(5,7);
		String school_name = "";
		String major_name = "";
		
		if (school.equals("1")) {
			school_name = "공대";
			if (major.equals("11")) {
				major_name = "컴퓨터학과";
			}else if(major.equals("12")) {
				major_name = "소프트웨어학과";
			}else if(major.equals("13")) {
				major_name = "모바일학과";
			}else if(major.equals("22")) {
				major_name = "자바학과";
			}else if(major.equals("33")) {
				major_name = "서버학과";
			}
		}else if(school.equals("2")) {
			school_name = "사회대";
			if (major.equals("11")) {
				major_name = "사회학과";
			}else if(major.equals("12")) {
				major_name = "경영학과";
			}else if(major.equals("13")) {
				major_name = "경제학과";
			}
		}
		System.out.println(major_name);
		System.out.println(num + " 는 " + year + "년도에 입학한 " + school_name + " " + major_name + " 학생입니다");
	}
  }


