package ioSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		fis = new FileInputStream("ArrayDemo.txt");
		oos = new ObjectInputStream(fis);
		Object o = oos.readObject();
		ArrayList<String> s = (ArrayList<String>) o;
		for (String ob : s) {
			System.out.println(ob);
		}
		oos.close();

	}

}
