package com.ex;

public class CountWaysToReachNthStair {

	static int count = 0;

	public static void  countWays(int arr[],int data[],int start,int sum,int n) {
		if(sum == n) {
			count = count +1;
			//System.out.println(count);
			return ;
		}
		if(sum>n) return ;
		for(int i=0;i<2;i++) {
			data[start] = arr[i];
			countWays(arr,data,start+1,sum+arr[i],n);
		}	
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2};
		int n = 2;
		int data[] = new int[n+2];
		countWays(arr,data,0,0,n);
		System.out.println(count);
	}
}
