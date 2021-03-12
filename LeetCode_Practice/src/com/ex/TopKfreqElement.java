package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKfreqElement {
	

	public static int[] topKFrequent(int[] nums, int k) {
        
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        List<Integer> l = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                Integer c = hm.get(nums[i]);
                hm.put(nums[i],++c);
            }
        }
        
        //build heap 
                
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
        	s.add(nums[i]);
        }
        
        int arr[] = new int[s.size()];
        int j = 0; 
        for (Integer x : s) 
            arr[j++] = x;
        
        System.out.println(Arrays.toString(arr));
        
        for(int i=arr.length/2;i>=0;i--) {
        	heapify(arr, arr.length, i);
        }
        
        System.out.println(Arrays.toString(arr));
              
        for(int i = s.size()-1; i>=0;i--) {
        	int temp = arr[0];
        	arr[0] = arr[i];
        	arr[i] = temp;
        	heapify(arr, i, 0);
        }
        
        System.out.println(Arrays.toString(arr));

        
        int temp[] = new int[k];
        int m =0;
        int p = arr.length-1;
        while(m<k) {
        	temp[m] = arr [p];
        	p--;
        	m++;
        }
        
        hm = null;
        
        return temp;
            
    }
	
	public static void heapify(int arr[],int n,int i,Map<Integer,Integer> hm) {
		
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(n>l && hm.get(arr[l])>hm.get(arr[largest]))
			largest = l;
		if(n>r && hm.get(arr[r])>hm.get(arr[largest]))
			largest = r;
		if(largest!=i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest,hm);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1};
		System.out.println(Arrays.toString(topKFrequent(arr,1)));
		
	}
}
