package beans;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import model.Salary;

public class Driver_b extends Employee_b {
	private StringProperty licensenumber;
	private ObjectProperty<Salary> salary;
	public final StringProperty licensenumberProperty() {
		return this.licensenumber;
	}
	
	public final String getLicensenumber() {
		return this.licensenumberProperty().get();
	}
	
	public final void setLicensenumber(final String licensenumber) {
		this.licensenumberProperty().set(licensenumber);
	}
	
	public final ObjectProperty<Salary> salaryProperty() {
		return this.salary;
	}
	
	public final Salary getSalary() {
		return this.salaryProperty().get();
	}
	
	public final void setSalary(final Salary salary) {
		this.salaryProperty().set(salary);
	}

	public Driver_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty e_no, StringProperty dateemployed) {
		super(personID, name, address, dob, email, phonenumber, e_no, dateemployed);
		// TODO Auto-generated constructor stub
	}

	public Driver_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber) {
		super(personID, name, address, dob, email, phonenumber);
		// TODO Auto-generated constructor stub
	}

	public Driver_b(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty e_no, StringProperty dateemployed,
			StringProperty licensenumber, ObjectProperty<Salary> salary) {
		super(personID, name, address, dob, email, phonenumber, e_no, dateemployed);
		this.licensenumber = licensenumber;
		this.salary = salary;
	}
	
	
}
