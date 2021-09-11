package com.others;

public class SqrtOfNumber {

	public int mySqrt(int x) throws ArithmeticException {
		
		if (x == 0)
	        return 0;
        int l = 0;
        int h = x-1;
        
        while(true) {
        	
        	int mid = l + (h-l)/2;
        	
        	if (mid>x/mid) {
        		h = mid-1;
			}
        	else {
				if ( mid+1 > x/(mid+1)) {
					return mid;
				}
				l = mid+1;
			}    	
        }    
    }

	public static void main(String[] args) {
		int x = 9;
		SqrtOfNumber obj = new SqrtOfNumber();
		System.out.println(obj.mySqrt(x));
	}

}
