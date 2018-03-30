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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Driver;
import model.Route;

public class ShowRoutecontroller {

    @FXML
    private AnchorPane anchorpane1;

    @FXML
    private Pane pane1;

    @FXML
    private TextArea routedescription;

    @FXML
    private TextField routeid_textfield;

    @FXML
    private ButtonBar buttonbar;

    @FXML
    private Button save;

    @FXML
    private Button delete;

    @FXML
    private Button back;
    @FXML
    private TextField desctextfield;
    @FXML
    private void action_addroute(javafx.event.ActionEvent ev) throws NumberFormatException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
    	Route r=new Route();
    	r.setDescription(desctextfield.getText());
    	boolean isreg=r.save(Integer.parseInt(routeid_textfield.getText()), r);
        if(isreg==true)
        {
    		Alert alert=new Alert(AlertType.INFORMATION);
    		alert.setTitle("Information Dialogbox");
    		alert.setContentText("NEW ROUTE HAS BEEN ADDED");
    		alert.showAndWait();
    		routeid_textfield.setText("");
    		desctextfield.setText("");
        }
        else
        {
        	Alert alert=new Alert(AlertType.ERROR);
    		alert.setTitle("SYNTAX ERROR");
    		routeid_textfield.setText("");
    		desctextfield.setText("");
    		
        }
        
    }
    @FXML
    private void action_delete(javafx.event.ActionEvent ev)
    {
    	Route r=new Route();
    	String routeid=routeid_textfield.getText();
    	String desc=desctextfield.getText();
    	
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Are you sure you want to delete the route details?");
    	Optional <ButtonType> action=alert.showAndWait();
    	if(action.get()==ButtonType.OK)
    	{
    		r.delete(desc, r);
    		Alert alert1=new Alert(AlertType.INFORMATION);
    		alert1.setContentText("ROUTE HAS BEEN DELETED");
    		alert1.showAndWait();
    		routeid_textfield.setText("");
    		desctextfield.setText("");
    		
    	}
    		else
    		{
    			routeid_textfield.setText("");
        		desctextfield.setText("");
        		
    			//Alert alert1=new Alert(AlertType.ERROR);
    			//alert.setTitle("ID DOES NOT EXIST");
    			//alert.setContentText("");
    			//alert.showAndWait();
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
