//lampexp for collection
package com.tns.lambdaexp;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
LinkedList<Integer>obj=new LinkedList<>();
	obj.add(12);
	obj.add(34);
	obj.add(23);
System.out.println(obj);
obj.forEach((n)->{
	System.out.println(n);
});
	}

}
