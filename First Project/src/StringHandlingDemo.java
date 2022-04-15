


public class StringHandlingDemo {

	public static void main(String[] args) {
	
		String s1="VKKIT";
		System.out.println("The lenght of s1 id: "+s1.length());
		System.out.println("The index of K is: "+s1.indexOf('K'));
		String s2="Monday";
		String s3=s2.substring(1,3);
		System.out.println(s3);
		
		String s4="    Hi          ";
		String s5=s4.trim();
		System.out.println(s5);
		
		String sentence="Hi welcome to java class";
		char ch[]=sentence.toCharArray();
		
		
for(int i=0;i<sentence.length();i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(sentence.length());
		

	}

}
