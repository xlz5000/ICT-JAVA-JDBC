package k_practice;

public class DistributeCalculator implements Calculator{
	
	public long calc(long[] arr) {
		int total = 0;

		for(int i = 0; i<arr.length; i++){
			total += arr[i];
		}
		int mean = total / arr.length;
		
		int subtract = 0;
		for(int i = 0; i<arr.length; i++){
			subtract += (arr[i] - mean)*(arr[i] - mean);
		}
		
		return subtract;
		
	}
}
