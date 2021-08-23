package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3Sum {

	public List<List<Integer>> threeSum(int[] arr) {
    
		Arrays.sort(arr);
	
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		for (int i = 0; i < arr.length-2; i++) {
			int a = arr[i];
			int low = i+1;
			int high = arr.length-1;
			while (low<high) {
				if (arr[low]+arr[high] == -a) {
					//store the result
					List<Integer> al = new ArrayList<>();
					al.add(a);
					al.add(arr[low]);
					al.add(arr[high]);
					res.add(al);
					high--;
					low++;
				}
				else if(arr[low]+arr[high] > -a) {
					high--;
				} else {
					low++;
				}
			}
		}
		
		return new ArrayList<List<Integer>>(res);
		
    }
	
	public static void main(String[] args) {
		
		int[]nums = {-1,0,1,2,-1,-4};
		_3Sum obj = new _3Sum();
		System.out.println(obj.threeSum(nums));
		
	}

}
