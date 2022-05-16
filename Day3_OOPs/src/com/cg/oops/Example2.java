package com.cg.oops;

public class Example2 {
	String name;
	//parameterized constructor
	Example2(String name//formal para/local var in caled fn
			){
		this.name=name;
//instance var=local var
//when local var and instance var are same this keyword is used with instance var
	}
void display() {
	System.out.println("This is "+name);
}
	public static void main(String[] args) {
Example2 e1=new Example2("Audi");
Example2 e2=new Example2("BMW");
Example2 e3=new Example2("Ferrari");
e1.display();
e2.display();
e3.display();

	}

}
