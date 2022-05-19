//super keyword is used to access the immediate parent class's values
//super keyword is used to cal the immediate variable or method of the parents class
package com.indiabix.abstract_final;
class fruit{
	String name="apple";
	void display() {
		System.out.println("hii");
		

	}

}
class Apple extends fruit{
	String name="apple1";
	void print() {
		System.out.println(name);
		super.display();
	}

}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple a=new Apple();
a.print();
	}

}
