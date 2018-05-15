package database;
import java.sql.*;
import java.util.Properties;

public class MySqlConnection {

private Connection conn;
private Statement statement;
private ResultSet res;

public MySqlConnection()
{
	this.conn=null;
	this.statement=null;
	this.res=null;
}

public static Connection connect()
{
	try {
		Connection conn = null;
                DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
		System.out.println("trying to get connection!! ");
		conn = DriverManager.getConnection("jdbc:mysql://" + "localhost"
				+ ":" + 3306 + "/" +"ooadproject", "root","root");
		//statement=conn.createStatement();
                
		System.out.println("Connection achieved...");

		return conn;
}
	catch(Exception e)
	{
		e.printStackTrace();
		return null;
		
	}

}

}
