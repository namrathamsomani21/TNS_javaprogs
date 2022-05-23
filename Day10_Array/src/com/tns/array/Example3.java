//array to print using scanner class
//nextInt() meth of a Scanner obj reads in a string of digits(char) and converts them into an int type.
//The Scanner obj reads the char one by one until it has collected those that are used for one int. 
//Then it converts them into a 32-bit numeric value.
package com.tns.array;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int arr[]=new int[s];
for(int i=0;i<arr.length;i++)  
{
arr[i]=sc.nextInt();	
}
for(int i=0;i<arr.length;i++) 
{
System.out.println(arr[i]);	
sc.close();
}

}
}