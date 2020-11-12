package com.ex;

public class revDigit {
	
	public static int getRev(int x) {
		
		boolean neg = false;
		
		if(x<0) {
			x = Math.abs(x);
			neg = true;
		}
		
		if(x == Integer.MIN_VALUE) {
			x = Integer.MAX_VALUE-1;
		}
		
		String str = "";
		while(x>=1) {
			str = str + (x%10);
			x=x/10;
		}	
		
		
		Double res;
		if(neg==true) {
			res = -Double.parseDouble(str);
		} else {
		res = Double.parseDouble(str);
		}
		
		if(( res< -Math.pow(2, 31)) || (res > (Math.pow(2, 31))-1)) return 0;
		
		
		return res.intValue();

	}
	
	public static void main(String[] args) {
		
		System.out.println(getRev(-2147483648));
	}

}
