package alienpackage;
	
	import java.io.FileOutputStream;
	import java.io.IOException;
import java.util.Scanner;

	public class FileNotFoundException2 {
		public static void main(String []args) throws IOException {
			Scanner s= new Scanner(System.in);
			String path="C://javapractice//FileNotFoundException//chetan.txt";
			FileOutputStream fout = new FileOutputStream(path);
			System.out.println("Enter the name and location");
			String data=s.nextLine();
			byte []b =data.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Done Done Done");
		}
	}
	
	/*public class FileNotFoundException{
		public static void main(String[] args) throws IOException{
			String path="C://javapractice//FileNotFoundException//chetan.txt";
			FileOutputStream fout=new FileOutputStream(path);
			fout.write('c');
			fout.close();
			System.out.println("Done done");
		}
	}*/

	/*public class FileNotFoundException {
		public static void main(String[] args) throws IOException {
		String path="C://javapractice//FileNotFoundException//chetan.txt";
		FileOutputStream fout=new FileOutputStream(path);
		String data= "I will learn java for sure";
		byte[] b =data.getBytes(); // getBytes(); is in String class
		fout.write(b);
		fout.close();
		System.out.println("done");
		}

	}*/
