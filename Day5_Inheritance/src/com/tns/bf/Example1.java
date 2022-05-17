//using scanner class which takes short ips that can be any primitive data types
package com.tns.bf;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
double b=sc.nextDouble();
String s=sc.next();//wud take a single word
//nextLine would take the entire string but all d ip shud be in thesame line
System.out.println(a);
System.out.println(b);
System.out.println(s);
sc.close();
	}

}
