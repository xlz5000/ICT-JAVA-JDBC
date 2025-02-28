package a_temp;

public class Temp {

	public static void main(String[] args) {
		int[] result = method();
		//처리(출력)
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}

	}
	
	static int[] method() {
		int a = 10;
		int b  = 20;
		int c = 30;
		int[] data = {a, b, c};
		return data;
	}

}
