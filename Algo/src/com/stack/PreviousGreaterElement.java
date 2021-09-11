package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {

	private static void prevGreater(int[]arr) {
	
		Deque<Integer> s = new ArrayDeque<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while(s.isEmpty()==false && s.peek()<arr[i]) {
				s.pop();
			}
			int res = s.isEmpty() ? -1:s.peek();
			System.out.println(res);
			s.push(arr[i]);
			}
	}
	
	public static void main(String[] args) {
		
		//int arr[] = {10,12,8,4,19,17,5};
		int arr[] = {5,4,7,2,1};

		prevGreater(arr);
		
	}
}
