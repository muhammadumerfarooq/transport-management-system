package view;

import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Customer;
import model.Fee;

public class ShowCustomercontroller {

    @FXML
    private TabPane tabpane;

    @FXML
    private Tab tab1;

    @FXML
    private AnchorPane anchorpane1;

    @FXML
    private GridPane gridpane1;

    @FXML
    private TextField cid_t;

    @FXML
    private TextField cname_t;

    @FXML
    private TextField address_t;

    @FXML
    private TextField dobt;

    @FXML
    private TextField emailt;

    @FXML
    private TextField pno_t;

    @FXML
    private TextField rollnum_t;

    @FXML
    private TextField dateregt;

    @FXML
    private VBox vbox1;

    @FXML
    private ButtonBar buttonbar1;

    @FXML
    private Button save;

    @FXML
    private Button back;

    @FXML
    private Tab deletetab;

    @FXML
    private AnchorPane anchorpane_del;

    @FXML
    private Pane pane_del;

    @FXML
    private TextField rollnum_delt;

    @FXML
    private ButtonBar buttonbar_del;

    @FXML
    private Button delete;

    @FXML
    private Button back_del;

    @FXML
    private Tab updatefeetab;

    @FXML
    private AnchorPane anchorpane3;

    @FXML
    private Pane pane_upd;

    @FXML
    private ButtonBar buttonbar_upd;

    @FXML
    private Button update_button;

    @FXML
    private Button back_upd;

    @FXML
    private Tab retrievetab;

    @FXML
    private TextField update_cid;
    @FXML
    private TextField fee_update;

    @FXML
    private TextField startdate_update;

    @FXML
    private TextField enddate_update;
  
    @FXML
    private TextField retrieve_cid;

    @FXML
    private Button searchbutton;

    @FXML
    private GridPane gridpanesearch;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField feetextfield;

    @FXML
    private TextField dateregtext;

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
    private void action_addcust(javafx.event.ActionEvent ev) throws NumberFormatException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {Customer c=new Customer();
    c.setPersonID(Integer.parseInt(cid_t.getText()));
    c.setName(cname_t.getText());
    c.setAddress(address_t.getText());
    c.setDob(dobt.getText());
    c.setEmail(emailt.getText());
    c.setPhonenumber(pno_t.getText());
    c.setRollnumber(rollnum_t.getText());
    c.setDateregistered(dateregt.getText());
    boolean isreg=c.save(Integer.parseInt(cid_t.getText()),c);
    if(isreg==true)
    {
		Alert alert=new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialogbox");
		alert.setContentText("CUSTOMER HAS BEEN ADDED");
		alert.showAndWait();	
		cid_t.setText("");
		cname_t.setText("");
		address_t.setText("");
		dobt.setText("");
		emailt.setText("");
		pno_t.setText("");
		rollnum_t.setText("");
		dateregt.setText("");
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
    	Customer c=new Customer();
    	String c_id=rollnum_delt.getText();
    	
    	
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setContentText("Are you sure you want to delete the customer details?");
    	Optional <ButtonType> action=alert.showAndWait();
    	if(action.get()==ButtonType.OK)
    	{
    		
    		
    		c.delete(Integer.parseInt(c_id),c);	
    		Alert alert1=new Alert(AlertType.INFORMATION);
    		alert1.setContentText("CUSTOMER HAS BEEN DELETED");
    		alert1.showAndWait();
    		rollnum_delt.setText("");
    		
    	}
    		else
    		{
    			rollnum_delt.setText("");
    			//Alert alert1=new Alert(AlertType.ERROR);
    			//alert.setTitle("ID DOES NOT EXIST");
    			//alert.setContentText("");
    			//alert.showAndWait();
    		}
    	
    }
    @FXML
    private void action_update(javafx.event.ActionEvent ev)
    {
    	Customer c=new Customer();
    	Fee f=new Fee(Float.parseFloat(fee_update.getText()),startdate_update.getText(),enddate_update.getText());
    	f.setAmount(Float.parseFloat(fee_update.getText()));
    	f.setStartdate(startdate_update.getText());
    	f.setEnddate(enddate_update.getText());
    	int c_id=Integer.parseInt(update_cid.getText());
    	if(c.updatecustomerfee(c_id, f))
    	{
    	Alert alert1=new Alert(AlertType.INFORMATION);
		alert1.setContentText("FEE HAS BEEN UPDATED");
		alert1.showAndWait();
		update_cid.setText("");
		fee_update.setText("");
		startdate_update.setText("");
		enddate_update.setText("");
    	}
    	else
    	{
    		Alert alert1=new Alert(AlertType.ERROR);
    		alert1.setContentText("CUSTOMER ID DOES NOT EXIST");
    		alert1.showAndWait();
    		update_cid.setText("");
    		fee_update.setText("");
    		startdate_update.setText("");
    		enddate_update.setText("");	
    	}
    }
    @FXML
    private ResultSet action_search(javafx.event.ActionEvent ev) throws NumberFormatException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
    	ResultSet rs4=null;
    	Customer c=new Customer();
    	rs4=c.searchcustomer(Integer.parseInt(retrieve_cid.getText()));
        
    	try {
    		
    		while(rs4.next())
        	{nametextfield.setText(rs4.getString("c_name"));
			feetextfield.setText(Float.toString(rs4.getFloat("amount")));
			dateregtext.setText(rs4.getString("dateregistered"));
			retrieve_cid.setText("");
			
				}
        	
    	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Idhr ayi");
		}
    	//feetextfield.setText();
    	//dateregtext.setText();
finally{
    	//rs2.close();
}
    	return null;
    }
}
