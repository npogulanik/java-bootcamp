package com.myshoppingcart.app;

import java.math.BigInteger;

public class User {
	
	static int uniqueIdUser = 0;
	private int idUser;
	private String password;
	private String name;
	private String lastName;
	private String email;
	private BigInteger phone;
	
	
	public User() {
		super();
		uniqueIdUser++;
		this.idUser = uniqueIdUser;
	}
	
	public User(String name, String lastName, String email, BigInteger phone, String password) {
		super();
		uniqueIdUser++;
		this.idUser = uniqueIdUser;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public BigInteger getPhone() {
		return phone;
	}
	
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return 	"User: " + lastName.toUpperCase() + ", " + name + "\n" +
				"UserId: " + idUser + "\n" +
				"Email: " + email + "\n" +
				"Phone: " + phone;
	}
}