package com.assingment.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column(name="firstname", nullable=false)
	private String FirstName;
	
	@Column(name="lastname", nullable=false)
	private String LastName;
	
	@Column(name="email", nullable=false)
	private String email;

	@Column(name="location", nullable=false)
	private String location;

	public Employee(long iD, String firstName, String lastName, String email, String location) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.location = location;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
		
	
}
