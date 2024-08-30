package alienpackage;

public class Empo {
	int eid;
	String name;
	double sal;
	String job;
	
	public Empo(int eid, String name, double sal, String job) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.job = job;
	}

	public Empo(int eid, String name, String job) {
		super();
		this.eid = eid;
		this.name = name;
		this.job = job;
	}
	
	public void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(job);
		System.out.println("--------------");
		
		
	}

}
