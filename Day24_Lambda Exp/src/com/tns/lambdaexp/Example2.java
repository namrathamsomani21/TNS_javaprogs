//lambda exp with single parameter with return statement


package com.tns.lambdaexp;
interface B{
	String display(String str);
}
public class Example2 {

	public static void main(String[] args) {
B obj=(String str)->
{
return str;
};
System.out.println(obj.display("lambda exp with single parameter"));

	}

}
