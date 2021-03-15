package com.ex;

public class CountPalindromSubString {

	static int count = 0;
	
	
	static boolean checkPalindrome(String str){
		
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			 if(str.charAt(i)!=str.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		return true;
	}

	
	public static void main(String[] args) {
		String str = "abbaeae";		
		
		int count =0;
		for(int i=0;i<str.length()-1;i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(checkPalindrome(str.substring(i, j+1))) {
					System.out.println(str.substring(i, j+1));
					count = count + 1;
				}
			}
		}
		
		System.out.println(count);
	}
}
