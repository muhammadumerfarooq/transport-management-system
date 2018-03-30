package model;

public class Person {
public Person()
{
	
}
public Person(int personID, String name, String address, String dob, String email, String phonenumber) {
		super();
		PersonID = personID;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.phonenumber = phonenumber;
	}
private int PersonID;
private String name;
private String address;
private String dob;
private String email;
private String phonenumber;
@Override
public String toString() {
	return "Person [PersonID=" + PersonID + ", name=" + name + ", address=" + address + ", dob=" + dob + ", email="
			+ email + ", phonenumber=" + phonenumber + "]";
}
public int getPersonID() {
	return PersonID;
}
public void setPersonID(int personID) {
	PersonID = personID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}


}
