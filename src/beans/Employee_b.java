package beans;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Employee_b extends Person_b {
	private StringProperty e_no;
	private StringProperty dateemployed;
	public Employee_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty e_no, StringProperty dateemployed) {
		super(personID, name, address, dob, email, phonenumber);
		this.e_no = e_no;
		this.dateemployed = dateemployed;
	}

	public Employee_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber) {
		super(personID, name, address, dob, email, phonenumber);
		// TODO Auto-generated constructor stub
	}

	public final StringProperty e_noProperty() {
		return this.e_no;
	}
	
	public final String getE_no() {
		return this.e_noProperty().get();
	}
	
	public final void setE_no(final String e_no) {
		this.e_noProperty().set(e_no);
	}
	
	public final StringProperty dateemployedProperty() {
		return this.dateemployed;
	}
	
	public final String getDateemployed() {
		return this.dateemployedProperty().get();
	}
	
	public final void setDateemployed(final String dateemployed) {
		this.dateemployedProperty().set(dateemployed);
	}
	
}
