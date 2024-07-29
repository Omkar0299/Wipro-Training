
import java.util.Scanner;
public class SumOfInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter any integer value seprated by space: " );
		String input = scanner.nextLine();
		String[] tokens = input.split("\\s+");
		
		for(String token :tokens) {
try {
	
		int num = Integer.parseInt(token);
		sum+=num;
	
	
}catch(NumberFormatException ae) {
	System.out.println("Only accept integer value" );
	return;
}
}
		System.out.println("Sum of integer is" + sum );
		scanner.close();
}
}
