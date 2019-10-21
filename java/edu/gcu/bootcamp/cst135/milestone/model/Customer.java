package edu.gcu.bootcamp.cst135.milestone.model;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;

public class Customer{


private String firstName;
private String lastName;
private String username;
private String password;
private Date dateOpened;


private Saving saving;
private Checking checking;
private Loan loan;

public Customer(String firstName, String lastName, String username, String password) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.password = password;
	this.dateOpened = new Date();
	
	saving = new Saving("-SAV12345", 5000, 200, 25, .06);
	checking = new Checking("-CHK23456", 5000, 25);
	loan = new Loan("-LOAN34567", -2000, 35, 0.07);
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Date getDateOpened() {
	return dateOpened;
}

public void setDateOpened(Date dateOpened) {
	this.dateOpened = dateOpened;
}

public Saving getSaving() {
	return saving;
}

public void setSaving(Saving saving) {
	this.saving = saving;
}

public Checking getChecking() {
	return checking;
}

public void setChecking(Checking checking) {
	this.checking = checking;
}

public Loan getLoan() {
	return loan;
}

public void setLoan(Loan loan) {
	this.loan = loan;
}


}