//why the error when i give <=
//array printing using for loop and foreach
package com.tns.array;

public class Example2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
for(int i=1;i<arr.length;i++) {
	System.out.println(arr[i]);
}
for(int i:arr) {
	System.out.print(i+" ");
}
	}

}
