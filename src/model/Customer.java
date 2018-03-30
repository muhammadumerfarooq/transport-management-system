package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.MySqlConnection;
import database.deletehandler;
import database.inserthandler;
import database.selecthandler;
import database.updatehandler;

public class Customer extends Person {
private String rollnumber;
private String dateregistered;
private Fee fee;
public String getRollnumber() {
	return rollnumber;
}
public void setRollnumber(String rollnumber) {
	this.rollnumber = rollnumber;
}
public String getDateregistered() {
	return dateregistered;
}
public void setDateregistered(String dateregistered) {
	this.dateregistered = dateregistered;
}
public Fee getFee() {
	return fee;
}
public void setFee(Fee fee) {
	this.fee = fee;
}
Connection conn;
public Customer()
{
	conn=MySqlConnection.connect();
if(conn==null){
	System.exit(1);
}

}
public Customer(int personID, String name, String address, String dob, String email, String phonenumber,
		String rollnumber, String dateregistered, Fee fee) {
	super(personID, name, address, dob, email, phonenumber);
	this.rollnumber = rollnumber;
	this.dateregistered = dateregistered;
	this.fee = fee;
}
public Customer(int personID, String name, String address, String dob, String email, String phonenumber) {
	super(personID, name, address, dob, email, phonenumber);
	// TODO Auto-generated constructor stub
}

public void insert(String c_id,String c_name,String c_address,String dob,String email,String pno,String rno,String dreg) throws SQLException
{
	PreparedStatement stat=null;
	Statement stae=null;
	ResultSet result=null;
	String query="INSERT INTO ooadproject.customer" +  "VALUES" + "(?,?,?,?,?,?,?,?)";
	try {
		
		stat.setString(1,c_id);
		stat.setString(2,c_name);
		stat.setString(3,c_address);
		stat.setString(4,dob);
		stat.setString(5,email);
		stat.setString(6,pno);
		stat.setString(7,rno);
		stat.setString(8,dreg);
		stat=conn.prepareStatement(query);
		//stae=conn.createStatement();
		//stae.executeUpdate(query);
		stat.executeUpdate();
	} catch (Exception e1) {
		// TODO: handle exception
	}
	finally
	{
		stat.close();
		result.close();
	}
}
public boolean save(int personid,Customer c) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	inserthandler i=new inserthandler();
	boolean c_status=i.insertcustomer(personid, c);
	if(c_status)
	{
		return true;
	}
	else
		return false;
}
public boolean delete(int pid,Customer c)
{
	deletehandler d=new deletehandler();
	boolean delete_status=d.deletecustomer(pid,c);
	if(delete_status)
	{
		return true;
	}
	else
		return false;
}
public boolean updatecustomerfee(int personid,Fee f)
{
	updatehandler update=new updatehandler();
	boolean u_status=update.updatecustomerfee(personid, f);
	if(u_status)
	{
		return true;
	}
	else
		return false;
}
public ResultSet searchcustomer(int personid) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
{
	selecthandler handle=new selecthandler();
	return handle.selectcustomer(personid);
}
}
