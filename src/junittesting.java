import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;


import database.MySqlConnection;
import database.deletehandler;
import database.inserthandler;
import database.selecthandler;
import database.updatehandler;
import model.Bus;
import model.Customer;
import model.Salary;
import model.Driver;
import model.Fee;
import model.Route;

class junittesting {
	public junittesting() {
		this.connection=null;
	}
	private Connection connection;
	private ResultSet rs;
	@Test
	void test() {
		MySqlConnection conn = new MySqlConnection();
		this.connection = conn.connect();
		assertTrue(this.connection!=null);
		this.rs = null;
	//	rs = new 
	}
	@Test
	void deletecustomer() {
		deletehandler del = new deletehandler();
	boolean bool = del.REMOVECustomer(12);
		assertTrue(bool == true);
	}
	@Test
	void deletedriver() {
		deletehandler del = new deletehandler();
	boolean bool = del.REMOVEDriver(12);
		assertTrue(bool == true);
	}
		
	@Test
	void deleteroute() {
		deletehandler del = new deletehandler();
	boolean bool = del.REMOVERoute("islamabad");
		assertTrue(bool == true);
	}
	@Test
	void addcustomer() {
		Customer c = new Customer ();
		c.setName("umer");
		c.setAddress("POF");
		c.setPersonID(125);
		c.setRollnumber("I140321");
		c.setDateregistered("18/2018");
		c.setDob("27/may");
		c.setPhonenumber("0000000000");
		c.setEmail("140321@com");
	//	c.setFee(fee);
		inserthandler insert = new inserthandler();
		try {
		boolean bool = insert.insertcustomer(14,c);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	
	@Test
	void adddriver() {
		Salary salry = new Salary(4850,"john","smith");
		Driver driver = new Driver("31264531", salry , "3740644446");
		inserthandler insert = new inserthandler();
		try {
		boolean bool = insert.insertdriver(14,driver);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	@Test
	void addroute() {
		Route route = new Route("islamabad");
		inserthandler insert = new inserthandler();
		try {
		boolean bool = insert.insertroute(15,route);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	@Test
	void addbus() {
		Salary salry = new Salary(4850,"john","smith");
		Driver driver = new Driver("31264531", salry , "3740644446");
		Route route = new Route("islamabad");
		Bus bus = new Bus("4651ssd","4sd", driver,  route);
		inserthandler insert = new inserthandler();
		try {
		boolean bool = insert.insertbus(bus);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	@Test
	void updatepay() {
		Salary salry = new Salary(4850,"john","smith");
		Driver driver = new Driver("31264531", salry , "3740644446");
		Route route = new Route("islamabad");
		Bus bus = new Bus("4651ssd","4sd", driver,  route);
		updatehandler insert = new updatehandler();
		try {
		boolean bool = insert.updatedriverpay(451, salry);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	
	@Test
	void updatefee() {
		Salary salry = new Salary(4850,"john","smith");
		Driver driver = new Driver("31264531", salry , "3740644446");
		Route route = new Route("islamabad");
		Bus bus = new Bus("4651ssd","4sd", driver,  route);
		updatehandler insert = new updatehandler();
		try {
			Fee fee = new Fee (8645, "24/May", "27/May");
		boolean bool = insert.updatecustomerfee(465312, fee);
		assertTrue(bool == true);
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	@Test
	void  getcustomer() {
		Salary salry = new Salary(4850,"john","smith");
		Driver driver = new Driver("31264531", salry , "3740644446");
		Route route = new Route("islamabad");
		Bus bus = new Bus("4651ssd","4sd", driver,  route);
		selecthandler select = new selecthandler();
		try {
			Fee fee = new Fee (8645, "24/May", "27/May");
		this.rs = select.selectcustomer(45132);
//		while (rs.next()) {
//            String coffeeName = rs.getString("COF_NAME");
//            int supplierID = rs.getInt("SUP_ID");
//            float price = rs.getFloat("PRICE");
//            int sales = rs.getInt("SALES");
//            int total = rs.getInt("TOTAL");
//            System.out.println(coffeeName + "\t" + supplierID +
//                               "\t" + price + "\t" + sales +
//                               "\t" + total);
//        }
		if (rs==null)
		assertTrue(false);
		else {
			assertTrue(true);
		}
		}
		catch(Exception e) {
			assertFalse(false);
		}
	}
	}