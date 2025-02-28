package k_practice;

public class CallcFactory {

	private int strategy;
	
	Strategy s = new Strategy();
	
	
	public  CallcFactory() {
	}
	
	public CallcFactory(int num) {
		this.strategy = strategy;
	}



	
	public Calculator getCalculator(int strategy) {
		if(strategy == s.MEAN) {
			Calculator c = new MeanCalculator();
			return c;
		}
		else if(strategy == s.DISTRIBUTION) {
			Calculator c2 = new DistributeCalculator();
			return c2;
		}
		return null;
	}
 

}
