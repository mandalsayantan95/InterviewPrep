package com.ex;

public class DeadLock_Demo {

	public static void main(String[] args) {
		
			sharedResource s1 = new sharedResource();
			sharedResource s2 = new sharedResource();
			
		
			Runnable t1 = () -> {   // lambda expression
	         System.out.println("Runnable with Lambda Expression t1");
	         s1.test1(s2);
			};
	      
			Runnable t2 = () -> {   // lambda expression
		         System.out.println("Runnable with Lambda Expression t2");
		         s2.test1(s1);
		    };
		
		    new Thread(t1).start();
		    new Thread(t2).start();
		
	}

}
