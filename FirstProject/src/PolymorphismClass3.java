
public class PolymorphismClass3 extends PolymorphismClass2 {

	public void multiply(int a, int b) {
		System.out.println("Multiplication is:" + (a-b));
	}
	public static void main(String[] args) {
		
		//run time polymorshism
		PolymorphismClass2 obj = new PolymorphismClass3();
		obj.multiply(10, 5);
		
		
		
	}

}
