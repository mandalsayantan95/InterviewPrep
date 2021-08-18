package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfNumbers {
	
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> permute(int[] arr) {
	        
		Integer[] nums = new Integer[arr.length];
		int i = 0;
		for (int value : arr) {
			nums[i++] = Integer.valueOf(value);
		}
		backtrack(nums,0);
		return res;
	 
	}
	
	private void backtrack(Integer[] nums, int index) {
		
		if(index == nums.length) {
			res.add(new ArrayList<>(Arrays.asList(nums)));
			return;
		}
		
		for (int i = index; i < nums.length; i++) {
			swap(nums,i,index);
			backtrack(nums, index+1);
			swap(nums,i,index);
		}
		
		
	}

	private void swap(Integer[] nums, int i, int index) {

		int temp = nums[i];
		nums[i] = nums[index];
		nums[index] = temp;
		
	}

	public static void main(String[] args) {
		
		int [] arr = new int[]{1,2,3};
		PermutationsOfNumbers obj = new PermutationsOfNumbers();
		System.out.println(obj.permute(arr));
		
	}

}
