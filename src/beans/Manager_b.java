package beans;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Manager_b extends Employee_b {
	private StringProperty username;
	private StringProperty password;
	public final StringProperty usernameProperty() {
		return this.username;
	}
	
	public final String getUsername() {
		return this.usernameProperty().get();
	}
	
	public final void setUsername(final String username) {
		this.usernameProperty().set(username);
	}
	
	public final StringProperty passwordProperty() {
		return this.password;
	}
	
	public final String getPassword() {
		return this.passwordProperty().get();
	}
	
	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}

	public Manager_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty e_no, StringProperty dateemployed,
			StringProperty username, StringProperty password) {
		super(personID, name, address, dob, email, phonenumber, e_no, dateemployed);
		this.username = username;
		this.password = password;
	}

	public Manager_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty e_no, StringProperty dateemployed) {
		super(personID, name, address, dob, email, phonenumber, e_no, dateemployed);
		// TODO Auto-generated constructor stub
	}

	public Manager_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber) {
		super(personID, name, address, dob, email, phonenumber);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
