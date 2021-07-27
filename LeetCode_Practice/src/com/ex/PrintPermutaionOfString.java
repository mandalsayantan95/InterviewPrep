package com.ex;

public class PrintPermutaionOfString {
	
	private static void permute(String str) {

		
		
		for (int i = 0; i < str.length(); i++) {
			
			
			permute(str);
		}
		
	}
	
	

	public static void main(String[] args) {

		String str  = "abc";
		permute(str);
		
	}

}
