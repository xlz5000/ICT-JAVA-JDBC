package b_practice;

public class Solution {

	
	private int n;
	private int[] votes;
	
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public int[] getVotes() {
		return votes;
	}


	public void setVotes(int[] votes) {
		this.votes = votes;
	}


	public int[] vote() {
		int[] candid = new int[n];
		for(int i =0 ; i < votes.length; i++) {
			
			candid[votes[i] - 1]++;
		}
		
		
		int max = Integer.MIN_VALUE;
		for(int i =0 ; i < candid.length; i++) {
			
			if(max < candid[i]) {
				max = candid[i];
			}
		}
		int count = 0;
		for(int i =0 ; i < candid.length; i++) {
			
			if(candid[i]==max) {
				count += 1;
			}
		}
		
		int[] result = new int[count];
		int k = 0;
		for(int i =0 ; i < candid.length; i++) {
			
			if(candid[i]==max) {
				result[k++] = i + 1;
			}
		}
		
		return result;
		
		
		
//		for(int i = candid.length -1; i >=0 ; i--) {
//			for(int j = 0; j < i; j++) {
//				if(candid[j]>candid[j+1]) {
//					int temp = candid[j];
//					candid[j] = candid[j+1];
//					candid[j+1] = temp;
//				}
//			}//안쪽 for
//				
//		}//바깥 for
//		
//		int max = candid[n-1];
		
	}

}
