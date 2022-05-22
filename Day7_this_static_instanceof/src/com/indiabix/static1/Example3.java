//using block as static
//Static block is used for initializing the static varS
package com.indiabix.static1;

public class Example3 {
	static int x;
	static String str;
	static {
		x=10;
		str="hii";
	
	}
	public static void main(String[] args) {
System.out.println(x);
System.out.println(str);
	}

}
