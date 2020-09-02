package ioSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeInput {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		fis = new FileInputStream("EmpData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Employee e = null;
		if (o instanceof Employee) {
			e = (Employee) o;
			System.out.println(e.getName() + " " + e.getProfile() + " " + e.getSal() + " " + e.getComm());
			ois.close();
		}
	}
}
