


	
		
		 class Sample 
		{
			int i,j,k;
			
			public Sample(int i) {
				this.i = i;
			}

			public Sample(int i, int j) {
				this(i);
				this.j = j;
			}

			public Sample(int i, int j, int k) {
				this(i,j);
				this.k = k;
			}
		public void display()
			{
			this.i=100;
				System.out.println("i, j,k values are "+i+" "+j+" "+k);
			}

			public void m1()
			{
				this.display();
			}
		}
		public class ThisDemo {
			public static void main(String[] args) {
				
				Sample obj=new Sample(10,23,45);
				obj.m1();
				Sample obj1=new Sample(100,200);
				obj1.display();
			}
		
		
	}


