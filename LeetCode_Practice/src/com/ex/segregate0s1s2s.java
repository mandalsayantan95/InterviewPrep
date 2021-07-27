package com.ex;

import java.util.Arrays;

public class segregate0s1s2s {

	    public static void swap(int[]nums,int i,int j){
	        int temp = nums[j];
	        nums[j] = nums[i];
	        nums[i] = temp;
	    }
	    
	    public static void sortColors(int[] nums) {
	        
	        int m = 0;
	        int l = 0;
	        int r = nums.length-1;
	        
	        while(m<=r){
	            if(nums[m]==0){
	                //swap l with m
	                swap(nums,l,m);
	                l++;
	                m++;
	            }
	            else if(nums[m]==1){
	                m++;
	            }
	            else if(nums[m]==2){
	                //swap r with m
	                swap(nums,r,m);
	                r--;
	            }    
	        }   
	    }
	    
	    public static void main(String[] args) {
			
	    	int arr[] = {0,1,2,0,1,2};
	    	sortColors(arr);
	    	System.out.println(Arrays.toString(arr));
	    	
		}
}

