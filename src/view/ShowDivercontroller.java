package view;

import java.util.Optional;

import ooadproject.OoadProject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Customer;
import model.Driver;
import model.Fee;
import model.Salary;

public class ShowDivercontroller {

    @FXML
    private TabPane tabpane;

    @FXML
    private Tab tab1;

    @FXML
    private AnchorPane anchorpane1;

    @FXML
    private GridPane gridpane1;

    @FXML
    private TextField driver_idt;

    @FXML
    private TextField name_t;

    @FXML
    private TextField cnic_t;

    @FXML
    private TextField licenseno_t;

    @FXML
    private ButtonBar buttonbar_1;

    @FXML
    private Button save;

    @FXML
    private Button back_1;

    @FXML
    private Tab tab2;

    @FXML
    private AnchorPane anchorpane2;

    @FXML
    private Pane pane2;

    @FXML
    private TextField driverid_deletet;

    @FXML
    private ButtonBar buttonbar2;

    @FXML
    private Button deletebton;

    @FXML
    private Button back_delete;

    @FXML
    private Tab tav3;

    @FXML
    private AnchorPane anchorpane3;

    @FXML
    private Pane pane3;

    @FXML
    private TextField driverid_t3;

    @FXML
    private TextField salary_t3;

    @FXML
    private TextField date_t3;

    @FXML
    private ButtonBar buttonbar3;

    @FXML
    private Button update_button;

    @FXML
    private Button back3;
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
    @FXML
    private void action_adddriver(javafx.event.ActionEvent ev) throws NumberFormatException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
    	Driver d=new Driver();
    	d.setPersonID(Integer.parseInt(driver_idt.getText()));
    	d.setName(name_t.getText());
    	d.setCNIC(cnic_t.getText());
    	d.setLicensenumber(licenseno_t.getText());
    	boolean isreg=d.save(Integer.parseInt(driver_idt.getText()),d);
        if(isreg==true)
        {
    		Alert alert=new Alert(AlertType.INFORMATION);
    		alert.setTitle("Information Dialogbox");
    		alert.setContentText("DRIVER HAS BEEN ADDED");
    		alert.showAndWait();	
    		driver_idt.setText("");
    		name_t.setText("");
    		cnic_t.setText("");
    		licenseno_t.setText("");
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
    private void action_delete(javafx.event.ActionEvent ev)
    {
    	Driver d=new Driver();
    	String d_id=driverid_deletet.getText();
    	
    	
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Are you sure you want to delete the driver details?");
    	Optional <ButtonType> action=alert.showAndWait();
    	if(action.get()==ButtonType.OK)
    	{
    		
    		
    		d.delete(Integer.parseInt(d_id),d);	
    		Alert alert1=new Alert(AlertType.INFORMATION);
    		alert1.setContentText("DRIVER HAS BEEN DELETED");
    		alert1.showAndWait();
    		driverid_deletet.setText("");
    		
    	}
    		else
    		{
    			driverid_deletet.setText("");
    			//Alert alert1=new Alert(AlertType.ERROR);
    			//alert.setTitle("ID DOES NOT EXIST");
    			//alert.setContentText("");
    			//alert.showAndWait();
    		}
    	
    }
    @FXML
    private void action_update(javafx.event.ActionEvent ev)
    {
    	Driver d=new Driver();
    	Salary s=new Salary(Float.parseFloat(salary_t3.getText()),date_t3.getText(),date_t3.getText());
    	s.setAmount(Float.parseFloat(salary_t3.getText()));
    	s.setStartdate(date_t3.getText());
    	s.setEnddate(date_t3.getText());
    	int c_id=Integer.parseInt(driverid_t3.getText());
    	if(d.updatesalary(c_id, s))
    	{
    	Alert alert1=new Alert(AlertType.INFORMATION);
		alert1.setContentText("SALARY HAS BEEN UPDATED");
		alert1.showAndWait();
		driverid_t3.setText("");
		salary_t3.setText("");
		date_t3.setText("");
    	}
    	else
    	{
    		Alert alert1=new Alert(AlertType.ERROR);
    		alert1.setContentText("DRIVER ID DOES NOT EXIST");
    		alert1.showAndWait();
    		driverid_t3.setText("");
    		salary_t3.setText("");
    		date_t3.setText("");
        
    		 	}
    }

}
