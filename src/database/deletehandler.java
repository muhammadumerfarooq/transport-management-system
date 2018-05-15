package database;
import model.*;
public class deletehandler {
private String query;
private dbhandler dbconnection;
public deletehandler()
{
	dbconnection=dbhandler.getinstance();
	query="";
}
public boolean REMOVECustomer(int pid)
{
	String query="DELETE FROM ooadproject.customer where personid="+pid;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
public boolean deletecustomer(int pid,Customer c)
{
	String query="DELETE FROM ooadproject.customer where personid="+pid;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
public boolean REMOVEDriver(int pid)
{
	String query="DELETE FROM ooadproject.driver where personid="+pid;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
public boolean deletedriver(int pid,Driver d)
{
	String query="DELETE FROM ooadproject.driver where personid="+pid;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
public boolean REMOVERoute(String desc)
{
	String query="DELETE FROM ooadproject.route where description="+desc;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}

public boolean deleteroute(String desc,Route r)
{
	String query="DELETE FROM ooadproject.route where description="+desc;
	try {
		return dbconnection.delete_query(query);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
}
