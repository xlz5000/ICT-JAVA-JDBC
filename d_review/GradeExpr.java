package d_review;

public class GradeExpr {
	
	int[] jumsu;
	
	//GradeExpr(){}
	
	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	double getAverage() {
		
		//자바는 int/int 시 int 값임
		double average = (double)(getTotal()) / jumsu.length;
		return average;
		
	}
	
	int getTotal() {
		int total = 0;
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	
	int getGoodScore() {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < jumsu.length; i++) {
			if(max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	
	}
	
	int getBadScore() {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < jumsu.length; i++) {
			if(min > jumsu[i]) {
				min = jumsu[i];
			}
		}
		return min;
		
	}

}
