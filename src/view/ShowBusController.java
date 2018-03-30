package view;

import ooadproject.OoadProject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar;

import javafx.scene.control.Tab;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Bus;
import model.Driver;
import model.Route;

public class ShowBusController {
	@FXML
	private Tab tabpane;
	@FXML
	private AnchorPane anchorpane1;
	@FXML
	private Pane pane1;
	@FXML
	private TextField busid1_t;
	@FXML
	private TextField cno1_t;
	@FXML
	private ButtonBar buttonbar1;
	@FXML
	private Button save;
	@FXML
	private Button back1;
	@FXML
	private Tab tab2;
	@FXML
	private AnchorPane anchorpane2;
	@FXML
	private Pane pane2;
	@FXML
	private TextField cno2_t;
	@FXML
	private TextField driverid;
	@FXML
	private Button assigndriverbtn;
	@FXML
	private Button back2;
	@FXML
	private Tab tab3;
	@FXML
	private AnchorPane anchorpane3;
	@FXML
	private TextField cno3_t;
	@FXML
	private TextField routeidt;
	@FXML
	private Button assignroutebtn;
	@FXML
	private Button back3;
	 @FXML
	    private void action_adddriver(javafx.event.ActionEvent ev) throws NumberFormatException, ClassNotFoundException, InstantiationException, IllegalAccessException
	    {
	    Bus b=new Bus();
	    b.setId(busid1_t.getText());
	    b.setChasisnumber(cno1_t.getText());
	    b.setDriver(driverid.getText());
	    b.setRoute(routeidt.getText());
	    boolean isreg=b.save(b);
        if(isreg==true)
        {
    		Alert alert=new Alert(AlertType.INFORMATION);
    		alert.setTitle("Information Dialogbox");
    		alert.setContentText("DRIVER HAS BEEN ADDED");
    		alert.showAndWait();	
    		busid1_t.setText("");
    		cno1_t.setText("");
    		driverid.setText("");
    		routeidt.setText("");
        }
        else
        {
        	Alert alert=new Alert(AlertType.ERROR);
    		alert.setTitle("SYNTAX ERROR");
    		alert.setContentText("");
    		alert.showAndWait();
    		
        }
     
	    }

	    @FXML
	    private void action_back(javafx.event.ActionEvent ev)
	    {
	    	try {
	    	    ((Node)ev.getSource()).getScene().getWindow().hide();
	    		FXMLLoader fxmlLoader = new FXMLLoader();
	            Pane root1 = fxmlLoader.load(OoadProject.class.getResource("/view/Menu.fxml").openStream());
	            Stage stage = new Stage();
	            stage.setScene(new Scene(root1));  
	            stage.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }

}
