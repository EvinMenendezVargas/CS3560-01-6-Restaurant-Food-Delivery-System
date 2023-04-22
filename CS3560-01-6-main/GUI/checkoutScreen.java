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
	
	String cstName = "Ur Mom";	// customer name, current just have something filled in. Will later be replaced with actual customer info
	String cstAddress = "9110 W. Bush St."; 	// address of the customer or where the delivery is to go to. currently filled in temporarily but will be replaced via some events
	
	Label chkOutLabel = new Label("Checkout");	// create a label for checkout
	Label cstDtlLabel = new Label("Customer Details:"); // create a label for customer details
	Label cstNmeLabel = new Label("Name: " + cstName);	// creating a label for customer lame and display the customers name
	Label cstAdsLabel = new Label("Address: " + cstAddress);	// create a label for the target delivery address and display it
	
	Label tempLabel1 = new Label("Cart Item 1");	// temporary filler labels for each of the items in the cart that are going to be displayed
	Label tempLabel2 = new Label("Cart Item 2");	// ^
	Label tempLabel3 = new Label("Cart Item 3");	// ^
	Label tempLabel4 = new Label("Cart Item 4");	// ^
	
	Button confOrder = new Button("Confirm Order");	// button for confirming order, currently place holder. will be stylized another time. Should change to a new scene and display reciept info.
	Button cnclOrder = new Button("Cancel Order");	// button for canceling order. Will close out. Might scrap this and just have edit order button.
	Button editOrder = new Button("Edit Order");	// returns the user back to the order scene where they can add and remove items and return back to the checkout screen after.
	
	
	@Override
	public void start(Stage stage1) {
		Font titleFont = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 70);	// creating a font for titles
		Font detFont = Font.font("Lucida Calligraphy", FontWeight.BOLD, FontPosture.REGULAR, 15);	// creating a font for general detail stuffs
		chkOutLabel.setFont(titleFont);	// title font for this because its the name of the scene we are on.
		cstDtlLabel.setFont(detFont);	// general font for the customer details
		cstNmeLabel.setFont(detFont);	// general font...
		cstAdsLabel.setFont(detFont);	// general font...
		
		// Creating the VBox that will contain all of the items we want to display wit ha padding of 25 between each.
		VBox vb = new VBox(25, chkOutLabel, cstDtlLabel, cstNmeLabel, cstAdsLabel);
		vb.setPadding(new Insets(10));	// padding
		vb.setAlignment(Pos.TOP_CENTER);	// aligning everything to be down the center
		
		vb.getChildren().addAll(tempLabel1, tempLabel2, tempLabel3, tempLabel4);	// adding more things to the Vbox, mainly the placeholder items
		vb.getChildren().addAll(confOrder, cnclOrder, editOrder);	// placing the buttons into the vbox
		
		
		
		// Set the stage
		Scene scene = new Scene(vb, 900, 900);	// creating a scene using the created vbox
		
		// the stuff going into the stage
		stage1.setTitle("Bring back the pacer test standard"); // placeholder name for when we decide to officially name the system.
		stage1.setResizable(false);	// making it so that the use cannot reshape/resize the window.
		
		
		
		
		//setting the scene to the stage
		stage1.setScene(scene);	// setting the scene of the stage
		stage1.show();	// showing the stage with the added scene
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
