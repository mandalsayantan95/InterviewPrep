package com.ex;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Stack;

public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		   ListNode curr = l1;
	        
		   String num1 = "";
	       while(curr.next != null){
	    	   	num1 =  curr.val + num1;
	            curr = curr.next;
	        }
	       	num1 = curr.val + num1;
	        
	        ListNode currn = l2;
	       	String num2 ="";		   
		    while(currn.next != null){
		    	num2 = currn.val + num2;
		        currn = currn.next;
		    }
	    	num2 = currn.val + num2;

	        
		    BigDecimal d = new BigDecimal(num1);
		    BigDecimal d1 = new BigDecimal(num2);

		    BigDecimal res = d.add(d1); 
		    
		    String s = res.toString();
	        int n = s.length();
    		ListNode li1 = new ListNode(Character. getNumericValue((s.charAt(n-1))));
    		ListNode curr_n = li1; 
 	        while((n-2)>=0) {
 	    		ListNode newnode = new ListNode((int) (Character. getNumericValue(s.charAt(n-2))));
 	    		n=n-1;
 	    		curr_n.next = newnode;
 	    		curr_n = curr_n.next;
	        }
 	        return li1;
        
    }
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(0);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(0);
		ListNode l5 = new ListNode(0);
		ListNode l6 = new ListNode(0);
		ListNode l7 = new ListNode(0);
		ListNode l8 = new ListNode(0);
		ListNode l9 = new ListNode(0);
		ListNode l10 = new ListNode(0);
		ListNode l11 = new ListNode(0);
		ListNode l12 = new ListNode(0);
		ListNode l13 = new ListNode(0);
		ListNode l14 = new ListNode(0);
		ListNode l15 = new ListNode(0);
		ListNode l16 = new ListNode(0);
		ListNode l17 = new ListNode(0);
		ListNode l18 = new ListNode(0);
		ListNode l19 = new ListNode(0);
		ListNode l20 = new ListNode(0);
		ListNode l21 = new ListNode(0);
		ListNode l22 = new ListNode(0);
		ListNode l23 = new ListNode(0);
		ListNode l24 = new ListNode(0);
		ListNode l25 = new ListNode(0);
		ListNode l26 = new ListNode(0);
		ListNode l27 = new ListNode(0);
		ListNode l28 = new ListNode(0);
		ListNode l29 = new ListNode(0);
		ListNode l30 = new ListNode(0);
		ListNode l31 = new ListNode(1);


		l1.next = l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
		l8.next=l9;
		l9.next=l10;
		l10.next=l11;
		l11.next=l12;
		l12.next=l13;
		l13.next=l14;
		l14.next=l15;
		l15.next=l16;
		l16.next=l17;
		l17.next=l18;
		l18.next=l19;
		l19.next=l20;
		l20.next=l21;
		l21.next=l22;
		l22.next=l23;
		l23.next=l24;
		l24.next=l25;
		l25.next=l26;
		l26.next=l27;
		l27.next=l28;
		l28.next=l29;
		l29.next=l30;
		l30.next=l31;
	

			
		ListNode l32 = new ListNode(5);
		ListNode l33 = new ListNode(6);
		ListNode l34 = new ListNode(4);
		
		l32.next = l33;
		l33.next=l34;	
		
		ListNode res = addTwoNumbers(l1, l32);
		ListNode curr = res;
		while(curr.next!=null) {
			System.out.print(curr.val);
			curr = curr.next;
		}
		System.out.print(curr.val);

		
		//System.out.println(addTwoNumbers(l1, l4));
		//System.err.println(addTwoNumbers(l1,l4));
		
	}

}
