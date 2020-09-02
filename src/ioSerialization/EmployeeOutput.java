package ioSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeOutput {

	public static void main(String[] args) {
		Employee e = new Employee("Roshan", "ATE", 200.0, 100.0);
		try {
			FileOutputStream fos = new FileOutputStream("EmpData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			System.out.println("done");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
