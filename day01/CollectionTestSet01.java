package day01;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionTestSet01 {

	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : Hashset, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨
		// 		단, TreeSet은 항상 오름차순을 유지
		
		
		//1. 컬렉션 생성
		// E => Element = 요소;
		// 컬렉션에는 객체만 들어갈 수 있기에 클래스로만 만든 참조형 String같은것만 가능, 기본형 int나 double는 불가
		HashSet<String> h1 = new HashSet<>();// 참조형을 집어넣어야 오류가 안 뜬다
		// 기본 자료형을 클래스로 만들고 싶을 때(int나double을 class를 만들고 싶을 때 랩퍼 클래스를 쓴다)
		// int를 class로 만들어주는 랩퍼 클래스가 Integer
		HashSet<Integer> h2 = new HashSet<>();// 기본형int쓰면 오류
		// double를 class로 만들어주는 랩퍼 클래스는 Double
		HashSet<Double> h3 = new HashSet<>();
		
		// 2. 컬렉션에 객체 넣기(add(E e))
		String str1 = "Hello";
		String str2 = "world";
		String str3 = "java";
		
		
		h1.add(str1);
		h1.add(str2);
		h1.add(str3);
		h1.add(new String("spring"));
		
		//중복불가
		h1.add(str2);
		h1.add(new String("Hello"));
		System.out.println(h1);
		
		//ctrl+스페이스 했을때 저렇게 찍 그어진거 있으면 저것은 지원안할 수도 있다는 의미
		Integer int1 = new Integer(10);
		Integer int2 = new Integer("20");
		
		h2.add(int1);
		h2.add(int2);
		h2.add(new Integer(30));
		h2.add(new Integer(10));
		h2.add(50);// Integer 안만들고 넣었음. 이건 오토박싱 즉 자동으로 랩퍼클래스로 해준 것
		          // 오토박싱: 기본자료형(int) => 래퍼클래스(Integer)로 자동으로 변경
		           // 오토 언박싱: 래퍼 클래스(Integer) => 기본자료형(int)로 자동으로 변경
		System.out.println(h2);
		
		
		h3.add(3.14);
		//h3.add(30);// 원래는 double d = (double)int a;가능했었는데 여기서는 안된다고 보면됨
		           // Integer 가 Double에 못들간다.
		h3.add(new Double(30));
		h3.add(new Double("40"));
		
		System.out.println(h3);
		
		System.out.println("=======================");
		
		int[] su = {100, 500, 600, 700};
		for(int i = 0; i<su.length; i++) {
			System.out.println(su[i]);
		}
		
		// 컬렉션은 iterator를 사용해서 차례대로 접근한다.
		
		Iterator<Double> it = h3.iterator();
		Iterator<Integer> it2 = h2.iterator();
		Iterator<String> it3 = h1.iterator();
		
		while (it3.hasNext()) {
			String msg = (String) it3.next();
			System.out.println(msg + "님");
		}
		}

	}


