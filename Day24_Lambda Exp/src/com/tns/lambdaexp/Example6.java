package com.tns.lambdaexp;

public class Example6 {

	public static void main(String[] args) {
/*Runnable r=new Runnable() {
	public void run() {
		System.out.println("multithreading");
	}
};
Thread t= new Thread(r);
t.start();*/
		Runnable r=()->	{
			System.out.println("multithreading");
			
		};
		Thread t= new Thread(r);
		t.start();
		
	}

}
