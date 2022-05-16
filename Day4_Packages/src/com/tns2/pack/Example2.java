//to access a method from another package in a same pro
//-import the pckg from which the method is to be accessed with.*
//create obj for that class from which it has to be imported ,in the current class
//declare the method to be accessed under public
package com.tns2.pack;
import com.tns1.com.*;

public class Example2 {

	public static void main(String[] args) {
Example1 e=new Example1();
e.display();
	}

}
