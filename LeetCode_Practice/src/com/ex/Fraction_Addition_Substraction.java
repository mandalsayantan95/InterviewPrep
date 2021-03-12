package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fraction_Addition_Substraction{ 
	// Function to return gcd of a and b 
	
	 public static String fractionAddition(String expression) {
	       
		 	List<Character> ch = new ArrayList<Character>();
		 	for(int i=0;i<expression.length();i++) {
		 		if(expression.charAt(i)=='+' || expression.charAt(i)=='-'){
		 			ch.add(expression.charAt(i));
		 		}
		 	}
		 	boolean flag = false;
		 	if(expression.charAt(0) == '-') {
		 		String[] temp = expression.split("-", 2);
		 		expression = temp[1];	
		 		flag = true;;
		 	}
		 	
		 	List<Integer> num = new ArrayList<Integer>();
		 	List<Integer> denum = new ArrayList<Integer>();

	        for(String s : expression.split("\\+")) {
	        	for (String ss : s.split("\\-")) {
					System.out.println(ss);
					String frac[] = ss.split("/");
					num.add(Integer.parseInt(frac[0]));
					denum.add(Integer.parseInt(frac[1]));
				}
	        }
	        
	        if(flag) {
	        	num.add(0, -num.get(0));
	        	num.remove(1);
	        	ch.remove(0);
	        }
	        
	        for(int i =0;i<ch.size()-1;i++) {
	        	if(ch.get(i)=='-') {
	        		num.add(i+1, -num.get(i+1));
	        		num.remove(i+2);
	        	}
	        }
	        
//	        System.out.println(num.toString());
//	        System.out.println(denum.toString());
	        
	        addFraction(num,denum);
	        
	        return null;
	        
	    }
	 
	static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b%a, a); 
	} 

	 
	 static int findgcd(List<Integer> arr, int n)
	    {
	        int result = 0;
	        for (Integer element: arr){
	            result = gcd(result, Math.abs(element));
	 
	            if(result == 1)
	            {
	               return 1;
	            }
	        }
	 
	        return result;
	    }
	// Function to convert the obtained fraction 
	// into it's simplest form 
	static void lowest(int den3, int num3) 
	{ 
		// Finding gcd of both terms 
		int common_factor = Math.abs(gcd(num3,den3)); 

		// Converting both terms into simpler 
		// terms by dividing them by common factor 
		den3 = den3/common_factor; 
		num3 = num3/common_factor; 
		System.out.println(num3+"/"+den3); 
	} 

	//Function to add two fractions 
	static void addFraction(List<Integer> num,List<Integer> denum) 
	{ 
		// Finding gcd of den1 and den2 
		int den3 = findgcd(denum,denum.size()); 

		// Denominator of final fraction obtained 
		// finding LCM of den1 and den2 
		// LCM * GCD = a * b 
		int mul = denum.stream().reduce(1, (a, b) -> a * b);
		den3 = mul / den3; 

		// Changing the fractions to have same denominator 
		// Numerator of the final fraction obtained 
		
		int num3 = 0;
		for(int i=0;i<num.size();i++) {
			num3 = num3+ (num.get(i))*(den3/denum.get(i));
		}

		// Calling function to convert final fraction 
		// into it's simplest form 
		lowest(den3,num3); 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
		//int num1=1, den1=500, num2=2, den2=1500; 
		//System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to "); 
		//addFraction(num1, den1, num2, den2);
		String s = "1/3-1/2";
		System.out.println(fractionAddition(s));
		
	} 
	} 
	// This code is contributed by mits 
