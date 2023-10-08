package db;

public class Patient {
	private int id;
	private String firstName;
	private String surName;
	private String dni;
	private String contactInfo;
	public Patient(int id, String firstName, String surName, String dni, String contactInfo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.dni = dni;
		this.contactInfo = contactInfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		return firstName + " " + surName;
	}


	
}
