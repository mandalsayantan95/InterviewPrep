package com.array;

public class countPrime {

	public int countPrimes(int n) {
        int count = 0;
        boolean[]arr = new boolean[n];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<n;i++){
            if(arr[i]==false){
            	count++;
                for(int j=2;i*j<n;j++){
                    arr[i*j] = true;
                }
            }
        }

        return count;
        
    }
	
	public static void main(String[] args) {

		int n = 10;
		countPrime obj = new countPrime();
		System.out.println(obj.countPrimes(n));
	}

}
