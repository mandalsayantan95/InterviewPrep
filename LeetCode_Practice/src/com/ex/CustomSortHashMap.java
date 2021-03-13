package com.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CustomSortHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> codenames = new HashMap<String, Integer>(); 
		codenames.put("AJDK 1.1.4", 10); 
		codenames.put("DJ2SE 1.4", 4); 
		codenames.put("Java SE 7", 60); 
		codenames.put("BJ2SE 1.2", 2); 
		codenames.put("CJ2SE 1.3", 31); 
		codenames.put("EJ2SE 5.0", 5); 
		codenames.put("Java SE 6", 5); 
		System.out.println("HashMap before sorting, random order "); 
		//Set<Entry<String, Integer>> entries = codenames.entrySet(); 
//		for(Entry<String, Integer> entry : entries)
//		{ 
//			System.out.println(entry.getKey() + " ==> " + entry.getValue()); 
//		
//		} 
		// Now let's sort HashMap by keys first 
		// all you need to do is create a TreeMap with mappings of HashMap 
		// TreeMap keeps all entries in sorted order 
		//TreeMap<String, Integer> sorted = new TreeMap<>(codenames); 
		//Set<Entry<String, Integer>> mappings = sorted.entrySet(); 
//		System.out.println("HashMap after sorting by keys in ascending order "); 
//		for(Entry<String, Integer> mapping : entries)
//		{ 
//			System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
//		} 
		// Now let's sort the HashMap by values 
		// there is no direct way to sort HashMap by values but you 
		// can do this by writing your own comparator, which takes 
		// Map.Entry object and arrange them in order increasing 
		// or decreasing by values. 
		Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() 
		{ 
			@Override public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) 
			{ 
				//Integer v1 = e1.getValue(); Integer v2 = e2.getValue(); 
				int num = e2.getValue().compareTo(e1.getValue());
				if(num==0) {
					return e1.getKey().compareTo(e2.getKey());
				}
				return num;
				//return v1.compareTo(v2); 
			} 
		}; 
		// Sort method needs a List, so let's first convert Set to List in Java 
		List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(codenames.entrySet()); 
		// sorting HashMap by values using comparator 
		Collections.sort(listOfEntries, valueComparator); 
		
		for(Entry<String, Integer> e : listOfEntries) {
			System.out.println(e.getKey()+"-->>"+e.getValue());
		}
		
//		LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size()); 
//		// copying entries from List to Map 
//		for(Entry<String, Integer> entry : listOfEntries)
//		{ 
//			sortedByValue.put(entry.getKey(), entry.getValue()); 
//		} 
//		System.out.println("HashMap after sorting entries by values "); 
//		Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet(); 
//		for(Entry<String, Integer> mapping : entrySetSortedByValue)
//		{ 
//			System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
//		}
	}

}
