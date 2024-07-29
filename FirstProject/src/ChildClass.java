
public class ChildClass extends ParentClass {

	
	public static void main(String[] str) {
		ChildClass obj= new ChildClass();
		obj.sub(100, 55);
		
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		System.out.println(obj.toString());
	}
}
