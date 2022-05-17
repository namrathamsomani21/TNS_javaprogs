//here the subclasses inherit from one class so the obj has to be created to the objs
package com.indiabix.inheritance;
class Vehicle {
	void print() {
		System.out.println();
	}
	
}
class car extends Vehicle{
	void display1() {
		System.out.println("benz");
	}
}
class bike extends Vehicle{
	void display() {
		System.out.println("Bike");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
bike  b=new bike();
car c =new car();
b.display();
c.display1();
b.print();

	}

}
