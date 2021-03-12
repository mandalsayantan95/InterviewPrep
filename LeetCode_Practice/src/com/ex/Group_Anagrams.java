package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
	
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        
		 
	        HashMap<String, List<String>> hm = new HashMap<>();
	        
	        for(int i = 0;i<strs.length;i++) {
	        	String s = strs[i];
	        	char arr[] = s.toCharArray();
	        	Arrays.sort(arr);
	        	String key = String.valueOf(arr);
	        	if(!hm.containsKey(key)) {
	    		 	List<String> al = new ArrayList<String>();
	    		 	al.add(s);
	        		hm.put(key,al);
	        	} else {
	        		hm.get(key).add(s);
	        	}
	        }
		 	List<List<String>> alist = new ArrayList<List<String>>();

	        for(Map.Entry<String, ArrayList<String>> m : hm.entrySet()) {
	        	alist.add(m.getValue());
	        }
	        
			return alist;   
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));

	}

}
