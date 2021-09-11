package com.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

public class MergeIntervals {

	public int[][] merge(int[][] arr) {
	
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return ((Integer) o1[0]).compareTo(o2[0]);
			}
		});

		Stack<int[]> s = new Stack<int[]>();
		
		for (int[]a : arr) {
			if (s.isEmpty()) {
				s.add(a);
			}
			else {
				int[] temp = s.peek();
				if (a[0]>=temp[0] && a[0]<=temp[1]) {
					if(a[1]>temp[1]) {
						temp[1] = a[1];
					}
					s.pop();
					s.push(temp);
				}
				else {
					s.push(a);
				}
			}
		}

		int[][] res = new int[s.size()][2];
		
		return  s.toArray(res);
	}
	
	public static void main(String[] args) {
		
		//int arr[][] =  {{1,3},{2,6},{8,10},{15,18}};
		int arr[][] =  {{1,4},{4,5}};
		MergeIntervals obj = new MergeIntervals();
		
		int res[][] = obj.merge(arr);
		
		for (int[] is : res) {
			System.out.println(Arrays.toString(is));
		}

	}

}
