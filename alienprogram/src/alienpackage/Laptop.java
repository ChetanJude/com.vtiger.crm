package alienpackage;

public class Laptop {

	String brand;
	double price;
	String colour;
	
	public Laptop(String brand, double price, String colour) {
		super();
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
	public String toString() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(colour);
		return "";
	}
	public boolean equals(Object o) {
		Laptop l=(Laptop) o;
		return this.brand==l.brand && this.price==l.price && this.colour==l.colour;
	}

	public int hashCode()
	{
		return brand.hashCode()+(int)price+colour.hashCode();
	}
}
