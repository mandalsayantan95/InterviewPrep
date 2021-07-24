package com.sorting;

import java.util.Arrays;

public class HeapSort {
	
	public static void delete(int [] arr,int n){
		
		int x,i,j;
		x = arr[n];
		arr[0]=arr[n];
		i=0;
		j=1;
		while(j<n) {
			if (arr[j]<arr[j+1]) {
				j=j+1;
			}
			if (arr[i]<arr[j]) {
				int temp= arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i=j;
				j=j*2;
			}
			else {
				break;
			}
		}
		
	}
	
	public static void insert(int A[],int n) {
		
		int temp;
		int i=n;
		temp = A[n];
		while(i>=1 && temp>A[i/2]) {
			A[i]=A[i/2];
			i=i/2;
		}
		A[i] = temp;
		
	}
	
	public static void heapify(int A[],int n,int i) {
		
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if (l<n && A[l]>A[largest]) {
			largest = l;
		}
		if (r<n && A[r]>A[largest]) {
			largest = r;
		}
		if(largest!=i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			heapify(A, n, largest);
		}
	}

	public static void main(String[] args) {

		int A[] = {10,20,30,25,5,40,35};
		
		for (int i = 1; i < A.length; i++) {
			insert(A,i);
			
		}
		System.out.println(Arrays.toString(A));
//		delete(A, A.length-1);
//		System.out.println(Arrays.toString(A));
		
		//heapify
		
		for (int i = A.length-1; i >=0; i--) {
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			heapify(A, i, 0);
		}
		
		System.out.println(Arrays.toString(A));
		
	}

}
