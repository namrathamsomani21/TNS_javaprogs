//final method
//a class with final meth can be inherited but not overriden
//can class alone be abstract ??
//final method cant be overriden

package com.indiabix.abstract_final;
 class parent{
	final void accept() {
		System.out.println("parent");

	}
}
class child extends parent{
	void accept1() {
		System.out.println("child");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.accept();
	}

}
