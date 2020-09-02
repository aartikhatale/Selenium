package ioSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		List<String> l = new ArrayList<>();
		l.add("Aarti");
		l.add("abc");
		l.add("varun");
		l.add("123");
		l.add("name");
		l.add("xyz");
		l.add("Manoj");
		FileOutputStream fos = new FileOutputStream("ArrayDemo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l);
		oos.close();
		System.out.println("App End");

	}

}
