package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ChoiceBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class checkoutScreen extends Application {
	
	String cstName = "Ur Mom";
	String cstAddress = "9110 W. Bush St.";
	
	Label chkOutLabel = new Label("Checkout");
	Label cstDtlLabel = new Label("Customer Details:");
	Label cstNmeLabel = new Label("Name: " + cstName);
	Label cstAdsLabel = new Label("Address: " + cstAddress);
	
	Label tempLabel1 = new Label("Cart Item 1");
	Label tempLabel2 = new Label("Cart Item 2");
	Label tempLabel3 = new Label("Cart Item 3");
	Label tempLabel4 = new Label("Cart Item 4");
	
	Button confOrder = new Button("Confirm Order");
	Button cnclOrder = new Button("Cancel Order");
	Button editOrder = new Button("Edit Order");
	
	
	@Override
	public void start(Stage stage1) {
		Font titleFont = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 70);
		Font detFont = Font.font("Lucida Calligraphy", FontWeight.BOLD, FontPosture.REGULAR, 15);
		chkOutLabel.setFont(titleFont);
		cstDtlLabel.setFont(detFont);
		cstNmeLabel.setFont(detFont);
		cstAdsLabel.setFont(detFont);
		
		
		VBox vb = new VBox(25, chkOutLabel, cstDtlLabel, cstNmeLabel, cstAdsLabel);
		vb.setPadding(new Insets(10));
		vb.setAlignment(Pos.TOP_CENTER);
		
		vb.getChildren().addAll(tempLabel1, tempLabel2, tempLabel3, tempLabel4);
		vb.getChildren().addAll(confOrder, cnclOrder, editOrder);
		
		
		
		// Set the stage
		Scene scene = new Scene(vb, 900, 900);
		
		// the stuff going into the stage
		stage1.setTitle("Bring back the pacer test standard"); // can change this to something else
		stage1.setResizable(false);
		
		
		
		
		//setting the scene to the stage
		stage1.setScene(scene);	// setting the scene of the stage
		stage1.show();	// showing the stage with the added scene
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
