//using try catch and finally
package com.cg.exception;

public class Program2 {

	public static void main(String[] args) {
System.out.println("first line");
System.out.println("second line");
int[] myIntArray=new int[] {1, 2, 3};

//If a statement in try raised an exception,thn the rest of the try block doesnt execute nd control passes to the corresponding catch block
//we can define 1 try block with multiple catch.Every try shud hv at least 1 catch block.
try 
{
print(myIntArray);
System.out.println("Third line");

}
catch(Exception e) {
	System.out.println("Exception handled");
}
//finally is executed by default
//multiple finally blocks in the same prog arnt allowed.
finally {
	System.out.println("finally block");
}
//any statements written outside try catch and finally gets executed
System.out.println("hii"); 
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed");
	}
}
