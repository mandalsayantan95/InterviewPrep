package com.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/*In Bakery department: From 8 to 10 

In Checkout department: From 10 to 12 

In Diary department: From 14 to 19 

His shift timings in this case are 8 to 12 and 14 to 19*/

class Pair<T , U>{
	T start;
	U end;
	Pair(T start,U end){
		this.start = start;
		this.end = end;
	}
	public T getStart() {
		return start;
	}
	public U getEnd() {
		return end;
	}
	
}

public class MergeIntervals {
	
	public static List<Pair<Integer,Integer>>  mergeInterval(List<Pair<Integer,Integer>> al){
	
		Collections.sort(al, (a,b) -> a.start-b.start );
		
		//sorted list with start time
		
		Stack<Pair<Integer,Integer>> st = new Stack<>();
		
		for(int i=0;i<al.size();i++) {
			Pair<Integer,Integer> temp = al.get(i);
			if(!st.isEmpty()) {
				Pair<Integer,Integer> top = st.peek();
				//compare top with curr element
				if(top.end >= temp.start) {
					int tempend = Math.max(temp.end ,top.end );
					st.pop();
					st.push(new Pair<>(top.start, tempend));
				}else {
					st.push(temp);
				}
				
			}else {
				st.push(temp);
			}
		}
		return new ArrayList<>(st);
		
	}
	
	public static void main(String[] args) {
		
		List<Pair<Integer,Integer>> test = new ArrayList<>();
		test.add(new Pair<>(9, 12));
		test.add(new Pair<>(9, 12));
		test.add(new Pair<>(13, 15));
		test.add(new Pair<>(16, 19));
		
		List<Pair<Integer,Integer>> res = mergeInterval(test);
		
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i).getStart() + " "+  res.get(i).getEnd());
		}
		
	}

}
