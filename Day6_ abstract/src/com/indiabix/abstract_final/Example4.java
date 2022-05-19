//final class
//final class cant have objs and cant be inherited
package com.indiabix.abstract_final;
 //final 
class parent1{
	 void accept() {
		System.out.println("parent");

	}
}
class child1 extends parent1{
	void accept1() {
		System.out.println("child");
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c=new child1();
		c.accept();
			
	}

}
