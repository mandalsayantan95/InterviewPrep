package com.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapOfAL {

	public static void main(String[] args) {

		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(452);
		a2.add(120);
		
		hm.put(1, a1);
		hm.put(2, a2);
		
		Set<Entry<Integer, List<Integer>>> s = new HashSet<>(hm.entrySet());
		for(Entry<Integer, List<Integer>> entry : s)
			{ 
				System.out.println(entry.getKey() + " ==> " + entry.getValue()); 
			
			} 
		
	}

}
