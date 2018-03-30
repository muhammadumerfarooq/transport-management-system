package model;

import database.inserthandler;

public class Bus {
private String id;
private String chasisnumber;
private Driver driver;
private String driver1;
private String route1;
private Route route;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getChasisnumber() {
	return chasisnumber;
}
public void setChasisnumber(String chasisnumber) {
	this.chasisnumber = chasisnumber;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
public Route getRoute() {
	return route;
}
public void setRoute(Route route) {
	this.route = route;
}
@Override
public String toString() {
	return "Bus [id=" + id + ", chasisnumber=" + chasisnumber + ", driver=" + driver + ", route=" + route + "]";
}
public Bus(String id, String chasisnumber, Driver driver, Route route) {
	super();
	this.id = id;
	this.chasisnumber = chasisnumber;
	this.driver = driver;
	this.route = route;
}
public Bus() {
	// TODO Auto-generated constructor stub
}
public void setDriver(String d)
{
	this.driver1=d;
	
}
public String getdriver1()
{
	return driver1;
}
public void setRoute(String r)
{
	this.route1=r;
	
}
public String getroute1()
{
	return route1;
}
public boolean save(Bus b) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	inserthandler i=new inserthandler();
	boolean c_status=i.insertbus(b);
	if(c_status)
	{
		return true;
	}
	else
		return false;
}
}
