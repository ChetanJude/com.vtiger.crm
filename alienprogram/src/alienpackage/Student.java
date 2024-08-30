package alienpackage;

import java.io.Serializable;

public class Student implements Serializable {

	int sid;
	String name;
	int age;
	
	Student(int sid, String name, int age){
		this.sid=sid;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(age);
		return "";
	}
	
}
