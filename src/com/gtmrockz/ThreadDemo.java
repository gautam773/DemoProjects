package com.gtmrockz;

public class ThreadDemo {

	public static void main(String[] args) 
	{
		DemoThreadClass c1 = new DemoThreadClass();
		Thread t1 = new Thread(c1);
		c1.start();
	}

}
