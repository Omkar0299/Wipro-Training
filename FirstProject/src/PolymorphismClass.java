
public class PolymorphismClass {

	public void sum(int a, int b) {
		System.out.println("Sum is:" + (a+b));
	}
	
	public void sum(double a, double b) {
		System.out.println("Sum is:" + (a+b));
	}
	
	public static void main(String[] args) {
		PolymorphismClass poly = new PolymorphismClass();
		poly.sum(5, 10);
		poly.sum(5.5, 10.6);

	}

}
