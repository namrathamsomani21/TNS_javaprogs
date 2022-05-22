//for meth overriding to happen atleast 2 classes is necessary with inheritance involved

package com.tns.polymorphism;

class Android{
	void display() {
		System.out.println("realme");
	}
}
class Apple extends Android{
	void display() {
		System.out.println("iphone 11 pro max");
	}
}
class Nokia extends Android{
	void display() {
		System.out.println("Nokia");
	}}
public class FunctionOverriding {

	public
	static void main(String[] args) {
Android a=new Apple();
//the created obj wil access child class's meth when an obj of child's class is created
Apple a1=new Apple();
Nokia n=new Nokia();
a.display();
a1.display();
n.display();

	}

}
