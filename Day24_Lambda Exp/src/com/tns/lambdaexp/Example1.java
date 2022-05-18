package com.tns.lambdaexp;
//intface cant have objs
interface A{
	void show() ;//fn interface is the one tht contains oly one abst method
	//interface cant have meth imp	
	
}
/*class B implements A
{
	public void show() {
		System.out.println(fn interface);
	}
}*/

public class Example1 {

	public static void main(String[] args) {
	//lamb with no para
		// TODO Auto-generated method stub
A obj=()->
{
	System.out.println("fn interface");
};
obj.show();

}}
