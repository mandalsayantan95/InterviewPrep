package com.array;

public class TrapingRainwater {
	
	public int trap(int[] arr) {
        
        int n = arr.length;
        int [] leftmax = new int[n];
        int [] rightmax = new int[n];
        
        int max = arr[0];
        for(int i=1;i<n;i++){
        	if (arr[i]>max) {
        		max = arr[i];
			}
        	rightmax[i] = max;
        }
        
        max = arr[n-1];
        for(int i=n-2;i>=0;i--){
        	if (arr[i]>max) {
        		max = arr[i];
			}
        	leftmax[i] = max;
        }
        
        int maxwater = 0; 
        for (int i = 1; i < n-1; i++) {
			maxwater  = maxwater + (Math.min(leftmax[i], rightmax[i]) - arr[i]);
		}
        return maxwater;
    
}

	public static void main(String[] args) {
		int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(new TrapingRainwater().trap(arr));
	}

}
