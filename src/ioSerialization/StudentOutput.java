package ioSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentOutput {

	public static void main(String[] args) throws Exception {
		Student s = new Student(1, "Aarti", "Mechanical");
		Student s1 = new Student(2, "Vikram", "Civil");
		FileOutputStream fos = new FileOutputStream("StudData.txt");
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		oop.writeObject(s);
		oop.writeObject(s1);
		oop.close();
		System.out.println("Done");
	}

}
