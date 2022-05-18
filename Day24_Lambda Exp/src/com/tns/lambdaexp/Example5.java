//lambda exp without return statement
package com.tns.lambdaexp;
interface D{
int mul(int a,int b);
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=(int a,int b)->(a*b);
		System.out.println("product of a and b is "+obj.mul(20,10));
	}
	

}
