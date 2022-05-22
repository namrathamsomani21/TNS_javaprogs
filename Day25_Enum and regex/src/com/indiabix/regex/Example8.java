//split with many splitters
package com.indiabix.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str="B-3\r Nam\r Somani";
String[] res=str.split("\rNam");

for(String i:res) {
	System.out.println(i);
}
s.close();
	}

}
