package com.binarySearch;

public class Search_an_element_in_sorted_and_rotated_array {

	public int search(int[] nums, int target) {
		
		int l = 0;
		int r = nums.length-1;
		
		while(l<=r) {
			
			int mid = l + (r-l)/2;
			
			if (nums[mid] == target) {
				return mid;
			}
			
			if (nums[l]<nums[mid]) {
				if (nums[l]<=target && nums[mid]>target) {
					r = mid-1;
				}
				else {
					l = mid+1;
				}
			}
			else{
				if (nums[l]<=target && nums[r]>target) {
					l = mid+1;
				}
				else {
					r = mid-1;
				}
			}		
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[]nums = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(new Search_an_element_in_sorted_and_rotated_array().search(nums, target));		
	}

}
