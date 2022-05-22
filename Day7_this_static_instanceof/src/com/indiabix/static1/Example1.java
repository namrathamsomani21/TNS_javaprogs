//static var is ntg but goba variable which is rstricted to a file
//We cant declare static var in the main meth or any kind of meth of the class. 
//static var must be declard lik a class member in the class.
//coz during compilatn time JVM binds static var to the class level that means they have to declre lik we declare class members in the class.
//static variables can be assigned again
package com.indiabix.static1;

public class Example1 {
	static int x=10;

	public static void main(String[] args) {
 x=12;
		System.out.println(x);
	}

}
