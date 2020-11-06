package com.ex;

public class LongestPalindromSubstring {
	
	public static String getResult(String s){
		if(s == null || s.length() < 1) 
            return "";
        int start = 0, end = 0;
        int maxLen = 1;
        int n = s.length();
        
        // odd Length
        for(int i=0;i < n-1 ;i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }else
                    break;
            }
            int len = r - l - 1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
                end = r-1;
            }
        }
        // Even Length
        for(int i=0;i < n-1 ;i++){
            int l = i;
            int r = i+1;
            while(l >= 0 && r < n){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                }else
                    break;
            }
            int len = r - l - 1;
            if(len > maxLen){
                maxLen = len;
                start = l+1;
                end = r-1;
            }
        }
        return s.substring(start,end+1);  
	}

	public static void main(String[] args) {

		System.out.println(getResult("cbabd"));
		
	}

}
