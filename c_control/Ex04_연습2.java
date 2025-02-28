package c_control;

import java.util.Scanner;

public class Ex04_연습2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num = input.next();
	
		String year = num.substring(0,4);
		String school = num.substring(4,5);
		String major = num.substring(5,7);
		String school_name = "";
		String major_name = "";
		
		switch (school) {
		case "1" : school_name = "공대";
			switch (major) {
			case "11" :major_name = "컴퓨터학과"; break;
			case "12" :major_name = "소프트웨어학과"; break;
			case "13": major_name = "모바일학과"; break;
			case "22": major_name = "자바학과"; break;
			case "33": major_name = "서버학과"; break;
			}
		case "2": school_name = "사회대"; 
			switch (major) {
			case "11": major_name = "사회학과";break;
			case "12": major_name = "경영학과";break;
			case "13": major_name = "경제학과";break;
			}
		}

		System.out.println(num + " 는 " + year + "년도에 입학한 " + school_name + " " + major_name + " 학생입니다");
	}
  }

