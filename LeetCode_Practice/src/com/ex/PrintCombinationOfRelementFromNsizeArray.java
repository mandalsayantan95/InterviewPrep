package com.ex;

public class PrintCombinationOfRelementFromNsizeArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,0,1,2,-1,-4};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);

	}

	private static void printCombination(int[] arr, int n, int r) {
		// TODO Auto-generated method stub
		 int data[]=new int[r];
		 
	     combinationUtil(arr, data, 0, n-1, 0, r);
		
	}

	private static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
		
		  if (index == r)
	        {
			  if(sum(data)==0) {
		            for (int j=0; j<r; j++)
		                System.out.print(data[j]+" ");
		            System.out.println("");
	            }
	            return;
	        }
		  for (int i=start; i<=end && end-i+1 >= r-index; i++)
	        {
	            data[index] = arr[i];
	            combinationUtil(arr, data, i+1, end, index+1, r);
	        }
	}

	private static int sum(int[] data) {
		
		int su=0;
		for (int i = 0; i < data.length; i++) {
			su = su + data[i];
		}
		return su;
	}

}
