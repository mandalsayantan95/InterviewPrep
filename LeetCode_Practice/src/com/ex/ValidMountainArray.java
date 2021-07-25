package com.ex;

public class ValidMountainArray {

	public static boolean validMountArray(int[] arr) {
        
		if(arr.length<3) return false;
        int fp,sp;
        fp=0;
        sp=arr.length-1;
        int n = arr.length-1;
        while(fp<sp && --n>0) {
        	
        	if(arr[fp]<arr[fp+1]) {
        		fp++;
        	}
        	if (arr[sp-1]>arr[sp]) {
				sp--;
			}
        	if (arr[fp]==arr[fp+1]  ||  arr[sp]==arr[sp-1]) {
				return false;
			}
        }
        
        if(fp==sp) {
        	return true;
        }
        
        return false;
        
    }
	
	public static void main(String[] args) {
		 int [] arr = {2,0,2};
		 System.out.println(validMountArray(arr));
		 
	}
}
