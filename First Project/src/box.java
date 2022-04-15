
public class box
{
//class variables	
 private double dblWidth=3.4;
 private double dblHeight=2.2;
  private double dblDepth=4;
 //static variables
 static int boxid;
 
public double calcVolume() 
{
	//local variable
double dblTemp;
dblTemp= dblWidth * dblHeight * dblDepth;
return dblTemp;
}

public static void main(String args[])
{
   box b1=new box();
	System.out.println("Volume of the box is " +b1.calcVolume());

}
}