package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectionPageController {
	
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	public void toMovieDataPage(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("/MovieDataPage.fxml"));
		//Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void toUserDataPage(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("/UserDataPage.fxml"));
		//Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void toTvShowDataPage(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("/TvShowDataPage.fxml"));
		//Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
