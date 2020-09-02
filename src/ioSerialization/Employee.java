package ioSerialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name, profile;
	private double sal, comm;

	public String getName() {
		return name;
	}

	public String getProfile() {
		return profile;
	}

	public double getSal() {
		return sal;
	}

	public double getComm() {
		return comm;
	}

	public Employee(String name, String profile, double sal, double comm) {
		super();
		this.name = name;
		this.profile = profile;
		this.sal = sal;
		this.comm = comm;
	}

	public Employee() {
		super();

	}

}
