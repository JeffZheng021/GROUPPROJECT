
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.beans.*;
import javafx.stage.Stage;


public class NetflixManagementSystem extends Application {
	
	Button userButton, tvButton, movieButton;
	Scene choiceScene, userScene, tvScene, movieScene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Choice --> user tab
		userButton = new Button("Users");
		userButton.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(event.getSource() == userButton) {
					primaryStage.setScene(userScene);
					
				}
			}
		});
		
		//Choice --> TV tab
		tvButton = new Button("TV Shows");
		tvButton.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(event.getSource() == tvButton) {
					primaryStage.setScene(tvScene);
					
				}
			}
		});
		//Choice --> TV tab
		movieButton = new Button("Movies");
		movieButton.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(event.getSource() == movieButton) {
					primaryStage.setScene(movieScene);
							
				}
			}
		});
		
		// choice Scene
		Label choice = new Label("Pick an option:");
		VBox choiceLayout = new VBox(20);
		choiceLayout.setAlignment(Pos.CENTER);
		choiceLayout.getChildren().addAll(choice, userButton, tvButton, movieButton);
		choiceScene = new Scene(choiceLayout, 600, 250);
		
				
		
		
		//start
		primaryStage.setTitle("Netflix Management System");
		primaryStage.setScene(choiceScene);
		primaryStage.show();
	}

}
