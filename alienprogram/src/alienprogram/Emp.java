package alienprogram;

public class Emp {
	int id;
	private double sal;
	
	public Emp(int id, double sal) {
		super();
		this.id = id;
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	void display()
	{
		System.out.println(sal);
		System.out.println(id);
		}
}
