package com.stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class LargestRectengularAreaHistogram {
	
	public static int largestRectangleArea(int[] arr) {
		
		int n = arr.length;
		int max = 0;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while(s.isEmpty()==false && arr[i] <=  arr[s.peek()]) {
				int temp = s.pop();
				int curr = arr[temp] * (s.isEmpty()? i :(i-(s.peek()+1)));
				max = Math.max(max, curr);
			}
			s.push(i);
		}
		
		while (s.isEmpty()!=true) {
			int temp = s.pop();
			int curr = arr[temp] * (s.isEmpty()? n:(n-(s.peek()+1)));
			max = Math.max(max,curr);
		}
		
		return max;		
    }

	public static void main(String[] args) {
		
		int [] arr = {9,0};
		System.out.println(largestRectangleArea(arr));

	}

}
