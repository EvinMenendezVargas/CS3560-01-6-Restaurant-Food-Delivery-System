package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
//import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application  { //implements EventHandler <ActionEvent> {
	
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene1Controller.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	/*Stage stage;
	
	Scene scene1;
	Image pizzaImg;
	Button letsGo;
	VBox btnBox;
	
	Scene scene2;
	Button deliveryBtn;
	Button orderBtn;
	HBox bothBtn;
	
	Group root1 = new Group();
	Group root2 = new Group();
	@Override
	public void start(Stage primaryStage) {
		
		stage = primaryStage;
		
		scene1 = createScene1();
		scene2 = createScene2();
		
		
		stage.setScene(scene1);
		stage.show();
	}
	
	public Scene createScene1() {
		scene1 = new Scene(root1, 600, 600, Color.BLACK);
		letsGo = new Button("Lets GO!");
		
		Text welcomeTxt = new Text();
		welcomeTxt.setText("Welcome to Bronco Pizzeria!");
		welcomeTxt.setX(60);
		welcomeTxt.setY(60);
		welcomeTxt.setFont(Font.font("Verdana", 33));
		welcomeTxt.setFill(Color.WHITE);	
		
		btnBox = new VBox(600, letsGo);
		btnBox.setPadding(new Insets(10));
		btnBox.setAlignment(Pos.TOP_CENTER);
		
		root1.getChildren().add(welcomeTxt);
		root1.getChildren().add(btnBox);
		
		letsGo.setOnAction(this);
		return scene1;
	}

	public Scene createScene2() {
		scene2 = new Scene(root2, 600, 600, Color.BLACK);
		deliveryBtn = new Button("Delivery Button");
		orderBtn = new Button("Order Button");
		
		bothBtn = new HBox(100, deliveryBtn, orderBtn);
		
		root2.getChildren().add(bothBtn);
		return scene2;
	}
	
	public void switchScenes(Scene scene) {
		// TODO Auto-generated method stub
		stage.setScene(scene);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==letsGo) {
			switchScenes(scene2);
		}
	}*/
}
