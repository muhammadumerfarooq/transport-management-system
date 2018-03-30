package beans;

import javafx.beans.property.StringProperty;

public class Route_b {
	private StringProperty description;

	public final StringProperty descriptionProperty() {
		return this.description;
	}
	

	public final String getDescription() {
		return this.descriptionProperty().get();
	}
	

	public final void setDescription(final String description) {
		this.descriptionProperty().set(description);
	}


	public Route_b(StringProperty description) {
		super();
		this.description = description;
	}
	
	
}
