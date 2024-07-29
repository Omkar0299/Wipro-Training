
public class AbstractClass2 extends AbstractClass1 {

	
	@Override
	public void sum(int a, int b) {
		System.out.println("sum is: " + (a+b));

	}
	
	public static void main(String[] args) {
		//runtime polymorphism
		AbstractClass1 obj = new AbstractClass2();
		obj.sum(4, 5);
		
	}

}
