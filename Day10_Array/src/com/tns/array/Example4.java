package com.tns.array;

class Employee{
	public int ID;
	public String emp_name;
	Employee(int ID, String emp_name){
		this.ID=ID;
		this.emp_name=emp_name;
	}
	
}
public class Example4 {

	public static void main(String[] args) {
Employee arr[];
arr=new Employee[3];
arr[0]=new Employee(100,"sam");
arr[1]=new Employee(101,"nam");
arr[2]=new Employee(102,"kim");
for(int i=0;i<arr.length;i++)
{
	System.out.println("element at "+i+":"+arr[i].ID+" "+arr[i].emp_name);
}
	}

}
