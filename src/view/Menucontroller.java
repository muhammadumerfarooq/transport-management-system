package view;

import ooadproject.OoadProject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menucontroller {

    @FXML
    private AnchorPane anchorpane_1;

    @FXML
    private Label mainmenulabel;
    
    @FXML
    private GridPane gridpanelabel;

    @FXML
    private Button managecustomerbutton;

    @FXML
    private Button managedriverbutton;

    @FXML
    private Button managebusbutton;

    @FXML
    private Button manageroutebutton;

    @FXML
    private Label c_label;

    @FXML
    private Label d_label;

    @FXML
    private Label b_label;

    @FXML
    private Label r_label;

    @FXML
    private Group group;

    @FXML
    private Button signout;

    @FXML
    private ImageView logoutimg;
    
    @FXML
    private void action_cust(javafx.event.ActionEvent ev)
    {
    	try{

    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader(OoadProject.class.getResource("/view/ShowCustomer.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception");
    	}
    }
    @FXML
    private void action_driver(javafx.event.ActionEvent ev)
    {
    	try{

    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader(OoadProject.class.getResource("/view/ShowDiver.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception");
    	}
    }
    @FXML
    private void action_bus(javafx.event.ActionEvent ev)
    {
    	try{

    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader(OoadProject.class.getResource("/view/ShowBus.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception");
    	}
    }
    @FXML
    private void action_route(javafx.event.ActionEvent ev)
    {
    	try{
    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader(OoadProject.class.getResource("/view/ShowRoute.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception");
    	}
    }
    @FXML
    private void action_signout(javafx.event.ActionEvent ev)
    {
    	try {
    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader();
           FlowPane root1 = fxmlLoader.load(OoadProject.class.getResource("/view/Login.fxml").openStream());
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
