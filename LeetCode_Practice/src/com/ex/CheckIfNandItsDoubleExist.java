package com.ex;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
	
	public static boolean checkIfExist(int[] arr) {
        
		HashSet<Integer> hs = new HashSet< Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				count++;
			}else {
				hs.add(2*arr[i]);
			}
		}
		
		if(count>1)
			return true;
		
		for (int i = 0; i < arr.length; i++) {
			if(hs.contains(arr[i]))
				return true;
		}
		
        return false;
    }
	
	

	public static void main(String[] args) {
		int [] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr));
	}

}
