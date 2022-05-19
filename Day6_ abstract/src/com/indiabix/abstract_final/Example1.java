//abst class cant have objs and when a meth is declared as abst then the class of meth shud be declared abst and implmttn of the method shud be done in the extended class
//a class can have comb of abst and non abst classes
//a class may or maynot have abst class
//class with abst meth becomes abst class
package com.indiabix.abstract_final;

abstract class A
{
	abstract void print();
	
}
class B extends A{
	void print() {
		System.out.println("hello");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.print();
		
		
	}

}
