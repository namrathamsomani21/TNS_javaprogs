//super keyword to access the parent method
package com.indiabix.abstract_final;
class Parent2{
	
void accept()
{
	System.out.println("parent");
}
}
class Child2  extends Parent2
{
	void accept(){
		System.out.println("child");
	}
	void display()
	{
		accept();
		super.accept();
	}
}

public class Example6 {

	public static void main(String[] args) {
Child2 c=new Child2();
c.display();
	}

}
