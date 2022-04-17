
public class JaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaring 2-d array  with 2 rows
		int arr[][]=new int[2][];
		//Making the above array jagged
		//first row has 3 columns
		arr[0]=new int[3];
		//second row has 2 columns
		arr[1]=new int[2];
		//initializing array
		int count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
				arr[i][j]=count++;
		//Displaying the values of 2d jagged  array
System.out.println("contents of 2d jagged array");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
System.out.println(arr[i][j]+ " ");
	System.out.println();
}
		}
		
	}

 
