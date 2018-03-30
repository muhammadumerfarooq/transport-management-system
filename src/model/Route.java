package model;

import database.deletehandler;
import database.inserthandler;

public class Route {
private String description;

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Route(String description) {
	super();
	this.description = description;
}
public Route() {
	// TODO Auto-generated constructor stub
}

public boolean save(int routeid,Route r) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	inserthandler i=new inserthandler();
	boolean c_status=i.insertroute(routeid, r);
	if(c_status)
	{
		return true;
	}
	else
		return false;
}
public boolean delete(String desc,Route r)
{
	deletehandler d_handler=new deletehandler();
	boolean delete_status=d_handler.deleteroute(desc, r);
	if(delete_status)
	{
		return true;
	}
	else
		return false;
}
}
