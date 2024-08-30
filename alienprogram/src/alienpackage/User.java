package alienpackage;

public class User {

	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell",50000,"red");
		Laptop l2=new Laptop("Dell",50000,"red");
 System.out.println(l1);
 System.out.println(l2);
 System.out.println(l1==l2);
 System.out.println(l1.equals(l2));
 System.out.println(l1.hashCode());
 System.out.println(l2.hashCode());
	}

}
