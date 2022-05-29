package com.cg.exception;

public class Program4 {

	public static void main(String[] args) {
String[] s= {"abc","123",null,"xyz"};
for(int i=0;i<5;i++) {
	try {
		int a=s[i].length()+Integer.parseInt(s[i]);
	}
	//Pipe operator "|" used to include multiple catch in the same block
	catch(NumberFormatException|NullPointerException|ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	
	/*catch(NumberFormatException e) {
		System.out.println(e);

	}
	catch(NullPointerException e1) {
		System.out.println(e1);

	}
	catch (ArrayIndexOutOfBoundsException ex) {
	System.out.println(ex);
}*/
}
	}

}
