package alienprogram;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) throws IOException {
		Student s= new Student(101, "chetan", 25);
		String path = "C://javapractice//FileNotFoundException//chetan.txt";
		FileOutputStream f = new FileOutputStream(path);
		ObjectOutputStream o= new ObjectOutputStream(f);
		o.writeObject(s);
		o.flush();
		o.close();
		System.out.println(s);
	}

}
