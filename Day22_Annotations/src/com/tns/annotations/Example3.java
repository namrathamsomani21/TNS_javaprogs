package com.tns.annotations;
class Animals
{
	@Deprecated
	void sound() {
		System.out.println("Animals roar");
	}
	void print() {
		System.out.println("Animals sound");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a =new Animals();
		a.sound();
		a.print();
	}
	

}
