package com.ex;

import java.util.Arrays;

public class PrintPermutaionOfString {
	
	private static void permute(int[] arr,int index) {
		
		if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
	        //System.out.println(Arrays.toString(arr));
	        //Print the array
	        System.out.println(Arrays.toString(arr));
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	        System.out.println("i:"+i+"index"+index);
	        
	        //Recurse on the sub array arr[index+1...end]
	        permute(arr, index+1);

	        //Swap the elements back
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
		
	}
	

	public static void main(String[] args) {

		int [] arr = {1,2,3,4};
		int [] data = new int[4];
		permute(arr,0);
		
	}

}
