package com.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javafx.util.Pair;

class StockSpanner {

	Deque<Pair<Integer, Integer>> s;	
	int index;
	
    public StockSpanner() {
        s = new ArrayDeque<>();
    }
    
    public int next(int price) {
    	int span =1;
    	while (s.isEmpty()==false && price>=s.peek().getKey()) {
			span = span + s.pop().getValue();
		}
    	
    	//span = s.isEmpty() ? index+1 : index - s.peek().getValue();
    	
    	s.push(new Pair<Integer, Integer>(price,span));
    	return span;
        
    }
    
    public static void main(String[] args) {
    	
    	//Your StockSpanner object will be instantiated and called as such:
    	StockSpanner obj = new StockSpanner();
    	
    	System.out.println(obj.next(100));
    	System.out.println(obj.next(80));
    	System.out.println(obj.next(60));
    	System.out.println(obj.next(70));
    	System.out.println(obj.next(60));
    	System.out.println(obj.next(75));
    	System.out.println(obj.next(85));

    	
    	 
	}
}
