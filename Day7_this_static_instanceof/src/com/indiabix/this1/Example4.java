//meth tht returns current class instance 
package com.indiabix.this1;

public class Example4 {
 int a;
 int b;
 Example4(){
	 a=10;
	 b=20;
 }
 //
 Example4 accept() {
	 return this;
 }
 void print() {
 //The method println(String) in the type PrintStream is not applicable for the arguments (String, String)
	 System.out.printf("a and b is "+a+" and " +b);
 }

	public static void main(String[] args) {
		Example4 e=new Example4();
		e.print();
	}

}
