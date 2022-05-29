package com.cg.exception;

import java.io.IOException;

class A{
	//throws is used to declare the exception
	void print(int num) throws ClassNotFoundException,IOException{
		if(num==1) {
			throw new IOException("Exception handled");
			
		}
		else
		{
			//used to throwan exception
			throw new ClassNotFoundException("Exception occured and handled");
		}
	}
}
public class Program6 {

	public static void main(String[] args) {
		//this shud be included inside the try catch because the value passed may not be 1
try {

		A obj =new A();
obj.print(1);
	}
catch(Exception e){
	System.out.println(e);
}
}}
