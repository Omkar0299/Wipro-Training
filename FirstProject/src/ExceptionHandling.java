
public class ExceptionHandling
{

	
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c= a/b;
		System.out.println("divsion is: " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("Do not enter 0 as denominator");
		}
	}
}
