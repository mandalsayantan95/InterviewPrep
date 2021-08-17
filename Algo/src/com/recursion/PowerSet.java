package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PowerSet {
	
	List<List<Integer>> res =  new ArrayList<List<Integer>>();
	
	public void backtrack(int[]nums,int i,List<Integer> curr) {
        
		if(i==nums.length) {
			res.add(new ArrayList<>(curr));
			return;
		}
		
		curr.add(nums[i]);
		backtrack(nums, i+1,curr );
		curr.remove(new Integer(nums[i]));
		backtrack(nums, i+1,curr);
    }

	
    public List<List<Integer>> subsets(int[] nums) {
    	List<Integer> curr = new ArrayList<Integer>();
    	backtrack(nums,0,curr);
    	Collections.sort(res, new Comparator<List<Integer>>() {

			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				
				for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
				      int c = o1.get(i).compareTo(o2.get(i));
				      if (c != 0) {
				        return c;
				      }
				    }
				    return Integer.compare(o1.size(), o2.size());
			}
    		
    		
		});
    	return res;     
    }
	
	
	public static void main(String[] args) {
		
		/*
		 * Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
		 */
		//String str = "abc";
		//String curr = "";
		//List<Integer> curr = new ArrayList<Integer>();
		int nums[] = {1,2,3};
		System.out.println(new PowerSet().subsets(nums));
		
	
	}

}
