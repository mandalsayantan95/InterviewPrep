package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class _3Sum {
	
	static Set<List<Integer>> s = new HashSet<List<Integer>>();

    
	public void genPermutation(int[] nums,int []data,int index) {
		
		if (index==3) {
			if(sum(data)!=0) {
				//Arrays.sort(data);
				List<Integer> l = new ArrayList<Integer>();
				for (int i = 0; i < data.length; i++) {
					l.add(data[i]);
				}
				s.add(l);
			}
			return;
		} else {
			
			for (int i = index; i < nums.length-1; i++) {
				data[index] = nums[i];
				genPermutation(nums,data,index+1);
			}

		}
		
	}
	
	
	private int sum(int[] data) {
		
		int su=0;
		for (int i = 0; i < data.length; i++) {
			su = su + data[i];
		}
		return su;
	}


	public void threeSum(int[] nums) {
        
		int [] data = new int[3];
		genPermutation(nums,data,0);
        
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		_3Sum obj = new _3Sum();
		obj.threeSum(nums);
		for (List<Integer> sa : s) {
			System.out.println(Arrays.toString(sa.toArray()));
		}
		
	}
}
