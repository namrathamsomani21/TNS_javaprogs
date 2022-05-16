package com.cg.oops;

public class Example3 {
String breed;
Example3(String name){
	breed=name;
}
void display() {
	System.out.println("The breed is "+breed);
	//the name used in instance var is used here ie the breed
}
	public static void main(String[] args) {
		Example3 d1=new Example3("pug");
		Example3 d2=new Example3("bull dog");
		Example3 d3=new Example3("st.bernard");
d1.display();
d2.display();
d3.display();

	}

}
