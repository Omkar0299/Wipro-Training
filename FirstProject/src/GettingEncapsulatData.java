
public class GettingEncapsulatData 
{
public static void main(String[] arg) {
	EncapsulationClass obj= new EncapsulationClass();
	obj.setstid(120);
	obj.setstname("Omkar");
	
	System.out.println("Student Id:" +obj.getstid());
	System.out.println("Student Name:" +obj.getstname());
}
}
