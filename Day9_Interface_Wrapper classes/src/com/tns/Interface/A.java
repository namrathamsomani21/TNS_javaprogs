//by def the meth inside the interface classes are abstract
//abstract meth are implemented outside the interface
//we cant create obj for interface
//All the methods of an interface are public abstract by defaul
//can we use the class or interface name as objs name

//An interface can "extend" other interfaces and not implement, just as a class subclass or extend another class. However, whereas a class can extend only one other class, an interface can extend any number of interfaces.
//if a class implements an interface, then that class has to implemnt al the meths of that interface

//implementatn of how the class implements the interface
package com.tns.Interface;

public interface A 
{
public void print();

}
 class B implements A{
	 //while implementing the abst meth pubic shud be used
	public void print() {
		
		System.out.println("hii");
	}
	public static void main (String[] args) {
		B obj=new B();
		obj.print();
	}
}