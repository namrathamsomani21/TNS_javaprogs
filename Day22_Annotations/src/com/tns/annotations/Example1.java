package com.tns.annotations;
class Animal
{
	void eatSomething() {
		System.out.println("eats something");
	}
}
class Dog extends Animal{
	@Override
	void eatSomething() {
		System.out.println("eats food");
	}
	//when a method is overrided and the method name is not written properly 
	//their is a warning shown when pointed to that method to change the wrong
	//method to proper overriden method name
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		

		a.eatSomething();
	}

}
