package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3Sum {

	public List<List<Integer>> threeSum(int[] arr) {
    
		Arrays.sort(arr);
	
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length-2; i++) {
			if (i == 0 || (i > 0 && arr[i] != arr[i-1])) {
				int a = arr[i];
				int low = i+1;
				int high = arr.length-1;
				while (low<high) {
					if (arr[low]+arr[high] == -a) {
						//store the result
						res.add(Arrays.asList(a,arr[low],arr[high]));
						while (low < high && arr[low] == arr[low+1]) low++;
						while (low < high && arr[high] == arr[high-1]) high--;
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
		}
		
		return res;
		
    }
	
	public static void main(String[] args) {
		
		int[]nums = {-1,0,1,2,-1,-4};
		_3Sum obj = new _3Sum();
		System.out.println(obj.threeSum(nums));
		
	}

}
