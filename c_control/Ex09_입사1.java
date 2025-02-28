package c_control;

public class Ex09_입사1 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 10000 ; i++) {
			int num = i;
			while(num != 0) {
				int na = num % 10;
				if(na == 8) {
					count += 1;

				}
				num = num / 10;
			}
		}
		System.out.println(count);
		
	

	}

}
