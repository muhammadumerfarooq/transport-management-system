package database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
public class dbhandler {
private String db_url;
private String db_name;
private String db_connectiondriver;
private String  db_username;
private String db_password;
private Connection conn;
private Statement statement;
private ResultSet resultset;
public dbhandler()
{
	db_url="jdbc:mysql://localhost:3306/";
	db_name="ooadproject";
	db_connectiondriver="com.mysql.jdbc.Driver";
	db_username="root";
	db_password="root";
}

private static dbhandler instance=null;
public static dbhandler getinstance()
{
	if(instance==null)
	{
		instance=new dbhandler();
		instance.db_url="jdbc:mysql://localhost:3306/";
		instance.db_name="ooadproject";
		instance.db_connectiondriver="com.mysql.jdbc.Driver";
		instance.db_username="root";
		instance.db_password="root";
		
	}
	return instance;
}
private boolean openconnection()throws ClassNotFoundException, InstantiationException, IllegalAccessException 
{
	try {
		Class.forName(db_connectiondriver).newInstance();
		conn=DriverManager.getConnection(db_url + db_name,db_username,db_password);
		statement=conn.createStatement();
		return true;
	} catch (SQLException | ClassNotFoundException | NullPointerException | InstantiationException | IllegalAccessException ex) {
        Logger.getLogger(dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        
	}
	return false;
}
public boolean insert_query(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	try {
		if(openconnection()==false)
		{
			return false;
			
		}
		int val=statement.executeUpdate(query);
		if(val!=0)
		{
			return true;
		}
		
	} catch (SQLException | NullPointerException ex) {
        Logger.getLogger(dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        }
	return false;

}
public boolean delete_query(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	try {
		if(openconnection()==false)
		{
			return false;
			
		}
		int val=statement.executeUpdate(query);
		if(val!=0)
		{
			return true;
		}
		
	} catch (SQLException | NullPointerException ex) {
        Logger.getLogger(dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        }
	return false;

}
public boolean update_query(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	try {
		if(openconnection()==false)
		{
			return false;
			
		}
		int val=statement.executeUpdate(query);
		if(val!=0)
		{
			return true;
		}
		
	} catch (SQLException | NullPointerException ex) {
        Logger.getLogger(dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        }
	return false;

}
public ResultSet select_query(String query) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
{ResultSet rst1=null;
	try {
		if(openconnection()==false)
		{
			return null;
			
		}
		rst1=statement.executeQuery(query);
		return rst1;
	} catch (SQLException ex) {
        Logger.getLogger(dbhandler.class.getName()).log(Level.SEVERE, null, ex);
        }
	rst1.close();
	statement.close();
	return null;

}

}