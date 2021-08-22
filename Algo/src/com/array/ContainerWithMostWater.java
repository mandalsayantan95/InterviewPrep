package com.array;

public class ContainerWithMostWater {
	
	public int maxArea(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		
		int max = 0;
		while (i<j) {
			//calculate maxWater and the increment i or j based on condition
			int temp = Math.min(arr[i],arr[j]) * (j-i);
			if(temp>max) {
				max = temp;
			}
			if(arr[i]<arr[j]) {
				i++;
			} else {
				j--;
			}
		}

		return max;
	}
	
	

	public static void main(String[] args) {
	
		int[]height = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(new ContainerWithMostWater().maxArea(height));
		

	}

}
