//matches  meth returns true oly if the entire string matches
package com.indiabix.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example6 {

	public static void main(String[] args) {
		String p="nam somani";
Scanner sc=new Scanner(System.in);
String inp=sc.nextLine();
//Pattern is a class which contains matches meth
boolean result=Pattern.matches(p, inp);
System.out.println(result);
sc.close();
	}

}
