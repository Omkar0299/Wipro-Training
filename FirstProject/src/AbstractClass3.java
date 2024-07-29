
public class AbstractClass3 extends AbstractClass1 {

	
	@Override
	public void sum(int a, int b) {
		
		System.out.println("Sub is:"+ (a-b));
	}
	public static void main(String[] args) {
	
		AbstractClass1 obj = new AbstractClass3();
		obj.sum(15, 10);
	}

}
