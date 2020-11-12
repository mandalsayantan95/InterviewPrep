package com.ex;

import java.util.*;

public class LongestSubstingWithoutRepeatingCharacters {
	
	public static String getString(String s) {
		
		int n = s.length();
		ArrayList<Set<Object>> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Set<Object> set = new HashSet<>();
			for(int j=i;j<n;j++) {
				if(!set.contains(s.charAt(j))) {
					set.add(s.charAt(j));
				} else {
					break;
				} 
			}
			al.add(set);	
		}
		
		int max = 0;
		int maxIndex = 0;
		for(int i=0;i<al.size();i++) {
		
			if(al.get(i).size()>max) {
				max = al.get(i).size();
				maxIndex = i;
			}
		}
		
		Set<Object> sf = al.get(maxIndex);	
		
		String res = "";
		
		for(Object c : sf) {
			res = res + c.toString();
		}
	
		return res;
	}

	public static void main(String[] args) {

		String s = "pwwkew";
		System.out.println(getString(s));
	}

}
