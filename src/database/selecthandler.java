package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import model.Fee;
import util.CUtility;

public class selecthandler {
private String query;
private dbhandler connection;
private CUtility util;
public selecthandler()
{
	connection=dbhandler.getinstance();
	query="";
	util=new CUtility();
}
public ResultSet selectcustomer(int personid) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
{
	String query="SELECT c.c_name,f.amount,c.dateregistered from ooadproject.customer c inner join ooadproject.fee f on c.customerid=f.c_id where c.customerid="+personid;
	ResultSet rst=null;
	rst=connection.select_query(query);

	try{
	return rst;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Hello");
	}
	finally{
		//rst2.close();	
	}
	return null;
}


}
