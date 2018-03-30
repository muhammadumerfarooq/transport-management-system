//package controller;
//
//import java.io.IOException;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.FlowPane;
//import javafx.stage.Stage;
//import view.Logincontroller;
//
//public class App extends Application {
//
//	
//	private Stage primaryStage;
//    private AnchorPane rootLayout;
//  //  private ObservableList<Customer> personData = FXCollections.observableArrayList();
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//	this.primaryStage=primaryStage;
//	this.primaryStage.setTitle("LOGIN");
//	/*Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
//	Scene scene=new Scene(root);
//	this.primaryStage.setScene(scene);
//	this.primaryStage.show();
//	showPersonOverview();
//	r();*/
//	initRoot();
//	}
//	
//public void initRoot()
//{
//	
//	try {
//         // Load root layout from fxml file.
//         FXMLLoader loader = new FXMLLoader(App.class.getResource("/view/Login.fxml"));
//       FlowPane pane=loader.load();
//         Logincontroller controller=loader.getController();
//         controller.setApp(this);
//         
//         
//         // Show the scene containing the root layout.
//         Scene scene = new Scene(pane);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//         //LoginController controller = loader.getController();
//        //controller.setmainapp(this);
//    
//	} catch (IOException e) {
//         e.printStackTrace();
//     }
//	
//}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}
