package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test14 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("차두리", "손흥민", "이강인", "김민제", "박지성", "손흥민"));
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
	}

}
