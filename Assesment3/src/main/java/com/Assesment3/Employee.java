package com.Assesment3;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int ID;
	private String NAME;
	private long SALARY;
	public Employee() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Employee(int iD, String nAME, long sALARY) {
	super();
	ID = iD;
	NAME = nAME;
	SALARY = sALARY;
	}
	public int getID() {
	return ID;
	}
	public void setID(int iD) {
	ID = iD;
	}
	public String getNAME() {
	return NAME;
	}
	public void setNAME(String nAME) {
	NAME = nAME;
	}
	public long getSALARY() {
	return SALARY;
	}
	public void setSALARY(long sALARY) {
	SALARY = sALARY;
	}
}
