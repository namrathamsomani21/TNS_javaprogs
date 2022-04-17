class TestArray
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		//declaration and instantiation 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++)
			//length is the property of the array
			System.out.println(a[i]);
		
		int b[]=new int[] {12,23,34,45,56};
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);

	}
}

		
		
	

