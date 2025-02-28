package k_practice;

import java.util.Arrays;

public class MeanCalculator implements Calculator{
	
	public long calc(long[] arr){

	Arrays.sort(arr);
		if(arr.length % 2 == 0) {
			int idx = (arr.length / 2) -1;
			long mid = (arr[idx] + arr[idx+1])/2;
			return mid;
		}else {
			int idx = (arr.length / 2)+1;
			long mid = arr[idx];
			return mid;
		}
	}
}
