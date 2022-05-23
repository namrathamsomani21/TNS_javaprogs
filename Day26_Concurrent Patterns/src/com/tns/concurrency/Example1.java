package com.tns.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 implements Runnable
{
	Main m;
	int n;
	String task;
public Example1(Main m,int n,String task) 
{
	this.m=m;
	this.n=n;
	this.task=task;
}
public void run() {
	for(int i=0;i<n;i++) 
	{
	System.out.println("thread "+Thread.currentThread().getName());
	m.pause(Math.random());
	}
}
}
 
class Main{
	public void print()
	{
		ExecutorService t=Executors.newFixedThreadPool(2);
	//2 here means simultaneously therell be two threads runnin
		for(int i=0;i<5;i++) {
t.execute(new Example1(this, i+1, "hii"+(i+1)));
		}
		t.shutdown();
		}
void pause(double seconds) {
	try
	{
		Thread.sleep(Math.round(10000.0*seconds));
	}
	catch(InterruptedException e) 
	{
		System.out.println("Exception occured");
	}
}
	public static void main(String[] args) {
		new Main().print();
}
	
}
