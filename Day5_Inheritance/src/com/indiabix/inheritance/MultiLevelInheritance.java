//subclass can call its parents class with objs
package com.indiabix.inheritance;
class Samsung{
	void accept() {
		System.out.println("Galaxy");
	}
}
class Samsung31 extends Samsung{
	void print() {
		System.out.println("Galaxy M31");
	}
}
class Samsung31s extends Samsung31{
	void display() {
		System.out.println("Galaxy M31s");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Samsung31s obj =new Samsung31s();
		obj.accept();
		obj.print();
		obj.display();


	}

}
