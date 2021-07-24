package com.ex;

public class Sample{

	public static void main(String[] args) {

		sampleInterface s = (x,y)-> x*y;
		
		System.out.println(s.doSomething(2, 3));
		
		Thread t = new Thread(()->{
			System.out.println("thread 1");
		});
		
		Runnable r = ()->{
			System.out.println("runnable thread");
		};
		
		Thread t2 = new Thread(r);
		t2.start();
		
		t.start();
		
		try {
			throw new OutOfMemoryError();
		} catch (Throwable e) {

		} finally {
			System.out.println("finally");
		}	
	}

}
