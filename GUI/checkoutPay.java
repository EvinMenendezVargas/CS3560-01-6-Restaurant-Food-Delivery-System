package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.shape.*;
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
import javafx.scene.layout.*;
import javafx.scene.control.ChoiceBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.text.*;
import java.text.DecimalFormat;


public class checkoutPay extends Application {
	
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
	
	///// MAKING SHIT
	int qnty = 1;
	String fdItm = "Buttplug";
	double itmPrc = 420.69;
	
	Rectangle rvwOdrBox = new Rectangle(100, 125, 300, 400);
	Text rvwOdrTtl = new Text(135, 175, "Review Order");
	Text fdItmDesc = new Text(135, 200, qnty + "\t" + fdItm);	// food item listed in the review order section.
	Text fdItmPrce = new Text(270, 200, "$" + itmPrc);	// food item listed in the review order section.
	Line rvwOdrLne = new Line(125, 460, 375, 460);
	Text odrTtlTxt = new Text(135, 490, "Order Total:");
	
	@Override
	public void start(Stage stage1) {
		
		// Creating the root that we will add things to.
		Group root = new Group();
		Scene scene = new Scene(root, 900, 900);	// placing root into the scene
		
		Font rvwOdrTtlFont = Font.font("Calibri", FontWeight.BOLD, FontPosture.ITALIC, 18);	// creating a font for titles
		Font odrTtlTxtFont = Font.font("System", FontWeight.BOLD, FontPosture.ITALIC, 14);	// creating a font for titles
		
		//Setting up the fancy border for review order
		rvwOdrTtl.setFont(rvwOdrTtlFont);
		rvwOdrBox.setFill(Color.WHITE);
		rvwOdrBox.setStroke(Color.BLACK);
		root.getChildren().add(rvwOdrBox);
		
		//Setting up a title text for the review order box
		root.getChildren().add(rvwOdrTtl);
		
		//Setting up a filler food item and price text. (Create one for each item in the order with a spacing of 20.)
		//root.getChildren().add(fdItmDesc); root.getChildren().add(fdItmPrce);
			//this portion for the items and pricings and things can be changed. (and should be)
			// as an example. lets say the customer ordered three different items. 1 dildo, buttplug, and 2 vibrators
			// test variables lines 85-87
		String[] itemOrdered = {"Dildo", "Buttplug", "Vibrator"}; // should be 3 strings for the 3 different items
		int[] qntyOfItem = {1, 1, 2};	// should be 3 values for the 3 different items
		double[] itmPrcs = {420.00, 0.69, 420.69};	// should be 3 different doubles for 3 different items
		
		
		/*
		int numOfDiffItemsOrdered = 10; // Change this value to represent the actual number of different items ordered from the data table.
		String[] itemOrdered = new String[numOfDiffItemsOrdered]; // should be 3 strings for the 3 different items
		int[] qntyOfItem = new int[numOfDiffItemsOrdered];	
		double[] itmPrcs = new double[numOfDiffItemsOrdered];
		// for loop for adding all of the ordered items details into their appropriate arrays. This could be combined with the Text Array generating loop too. But for readability i kept it separate.
		for(int i = 0; i < numOfDiffItemsOrdered; i++) {
			itemOrdered[i] = itemName;	// each i value of an array represents an item. Thus this is item i's name. Example first item is "Dildo"
			qntyOfItem[i] = qntyOrderedOfItem; // the amount of item i that was ordered. Example first item quantity is 1
			itmPrcs[i] = itemiPrice;	// the price of item i in the order. Example the price of the first item is 420.00
		}
		*/
		
			// for loop that will then add each of the details of the orders into the box/list
		int pixelY = 200;	// we start placing texts at pixels (135, 200) and (270, 200)
		int numOfDiffFdItms = itemOrdered.length; // the number of diff items we have ordered
		Text[] fdItmArr = new Text[numOfDiffFdItms];
		Text[] fdItmPrcArr = new Text[numOfDiffFdItms];
		DecimalFormat df = new DecimalFormat("0.00");
		int subTtlD = 0;	// calculating the subtotal here since we are already looping through the costs.
		double cost = 0;
		for(int i = 0; i < numOfDiffFdItms; i++) {
			fdItmArr[i] = new Text(135, pixelY, qntyOfItem[i] + "\t" + itemOrdered[i]);
			cost = qntyOfItem[i]*itmPrcs[i];
			subTtlD += cost;
			fdItmPrcArr[i] = new Text(270, pixelY, "$" + df.format(cost));
			root.getChildren().add(fdItmArr[i]); root.getChildren().add(fdItmPrcArr[i]);
			pixelY += 20;
		}
		
		
		//Setting up subtotal, tax, and delivery fee text boxes.
		Font feesFont = Font.font("System", FontWeight.BOLD, FontPosture.ITALIC, 12);
		Text subTtlTxt = new Text(135, 410, "Subtotal:");
		subTtlTxt.setWrappingWidth(127);
		subTtlTxt.setTextAlignment(TextAlignment.RIGHT);
		subTtlTxt.setFont(feesFont);
		Text taxTtlTxt = new Text(135, 430, "Tax:");
		taxTtlTxt.setWrappingWidth(127);
		taxTtlTxt.setTextAlignment(TextAlignment.RIGHT);
		taxTtlTxt.setFont(feesFont);
		Text delTtlTxt = new Text(135, 450, "Delivery Fee:");
		delTtlTxt.setWrappingWidth(127);
		delTtlTxt.setTextAlignment(TextAlignment.RIGHT);
		delTtlTxt.setFont(feesFont);
		
		Text subTtlFee = new Text(270, 410, "$" + df.format(subTtlD));
		double taxFee = subTtlD*0.0725;
		Text taxTtlFee = new Text(270, 430, "$" + df.format(taxFee));
		double delFee = 5.69;	// just for now. might be calculated differently later.
		Text delTtlFee = new Text(270, 450, "$" + df.format(delFee));
		
		root.getChildren().addAll(subTtlTxt, taxTtlTxt, delTtlTxt);
		root.getChildren().addAll(subTtlFee, taxTtlFee, delTtlFee);
		
		
		//Setting up the line in the review box
		root.getChildren().add(rvwOdrLne);
		
		//Setting up the Text for order total and the amount
		odrTtlTxt.setFont(odrTtlTxtFont);
		Text ttlFeeTxt = new Text(270, 490, "$" + df.format(subTtlD + taxFee + delFee));
		Font ttlFeeTxtFont = Font.font("System", FontWeight.BOLD, FontPosture.REGULAR, 14);
		ttlFeeTxt.setFont(ttlFeeTxtFont);
		root.getChildren().addAll(odrTtlTxt, ttlFeeTxt);
		
		
		//Setting up customer info section
		String delAdd = "911 Your Moms St.\nCandice, CA, 42069\nUnited States";
		String nameForOrder = "Deez";
		String phnNum = "(###) ###-####";
		Text cstInfTxt = new Text(500, 175, "Customer Information");
		cstInfTxt.setFont(rvwOdrTtlFont); 	// has the same font as review order section
		Text cstNamTxt = new Text(500, 200, "Order Name:\t" + nameForOrder);	//i wanted to change it to this incase a person doesnt want their actual name on the order. or have a preferred nickname or something
		Text cstNumTxt = new Text(500, 220, "Phone Number:\t" + phnNum);
		Text delAddTxt = new Text(500, 240, "Delivering to:\n" + delAdd); 
		
		root.getChildren().addAll(cstInfTxt, cstNamTxt, cstNumTxt, delAddTxt);
		
		
		//Setting up payment details section
		Text payDetTxt = new Text(0, 599, "Payment Details");
		Font payDetTxtFont = Font.font("Calibri", FontPosture.ITALIC, 18);
		payDetTxt.setFont(payDetTxtFont);
		payDetTxt.setWrappingWidth(900);
		payDetTxt.setTextAlignment(TextAlignment.CENTER);
			// Card Holder Name
		Text crdHldNmeTxt = new Text(135, 615, "Card Holder Name:");	// Creating text for "Card Holder Name:"
		TextField crdHldNme = new TextField("Name on the card");	// Creating textfield for user input with initial text. 
		crdHldNme.setPrefWidth(630);	// formatting the text field width
		crdHldNme.setPrefHeight(25);	// formatting the text field height
		crdHldNme.setLayoutX(135);	// formatting the text field x position
		crdHldNme.setLayoutY(620);	// formatting the text field y position
			// Card Number (same format as lines 177-182)
		Text crdNumTxt = new Text(135, 660, "Card Number:");
		TextField crdNum = new TextField("Long Number on the card");
		crdNum.setPrefWidth(630);
		crdNum.setPrefHeight(25);
		crdNum.setLayoutX(135);
		crdNum.setLayoutY(665);
			// Security Code (same format as lines 177-182)
		Text secCdeTxt = new Text(135, 705, "Security Code:");
		TextField secCde = new TextField("Small Number on the card");
		secCde.setPrefWidth(300);
		secCde.setPrefHeight(25);
		secCde.setLayoutX(135);
		secCde.setLayoutY(710);
			// Expiry Date (same format as lines 177-182)
		Text expDteTxt = new Text(465, 705, "Expiry Date:");
		TextField expDte = new TextField("Small Number on the card");
		expDte.setPrefWidth(300);
		expDte.setPrefHeight(25);
		expDte.setLayoutX(465);
		expDte.setLayoutY(710);
			// Zip/Postal code (same format as lines 177-182)
		Text zipCdeTxt = new Text(135, 750, "Zip/Postal Code:");
		TextField zipCde = new TextField("Zip code or postal code");
		zipCde.setPrefWidth(300);
		zipCde.setPrefHeight(25);
		zipCde.setLayoutX(135);
		zipCde.setLayoutY(755);
			// placing all the stuff onto the root to then be shown on the stage.
		root.getChildren().addAll(payDetTxt, crdHldNmeTxt, crdHldNme, crdNumTxt, crdNum, secCdeTxt, secCde, expDteTxt, expDte, zipCdeTxt, zipCde);
		
		
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
