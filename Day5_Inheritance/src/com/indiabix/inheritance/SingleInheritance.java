package com.indiabix.inheritance;

class Parent{
	void print() {
		System.out.println("hii");
	}
}
class child extends Parent{
	void display() {
		System.out.println("child class");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
child c =new child();
c.print();
c.display();
	}

}
