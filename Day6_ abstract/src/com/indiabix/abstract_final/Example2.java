//final variable
//doubt-y is theval getting changed
//var  values declared under final cant be changed
package com.indiabix.abstract_final;

public class Example2 {
   final int i=10;
   void print() {
	  int i=20;
		System.out.println(i);

   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		obj.print();
	}

}
