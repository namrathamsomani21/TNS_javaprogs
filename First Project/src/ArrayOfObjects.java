class Student1{
	public int roll_no;
	public String name;
	Student1(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1[] arr=new Student1[5];
arr[0]=new Student1(1,"Nam");
arr[1]=new Student1(2,"Sam");
arr[2]=new Student1(3,"Kim");
arr[3]=new Student1(4,"Ram");
arr[4]=new Student1(5,"Min");

for(int i=0;i<arr.length;i++)
	System.out.println("element at " +i+ ":"+arr[i].roll_no+" "+arr[i].name);
	

int arr1[][]= {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++)
	System.out.print(arr1[i][j]);
System.out.println(); 
	}
	}
}
