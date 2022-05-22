//interface by default contains abst methh and its impl is in chid class
package com.indiabix.enum1;
interface Pizza{
	//abst meth
	void display();
}
enum size implements Pizza{
	Medium,Regular,large,extralarge;
	
	public void display() {
		System.out.println("size is:"+this);
	}

	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
size.extralarge.display();

	}

}
