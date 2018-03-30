package beans;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;

public class Salary_b {
	private FloatProperty amount;
	private StringProperty startdate;
	private StringProperty enddate;
	public Salary_b(FloatProperty amount, StringProperty startdate, StringProperty enddate) {
		super();
		this.amount = amount;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public final FloatProperty amountProperty() {
		return this.amount;
	}
	
	public final float getAmount() {
		return this.amountProperty().get();
	}
	
	public final void setAmount(final float amount) {
		this.amountProperty().set(amount);
	}
	
	public final StringProperty startdateProperty() {
		return this.startdate;
	}
	
	public final String getStartdate() {
		return this.startdateProperty().get();
	}
	
	public final void setStartdate(final String startdate) {
		this.startdateProperty().set(startdate);
	}
	
	public final StringProperty enddateProperty() {
		return this.enddate;
	}
	
	public final String getEnddate() {
		return this.enddateProperty().get();
	}
	
	public final void setEnddate(final String enddate) {
		this.enddateProperty().set(enddate);
	}
	
}
