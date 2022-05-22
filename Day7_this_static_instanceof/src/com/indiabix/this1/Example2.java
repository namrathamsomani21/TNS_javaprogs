//this keyword is used to access the current classes var or meth
//passed as argument in the constructor call
package com.indiabix.this1;

public class Example2
{
	String str;
	Example2()
	{
	}
	Example2(String str){
		this.str=str;
	}
	public static void main(String[] args) {
		Example2 e=new Example2("heyy everyone");
		System.out.println(e.str);
	}

}
