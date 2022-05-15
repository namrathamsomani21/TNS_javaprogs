package com.tns.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Annotation1{
	int sound();
}
class P{
	@Annotation1(sound=12)
	public void display() {
		System.out.println("hii");
	}
}
public class Example4 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
		// TODO Auto-generated method stub
P obj =new P();
Method m=obj.getClass().getMethod("display");
Annotation1 a= m.getAnnotation(Annotation1.class);
//since annttn is under abstrct it cant hv objs hence method class is created
	
	System.out.println(a.sound());
	}

}
