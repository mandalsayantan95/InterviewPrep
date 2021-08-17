package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfEven {
	
	private int findSum(List<Integer> list) {

		int sum = 0;
	
		List<Integer> s;
		
		s = list.stream().filter(i->(i/2==0)).collect(Collectors.toList());
		
		sum = s.stream().
		
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(findSum(list));		
		
	}

}
