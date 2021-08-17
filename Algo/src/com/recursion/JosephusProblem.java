package com.recursion;

public class JosephusProblem {
	
	public static void main(String[] args) {
		
		int  n = 5;
		int k = 4;
		System.out.println(findResult(n,k));
		
		
	}

	private static int findResult(int n, int k) {

		if (n==1) {
			return 1;
		}
		return (findResult(n-1,k) +k-1)%n +1;
		
	}
}
