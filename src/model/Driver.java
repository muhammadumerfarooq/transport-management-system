package model;

import database.deletehandler;
import database.inserthandler;
import database.updatehandler;

public class Driver extends Employee {
private String licensenumber;
private Salary salary;
private String CNIC;
@Override
public String toString() {
	return "Driver [licensenumber=" + licensenumber + ", salary=" + salary + ", CNIC=" + CNIC + "]";
}
public String getLicensenumber() {
	return licensenumber;
}
public void setLicensenumber(String licensenumber) {
	this.licensenumber = licensenumber;
}
public Salary getSalary() {
	return salary;
}
public void setSalary(Salary salary) {
	this.salary = salary;
}
public String getCNIC() {
	return CNIC;
}
public void setCNIC(String cNIC) {
	CNIC = cNIC;
}
public Driver(String licensenumber, Salary salary, String cNIC) {
	super();
	this.licensenumber = licensenumber;
	this.salary = salary;
	CNIC = cNIC;
}
public Driver() {
	super();
	// TODO Auto-generated constructor stub
}
public Driver(int personID, String name, String address, String dob, String email, String phonenumber, String e_no,
		String dateemployed) {
	super(personID, name, address, dob, email, phonenumber, e_no, dateemployed);
	// TODO Auto-generated constructor stub
}
public Driver(int personID, String name, String address, String dob, String email, String phonenumber) {
	super(personID, name, address, dob, email, phonenumber);
	// TODO Auto-generated constructor stub
}
public boolean save(int personid,Driver d) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	inserthandler i=new inserthandler();
	boolean c_status=i.insertdriver(personid, d);
	if(c_status)
	{
		return true;
	}
	else
		return false;
}
public boolean delete(int pid,Driver d)
{
	deletehandler d_handler=new deletehandler();
	boolean delete_status=d_handler.deletedriver(pid, d);
	if(delete_status)
	{
		return true;
	}
	else
		return false;
}
public boolean updatesalary(int personid,Salary s)
{
	updatehandler update=new updatehandler();
	boolean u_status=update.updatedriverpay(personid, s);
	if(u_status)
	{
		return true;
	}
	else
		return false;
}
}
