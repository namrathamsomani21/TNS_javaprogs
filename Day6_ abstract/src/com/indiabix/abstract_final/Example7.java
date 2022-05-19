//super() can be used to invoke immediate parent class constructor
//constructors get called as soon as the object is created for that class
//a child class always calls the parent constructor ,when the obj is created for it
package com.indiabix.abstract_final;
class Parent3{
	Parent3(){
		System.out.println("hii");
	}
}
class Child3 extends Parent3{
	Child3(){
//constructor call must be first in a constructor	
//super need not be used here since child class will call the 		
		super();
		System.out.println("hello");
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent3 p=new Parent3();
		Child3 c=new Child3();

	}

}
