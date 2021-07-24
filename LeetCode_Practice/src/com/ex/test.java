package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
	
	static String getVal(String s) {
		return s;	
	}
	
	static String getVal(Object s) {
		return (String) "abv";	
	}
	
	public static void main(String[] args) {
		//main(null);
		System.out.println(getVal("asgds"));
		List l = new ArrayList<>();
		l.add("str");
		l.add(2);
		
		System.out.println(l);
		
		String str = "adssad";
		
		//System.out.println(str.subSequence(5, 2));
		
		
		
		String [] arr = {"abc","2","10","12322430","1","3","19112"};
		List<String> ls = Arrays.asList(arr);
		Collections.sort(ls);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
