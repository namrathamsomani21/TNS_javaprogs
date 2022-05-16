package com.indiabix.pack;
//since the methods and variables were inside the cllass,even though they were pvt they cud be accessed
public class Example1 {
private int sum=12;
private int add(int a,int b) {
	return(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example1 e=new Example1();
System.out.println(e.sum); 
System.out.println(e.add(12, 15));
	}

}
