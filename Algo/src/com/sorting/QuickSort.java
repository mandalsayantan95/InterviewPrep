package com.sorting;

import java.util.Arrays;

public class QuickSort {
	
	
	private static int partition(int arr[],int l,int h) {

		int pivot = arr[l];
		int i = l;
		int j = h;
		
		
		while (i<j) {		
			do {
				i++;
			} while (arr[i]<=pivot);
			

			while (arr[j]>pivot) {
				j--;
			};
			
			if(i<j) {
				//swap i and j element
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//swap pivot with j
		
		arr[l] = arr[j];
		arr[j] = pivot;
		
		return j;
	}
	
	
	public static void sort(int[]arr,int l,int r) {
		
		if(l<r)
		{
			int j = partition(arr, l, r);
			sort(arr, l, j-1);
			sort(arr, j+1, r);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
