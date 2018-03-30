package model;

public class Employee extends Person {
private String e_no;
private String dateemployed;
public Employee()
{
	
}
@Override
public String toString() {
	return "Employee [e_no=" + e_no + ", dateemployed=" + dateemployed + "]";
}
public Employee(int personID, String name, String address, String dob, String email, String phonenumber) {
	super(personID, name, address, dob, email, phonenumber);
	// TODO Auto-generated constructor stub
}
public Employee(int personID, String name, String address, String dob, String email, String phonenumber, String e_no,
		String dateemployed) {
	super(personID, name, address, dob, email, phonenumber);
	this.e_no = e_no;
	this.dateemployed = dateemployed;
}
public String getE_no() {
	return e_no;
}
public void setE_no(String e_no) {
	this.e_no = e_no;
}
public String getDateemployed() {
	return dateemployed;
}
public void setDateemployed(String dateemployed) {
	this.dateemployed = dateemployed;
}

}
