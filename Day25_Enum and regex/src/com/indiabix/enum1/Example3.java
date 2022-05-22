package com.indiabix.enum1;
enum Bike{
	
	Pulser,KTM,R3,R15,Honda;
}
public class Example3 {

	public static void main(String[] args) {
		
		Bike b=Bike.KTM;
		switch(b) {
		case Pulser:
			System.out.println("ur choice is Pulser");
			break;
		case KTM:
			System.out.println("ur choice is KTM");
			break;
		case R15:
				System.out.println("ur choice iss R3");
				break;
		default:
			System.out.println("invalid");
			break;

			
		}
	}

}
