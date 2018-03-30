package database;

import model.Fee;
import model.Salary;

public class updatehandler {
private String query;
private dbhandler connection;
public updatehandler()
{
	connection=dbhandler.getinstance();
	query="";
}
public boolean updatecustomerfee(int personid,Fee f)
{
	boolean isupdate;
	query = "UPDATE `ooadproject`.`fee` "
            + " SET "
            + " `amount` = '" + f.getAmount()+ "'"
            + ",`startdate` = '" + f.getStartdate()+ "'"
            + ",`enddate` = '" + f.getEnddate()+ "'"
            + " WHERE c_id = " + personid;
	try {
		isupdate=connection.update_query(query);
		return isupdate;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
public boolean updatedriverpay(int personid,Salary s)
{
	boolean isupdate;
	query = "UPDATE `ooadproject`.`salary` "
            + " SET "
            + " `pay` = '" + s.getAmount()+ "'"
            + ",`datepaid` = '" + s.getStartdate()+ "'"
            + " WHERE id = " + personid;
	try {
		isupdate=connection.update_query(query);
		return isupdate;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
}
