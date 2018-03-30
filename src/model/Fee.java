package model;

public class Fee {
private float amount;
private String startdate;
private String enddate;
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getStartdate() {
	return startdate;
}
public void setStartdate(String startdate) {
	this.startdate = startdate;
}
public String getEnddate() {
	return enddate;
}
public void setEnddate(String enddate) {
	this.enddate = enddate;
}
@Override
public String toString() {
	return "Fee [amount=" + amount + ", startdate=" + startdate + ", enddate=" + enddate + "]";
}
public Fee(float amount, String startdate, String enddate) {
	super();
	this.amount = amount;
	this.startdate = startdate;
	this.enddate = enddate;
}
public Fee()
{
	
}
}
