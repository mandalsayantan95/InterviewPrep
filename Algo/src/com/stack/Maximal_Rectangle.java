package com.stack;

import java.util.Stack;

public class Maximal_Rectangle {
	
	private static int maximalRectangle(char[][] mat) {
		
		int [][] matrix	= new int[mat.length][mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			matrix[0][i] = mat[0][i] - 48 ;
		}
		int res = largestRectangleArea(matrix[0]);
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (mat[i][j] == '1') {
					matrix[i][j] = (Character.getNumericValue(mat[i][j]) + matrix[i-1][j]);
				}
			}
			res = Math.max(res, largestRectangleArea(matrix[i]));	
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		char [][]matrix = {{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'}};
		System.out.println(maximalRectangle(matrix));		
		
	}

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


}
