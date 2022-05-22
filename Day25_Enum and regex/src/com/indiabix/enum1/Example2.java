package com.indiabix.enum1;

public class Example2 {
	enum Margin{
		Top,Left,Right,Bottom;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=1;
for(Margin m:Margin.values()) {
	//here printf is used because the format specifier is s and
	System.out.printf("Margin:%d=%s\n",count++,m);
}
	}

}
