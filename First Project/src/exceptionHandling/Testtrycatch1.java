package exceptionHandling;


public class Testtrycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("there is an exception");
		}
		System.out.println("rest of the code");
	}

}
