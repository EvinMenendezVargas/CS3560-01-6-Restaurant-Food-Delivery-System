package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ChoiceBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class CS3650_GUI_Design extends Application {
	public Button orderButton = new Button("Place Order"); // Create buttons for the 'order', 'add', 'plus', 'minus',
															// 'back', and 'pay' functions
	public Button addButton = new Button("Add to Order");
	public Button plusButton = new Button("+");
	public Button minusButton = new Button("-");
	public Button backButton = new Button("Back");
	public Button payButton = new Button("Pay Now");

	public TextField countField = new TextField("0"); // Create textfield 'countfield'

	public int value = 0; // Set int 'value' to 0

	public Label resTitle = new Label("Welcome to Tony's Ponies!"); // create labels for different parts of the GUI
	public Label nameTitle = new Label("Tony's Ponies");
	public Label menuTitle = new Label("MENU");
	public Label orderTitle = new Label("Your Order");
	public Label appetizerTitle = new Label("Appetizers");
	public Label entreeTitle = new Label("Entrees");
	public Label foodName = new Label("Food Item");
	public Label foodPrice = new Label("$ Price");
	public Label foodDesc = new Label("Item Description");
	public Label subTotal = new Label("Subtotal: ");
	public Label totalCharge = new Label("$ Total: ");

	public ChoiceBox<String> appetizers = new ChoiceBox<>(); // Create ChoiceBox for appetizers and entrees
	public ChoiceBox<String> entrees = new ChoiceBox<>();

	@Override
	public void start(Stage primaryStage) {

		VBox titleBox = new VBox(450, resTitle, orderButton); // Create VBox titleBox
		titleBox.setPadding(new Insets(10));
		titleBox.setAlignment(Pos.TOP_CENTER);

		Scene scene = new Scene(titleBox, 900, 900);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Restaurant Name");
		primaryStage.show();

		orderButton.setOnAction(showMenuScene -> {
			orderButton.setVisible(false);
			resTitle.setVisible(false);

			Image food = new Image("C:\\Users\\Menen\\Downloads\\1579893.jpg"); // import the image to be used for food
			ImageView foodImage = new ImageView(food);

			Image threebar = new Image("C:\\Users\\Menen\\Downloads\\344013-200.png"); // import the image used for the
																						// three bar
			ImageView threebarImage = new ImageView(threebar);

			Image cart = new Image("C:\\Users\\Menen\\Downloads\\istockphoto-1206806317-612x612.jpg"); // setFitWidth
																										// and
																										// setFitHeight
																										// for view,
																										// view, and
																										// view2
			ImageView cartImage = new ImageView(cart);

			foodImage.setFitWidth(100); // Create gridpane and set padding and gaps
			foodImage.setFitHeight(100);
			threebarImage.setFitWidth(50);
			threebarImage.setFitHeight(50);
			cartImage.setFitWidth(50);
			cartImage.setFitHeight(50);

			GridPane gridpane = new GridPane(); // Create gridpane and set padding and gaps
			gridpane.setPadding(new Insets(10));
			gridpane.setHgap(20);
			gridpane.setVgap(20);

			plusButton.setPrefSize(30, 30); // setPrefSize for plus and minus button
			minusButton.setPrefSize(30, 30);

			countField.setPrefSize(30, 30); // setPrefSize for countfield

			minusButton.setOnAction(removeItem -> {
				value = Integer.parseInt(countField.getText()); // The minus button will reduce value by 1 unless value
																// is less than or equal to 0
				if (value <= 0) {
					countField.setText(Integer.toString(value + 0));
				} else {
					countField.setText(Integer.toString(value - 1));
				}
			});

			plusButton.setOnAction(addItem -> {
				value = Integer.parseInt(countField.getText());
				countField.setText(Integer.toString(value + 1));
			});

			// Set up intro scene display
			HBox nameBox = new HBox(30, foodName, foodPrice);
			HBox addingMinus = new HBox(minusButton, countField, plusButton);
			HBox buttonsBox = new HBox(30, addingMinus, addButton);
			VBox descriptionBox = new VBox(10, nameBox, foodDesc, buttonsBox);
			HBox foodBox = new HBox(10, foodImage, descriptionBox);

			// Create a menu bar to be placed at the top
			HBox menuBar = new HBox(250, threebarImage, nameTitle, cartImage);
			menuBar.setAlignment(Pos.TOP_CENTER);

			gridpane.add(foodBox, 2, 1);
			gridpane.setAlignment(Pos.CENTER);

			// Set menu box with food categories under the menu bar
			VBox menuBox = new VBox(25, menuBar, menuTitle, appetizerTitle, gridpane, entreeTitle);
			menuBox.setPadding(new Insets(10));
			menuBox.setAlignment(Pos.TOP_CENTER);

			// Create scene for menu scene
			Scene menuScene = new Scene(menuBox, 900, 900);
			primaryStage.setScene(menuScene);
			primaryStage.show();

			// Shows 3 bars/menu bar which will go to the home page when clicked (not
			// implemented yet)
			threebarImage.setOnMouseClicked(goToHome -> {
				threebarImage.setScaleX(0.10);
			});
			// Shows cart image, goes to show order when clicked
			cartImage.setOnMouseClicked(cartClicked -> {
				VBox orderTab = new VBox(25, orderTitle, backButton);
				orderTab.setPadding(new Insets(10));
				orderTab.setAlignment(Pos.TOP_CENTER);

				// When cart is clicked when empty, shows order with nothing
				Scene emptyOrder = new Scene(orderTab, 900, 900);
				primaryStage.setScene(emptyOrder);
				primaryStage.show();
				// go back to menuScene when back button is pressed
				backButton.setOnAction(backToMenu -> {
					primaryStage.setScene(menuScene);
				});

			});

			addButton.setOnAction(event5 -> {
				Image cart1 = new Image("C:\\Users\\Menen\\Downloads\\istockphoto-1201806395-612x612.jpg");
				// Shows cart with notification
				ImageView cartNotif = new ImageView(cart1);
				cartNotif.setFitWidth(50);
				cartNotif.setFitHeight(50);

				HBox menuBar1 = new HBox(250, threebarImage, nameTitle, cartNotif);
				menuBar1.setAlignment(Pos.TOP_CENTER);

				VBox menuBox1 = new VBox(25, menuBar1, menuTitle, appetizerTitle, gridpane, entreeTitle);
				menuBox1.setPadding(new Insets(10));
				menuBox1.setAlignment(Pos.TOP_CENTER);

				// Updates cart after pressing add to order. Shows cart with notification
				Scene scene4 = new Scene(menuBox1, 900, 900);
				primaryStage.setScene(scene4);
				primaryStage.show();

				cartNotif.setOnMouseClicked(event7 -> {
					HBox forwardBack = new HBox(25, backButton, payButton);
					forwardBack.setPadding(new Insets(10));
					forwardBack.setAlignment(Pos.TOP_CENTER);

					VBox orderTab1 = new VBox(25, orderTitle, gridpane, forwardBack);
					orderTab1.setPadding(new Insets(10));
					orderTab1.setAlignment(Pos.TOP_CENTER);

					// When cart is clicked with an item, it shows next scene with ordered item
					Scene order = new Scene(orderTab1, 900, 900);
					primaryStage.setScene(order);
					primaryStage.show();
					backButton.setOnAction(event6 -> {
						primaryStage.setScene(menuScene);
					});

				});

			});
		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}