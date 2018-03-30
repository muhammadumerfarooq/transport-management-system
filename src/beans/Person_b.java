package beans;

import javafx.beans.property.*;

public class Person_b {
	private IntegerProperty PersonID;
	private StringProperty name;
	private StringProperty address;
	private StringProperty dob;
	private StringProperty email;
	private StringProperty phonenumber;
	public Person_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber) {
		super();
		PersonID = personID;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public final IntegerProperty PersonIDProperty() {
		return this.PersonID;
	}
	
	public final int getPersonID() {
		return this.PersonIDProperty().get();
	}
	
	public final void setPersonID(final int PersonID) {
		this.PersonIDProperty().set(PersonID);
	}
	
	public final StringProperty nameProperty() {
		return this.name;
	}
	
	public final String getName() {
		return this.nameProperty().get();
	}
	
	public final void setName(final String name) {
		this.nameProperty().set(name);
	}
	
	public final StringProperty addressProperty() {
		return this.address;
	}
	
	public final String getAddress() {
		return this.addressProperty().get();
	}
	
	public final void setAddress(final String address) {
		this.addressProperty().set(address);
	}
	
	public final StringProperty dobProperty() {
		return this.dob;
	}
	
	public final String getDob() {
		return this.dobProperty().get();
	}
	
	public final void setDob(final String dob) {
		this.dobProperty().set(dob);
	}
	
	public final StringProperty emailProperty() {
		return this.email;
	}
	
	public final String getEmail() {
		return this.emailProperty().get();
	}
	
	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	
	public final StringProperty phonenumberProperty() {
		return this.phonenumber;
	}
	
	public final String getPhonenumber() {
		return this.phonenumberProperty().get();
	}
	
	public final void setPhonenumber(final String phonenumber) {
		this.phonenumberProperty().set(phonenumber);
	}
	
	
}
