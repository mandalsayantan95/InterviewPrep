package com.ex;

public class LongestPalindromSubstring {
	
	public static String getResult(String str){
		if(str.length()==1)
			return str;
		String res="";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					int s = i;
					int e = j;
					while(s<=e) {
						if(str.charAt(s)!=str.charAt(e)) {
							break;
						}
						s++;
						e--;
						if(s>=e) {
							if(res.length()<(j+1-i)) {
								res = str.substring(i,j+1);
								if(j==(str.length()-1))
									return res;
							}
						}
					}
				} 
				
			}
		}
		return res;
		
	}

	public static void main(String[] args) {

		System.out.println(getResult("cbbd"));
		
	}

}
