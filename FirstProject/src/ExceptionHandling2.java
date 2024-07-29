
public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
		int[] intarr= {1,10,15,2};
		System.out.println(intarr[10]);
	}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("Index should be proper");
		}
	}
	
	
}
