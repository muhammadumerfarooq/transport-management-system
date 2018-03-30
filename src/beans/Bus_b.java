package beans;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import model.Driver;
import model.Route;

public class Bus_b {
	private StringProperty id;
	private StringProperty chasisnumber;
	private ObjectProperty<Driver> driver;
	private ObjectProperty<Route> route;
	public final StringProperty idProperty() {
		return this.id;
	}
	
	public final String getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	
	public final StringProperty chasisnumberProperty() {
		return this.chasisnumber;
	}
	
	public final String getChasisnumber() {
		return this.chasisnumberProperty().get();
	}
	
	public final void setChasisnumber(final String chasisnumber) {
		this.chasisnumberProperty().set(chasisnumber);
	}
	
	public final ObjectProperty<Driver> driverProperty() {
		return this.driver;
	}
	
	public final Driver getDriver() {
		return this.driverProperty().get();
	}
	
	public final void setDriver(final Driver driver) {
		this.driverProperty().set(driver);
	}
	
	public final ObjectProperty<Route> routeProperty() {
		return this.route;
	}
	
	public final Route getRoute() {
		return this.routeProperty().get();
	}
	
	public final void setRoute(final Route route) {
		this.routeProperty().set(route);
	}

	public Bus_b(StringProperty id, StringProperty chasisnumber, ObjectProperty<Driver> driver,
			ObjectProperty<Route> route) {
		super();
		this.id = id;
		this.chasisnumber = chasisnumber;
		this.driver = driver;
		this.route = route;
	}
	
	
}
