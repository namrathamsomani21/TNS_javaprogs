//any parent class inherited by child class is a instance of child class var
package com.tns.instanceof1;

 class Examplea {
void print() {
	System.out.println("hii");
}}
 public  class Exampleb extends Examplea {
 

	public static void main(String[] args) {
		  Exampleb e=new Exampleb();
		  System.out.println(e instanceof Examplea);


	}

}
