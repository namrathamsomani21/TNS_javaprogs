
//this passed as an arguement in the meth call
package com.indiabix.this1;

public class Example3 {
void accept(Example3 obj){
	System.out.println("welcome");
}
void print() {
	accept(this);
	//here this wud call the current accept
	
	
}
	public static void main(String[] args) {
		Example3 e=new Example3();
		e.print();
	}

}
