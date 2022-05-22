//compile time input
//main() meth is static coz JVM can invoke it without instantiating the class which saves the unnecessary wastage of memory that wud be used by the obj declared only for calling the main() meth by the JVM.
package com.indiabix.intro;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=15;//whole
float b=10.5f;//deci precision upto 6 dec places
double c=14.7;//deci stores upto 15 dec places
char d='x';
String str="HII";
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(str);


	}

}
