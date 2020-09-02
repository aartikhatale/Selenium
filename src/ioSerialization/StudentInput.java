package ioSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentInput {

	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis = null;
		fis = new FileInputStream("StudData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Student s = null;
		if (o instanceof Student) {
			s = (Student) o;
			System.out.println(+s.getRollno() + ". " + s.getName() + " " + s.getBranch());
			ois.close();
		}

	}

}
