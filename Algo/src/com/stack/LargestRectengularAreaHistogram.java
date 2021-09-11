package com.stack;

public class LargestRectengularAreaHistogram {
	
	public static int largestRectangleArea(int[] arr) {
		
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int j,k = 0;
			for (j = i-1; j >= 0; j--) {
				if(arr[j]<arr[i]) {
					break;
				}
			}
			
			for (k = i+1; k < arr.length; k++) {
				if(arr[k]<arr[i]) {
					break;
				}
			}
			
			j=j+1;
			k=k-1;
			int temp = arr[i] * (k-j+1);
			
			int t = Math.max(temp, max);
			
			res = (t>res) ? t : res;
			
		}
		
		return res;
    }

	public static void main(String[] args) {
		
		int [] arr = {2,3};
		System.out.println(largestRectangleArea(arr));

	}

}
