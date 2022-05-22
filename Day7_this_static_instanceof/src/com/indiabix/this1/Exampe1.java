//this keyword usd to refer instance var of current class
package com.indiabix.this1;

class Parent{
	int a;
	void print(int a) {
		this.a=a;
	}
	void display() {
		System.out.println("the value is "+a);
	}
}
public class Exampe1 {

	public static void main(String[] args) {
Parent p=new Parent();
p.print(10);
p.display();
	}

}
