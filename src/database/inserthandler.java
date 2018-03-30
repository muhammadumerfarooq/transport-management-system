package database;
import util.*;
import util.CUtility;
import util.CodeGeneration;
import model.*;
public class inserthandler {
private String query;
private dbhandler connection;
private CodeGeneration codegen;
private CUtility codeutil;
public inserthandler()
{
	connection=dbhandler.getinstance();
	query="";
	codegen=CodeGeneration.getInstance();
	codeutil=new CUtility();
	
}

public boolean insertcustomer(int personid,Customer c) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	boolean isinserted;
	query="INSERT INTO ooadproject.customer "
            + " VALUES "
             + " ('" + personid + "', '" +c.getName() +"', '" +c.getAddress()+"', '" +c.getDob()+"', '" +c.getEmail()+"', '" +c.getPhonenumber()+"', '" +c.getRollnumber()+"', '" +c.getDateregistered()+"');";
	System.out.println(query);
        isinserted=connection.insert_query(query);
	return isinserted;
}
public boolean insertdriver(int personid,Driver d) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	boolean isinserted;
	query="INSERT INTO ooadproject.driver \n"
            + " VALUES \n"
             + " ('" + personid + "', '" +d.getName() +"', '" +d.getCNIC()+"', '"+d.getLicensenumber()+"');";
	isinserted=connection.insert_query(query);
	return isinserted;
}
public boolean insertroute(int routeid,Route r) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	boolean isinserted;
	query="INSERT INTO ooadproject.route \n"
            + " VALUES \n"
             + " ('" + routeid + "', '" +r.getDescription()+"');";
	isinserted=connection.insert_query(query);
	return isinserted;
}
public boolean insertbus(Bus b) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	boolean isinserted;
	query="INSERT INTO ooadproject.bus \n"
            + " VALUES \n"
             + " ('" + b.getId() +"', '" +b.getChasisnumber() +"', '"+b.getdriver1() +"', '" +b.getroute1()+"');";
	isinserted=connection.insert_query(query);
	return isinserted;
}

}
