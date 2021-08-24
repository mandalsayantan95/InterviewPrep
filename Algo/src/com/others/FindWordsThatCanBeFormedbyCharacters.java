package com.others;

import java.util.Arrays;

public class FindWordsThatCanBeFormedbyCharacters {
	
	public int countCharacters(String[] words, String chars) {
        
		int res = 0;
		int [] count = new int[256];
		for (int i = 0; i < chars.length(); i++) {
			count[chars.charAt(i)] = count[chars.charAt(i)] + 1;
		}
			
		for (int i = 0; i < words.length; i++) {
			int newarr[] = count.clone();
			String temp = words[i];
			int j;
			for (j = 0; j < temp.length(); j++) {
				if(newarr[temp.charAt(j)] <= 0) {
					//count[temp.charAt(j)] = count[temp.charAt(j)] - 1;
					break;
				}
				if(newarr[temp.charAt(j)] > 0) {
					newarr[temp.charAt(j)] = newarr[temp.charAt(j)] - 1;
				}
			}
			if (j==temp.length()) {
				res = res + temp.length();
			}
		}
		
        return res;
        
    }
	
	

	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		FindWordsThatCanBeFormedbyCharacters obj =  new FindWordsThatCanBeFormedbyCharacters();
		System.out.println(obj.countCharacters(words, chars));
	}

}
