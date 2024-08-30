package alienpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

		public static void main(String[] args) throws IOException {
			String path = "C://javapractice//FileNotFoundException//chetan.txt";
			FileInputStream f = new FileInputStream(path);
			//ObjectInputStream o= new ObjectInputStream();
			//Student t=(Student)o.readObject();
			//System.out.println(t);
			//o.close();
		}

	}
