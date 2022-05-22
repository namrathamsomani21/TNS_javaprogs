package com.tns.polymorphism;

class Renault{
	String color;
	int speed;
	Renault(){
		System.out.println("RXE");
	}
	Renault(String clr,int s){
		color=clr;
		speed=s;
		System.out.println("color is "+clr+". speed is "+s);

	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Renault r=new Renault();
		Renault r1=new Renault("Yellow",30);
///here when the second isnt passed parameters it becomes non parametrised const hence it calls the non parametrised const twice
	}

}
