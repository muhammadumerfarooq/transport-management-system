package model;
import java.sql.*;

import database.MySqlConnection;
public class Manager extends Employee {
private String username;
private String password;
Connection conn;
public Manager()
{
	conn=MySqlConnection.connect();
	if(conn==null){
		System.exit(1);
	}
	
}
public boolean isdbconnected()
{
	try {
		return !conn.isClosed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
public boolean islogin(String username,String password) throws SQLException
{
	PreparedStatement stat=null;
	ResultSet result=null;
	String query="SELECT * FROM manager WHERE username=? AND password=?";
	try {
		stat=conn.prepareStatement(query);
		stat.setString(1,username);
		stat.setString(2,password);
		result=stat.executeQuery();
		if(result.next())
		{
			return true;
		}
		else
		{
			return false;
		}
	} catch (Exception e) {
		// TODO: handle exception
	return false;
	}
	finally
	{
		stat.close();
		result.close();
	}
}
public Manager(int personID, String name, String address, String dob, String email, String phonenumber, String username,
		String password) {
	super(personID, name, address, dob, email, phonenumber);
	this.username = username;
	this.password = password;
}
public Manager(int personID, String name, String address, String dob, String email, String phonenumber) {
	super(personID, name, address, dob, email, phonenumber);
	// TODO Auto-generated constructor stub
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Manager [username=" + username + ", password=" + password + "]";
}

}
