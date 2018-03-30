package beans;

import javafx.beans.property.*;
import model.Fee;

public class Cust_bean extends Person_b {
	private StringProperty rollnumber;
	private StringProperty dateregistered;
	private ObjectProperty<Fee> fee;
	public final StringProperty rollnumberProperty() {
		return this.rollnumber;
	}
	
	public final String getRollnumber() {
		return this.rollnumberProperty().get();
	}
	
	public final void setRollnumber(final String rollnumber) {
		this.rollnumberProperty().set(rollnumber);
	}
	
	public final StringProperty dateregisteredProperty() {
		return this.dateregistered;
	}
	
	public final String getDateregistered() {
		return this.dateregisteredProperty().get();
	}
	
	public final void setDateregistered(final String dateregistered) {
		this.dateregisteredProperty().set(dateregistered);
	}
	
	public final ObjectProperty<Fee> feeProperty() {
		return this.fee;
	}
	
	public final Fee getFee() {
		return this.feeProperty().get();
	}
	
	public Cust_bean(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber) {
		super(personID, name, address, dob, email, phonenumber);
		// TODO Auto-generated constructor stub
	}

	public final void setFee(final Fee fee) {
		this.feeProperty().set(fee);
	}

	public Cust_bean(IntegerProperty personID, StringProperty name, StringProperty address, StringProperty dob,
			StringProperty email, StringProperty phonenumber, StringProperty rollnumber, StringProperty dateregistered,
			ObjectProperty<Fee> fee) {
		super(personID, name, address, dob, email, phonenumber);
		this.rollnumber = rollnumber;
		this.dateregistered = dateregistered;
		this.fee = fee;
	}
	
	

}
