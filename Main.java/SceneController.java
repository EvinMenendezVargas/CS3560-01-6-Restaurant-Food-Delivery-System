package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class SceneController {

	private Stage stage;
	
	private Scene scene;
	
	private Parent root;
	
	// Scene1Controller.fxml = Welcome screen
	// Scene2Controller.fxml = Main Menu scene
	
	public void goScene1(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene1Controller.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void goMainMenu(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene2Controller.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void goAdminLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AdminLoginScene.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	
	public void goDeliveryStatus(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("DeliveryStatusScene.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void goCheckoutPayment(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CheckoutPaymentScreen.fxml"));
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
}
