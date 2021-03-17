package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeInterval {

	static class Range{
		int lb;
		int ub;
		Range(int lb,int ub){
			this.lb=lb;;
			this.ub=ub;
		}
		@Override
		public String toString() {
			return "Range [lb=" + lb + ", ub=" + ub + "]";
		}
		
	}
	
	static List<Range> mergeInterval(List<Range> Ranges){
	
		Stack<Range> res = new Stack<Range>();
		System.out.println(Ranges.toString());

		Collections.sort(Ranges, new Comparator<Range>() {

			@Override
			public int compare(Range o1, Range o2) {
				Integer c1 = o1.lb;
				Integer c2 = o2.lb;
				return c1.compareTo(c2);
			}
		});
		
		System.out.println(Ranges.toString());
		res.push(Ranges.get(0));
		//Boolean fp = false;
		for(int i=1;i<Ranges.size();i++) {
			int lbi = res.peek().lb;
			int ubi = res.peek().ub;
			if((lbi<=Ranges.get(i).lb && ubi >=Ranges.get(i).lb)) {
				if(ubi<Ranges.get(i).ub) {
						ubi = Ranges.get(i).ub;
						//fp=true;
				}
				res.pop();
				res.push(new Range(lbi, ubi));
			}
			else if(Ranges.get(i).ub<=ubi && lbi <=Ranges.get(i).lb) {
				continue;
			}
			else {
//				if(fp==false) {
//					res.pop();
//				}
				res.push(new Range(Ranges.get(i).lb,Ranges.get(i).ub));
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		List<Range> list = new ArrayList<Range>();
		list.add(new Range(0, 1));
		list.add(new Range(3, 6));
		list.add(new Range(2, 2));
		list.add(new Range(5, 9));
		list.add(new Range(6, 8));
		list.add(new Range(8,11));
		list.add(new Range(28,211));
		list.add(new Range(288,1211));

		
		System.out.println(mergeInterval(list).toString());
		
	}

}
