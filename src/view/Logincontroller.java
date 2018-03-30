package view;
import model.*;
import ooadproject.OoadProject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Logincontroller {
	Manager m=new Manager();
	 @FXML
	    private Button exitbtn;

	    @FXML
	    private DialogPane dialogpane1;

	    @FXML
	    private ImageView imgview;
    @FXML
    private AnchorPane anchorpane;

    @FXML
    private Label userlabel;

    @FXML
    private Label passwordlabel;

    @FXML
    private TextField usertextfield;

    @FXML
    private TextField passwordtextfiel;

    @FXML
    private Button loginbutton;

    @FXML
    private Label title;

    @FXML
    private Label invalid;
    
    private OoadProject ap;
    public void setApp(OoadProject ap)
    {
    	this.ap=ap;
    }
    @FXML
    private void exit(javafx.event.ActionEvent ev)
    { ((Node)ev.getSource()).getScene().getWindow().hide();
    }
    
    @FXML
    private void login_action(javafx.event.ActionEvent ev)
    {
    		try{
    			if(m.islogin(usertextfield.getText(), passwordtextfiel.getText()))
    	    	{
    	    ((Node)ev.getSource()).getScene().getWindow().hide();
    		FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root1 = fxmlLoader.load(OoadProject.class.getResource("/view/Menu.fxml").openStream());
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
            invalid.setVisible(false);
            usertextfield.setText("");
            passwordtextfiel.setText("");
    	    	}
            else
            {
                usertextfield.setText("");
                passwordtextfiel.setText("");
                invalid.setVisible(true);
             	
             	}
    		}
    		
    		catch(Exception e)
    		{
    			
    		}
    	}
    }


