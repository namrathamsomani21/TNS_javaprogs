package com.indiabix.enum1;

public class Example5 {
	enum EmpType{
		Contract,permanent,Temporary,temp;
	}
	static void print(EmpType e) {
		if(e==EmpType.permanent) {
			System.out.println("permanent employee");
		}
		else if(e==EmpType.Contract) {
			System.out.println("contract based employee");
		}
		else {
			System.out.println("temporary employee");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpType e=EmpType.temp;
		print(e);
	}

}
