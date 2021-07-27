package com.ex;

import java.util.Arrays;

public class Segregate0_1 {
	
	public static void sort(int [] arr){
	
		int s = 0;
		int e = arr.length-1;
		
		while(s<e) {

			if(arr[s] == 0) {
				s++;
			}
			if(arr[s] == 1) {
				//swap
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				e--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {0,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,1,0,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
